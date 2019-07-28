package com.test.upload.app.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import javax.cache.Cache;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteAtomicSequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.upload.app.dto.InvoiceUploadDto;
import com.test.upload.app.repository.InvoiceIgniteRepository;
import com.test.upload.ignite.model.TblInvoice;

@Service
public class InvoiceIgniteService {

	private static Logger log = LoggerFactory.getLogger(InvoiceIgniteService.class);
	
	@Autowired
	private InvoiceIgniteRepository invoiceIgniteRepository;
	
	@Autowired
    private Ignite ignite;

	public Cache.Entry<Long, TblInvoice> getByInvoiceNoAndSkuCode(String invoiceNo, String skuCode) {
		try {
			return invoiceIgniteRepository.findByInvoiceNoAndSkuCode(invoiceNo, skuCode);
		} catch (Exception e) {
			log.error(e.toString());
			return null;
		
		}
	}
	
	public List<TblInvoice> getAll() {
		
		try {
			Iterable<TblInvoice> iterable = invoiceIgniteRepository.findAll();
			List<TblInvoice> invoices = new ArrayList<>();
			iterable.forEach(invoices::add);
			return invoices;
		} catch (Exception e) {
			log.error(e.toString());
			return Collections.emptyList();
		}
	}
	
	public void save(Long id, TblInvoice invoice) {
		TreeMap<Long, TblInvoice> invoices = new TreeMap<>();
		
		if (id == null || id.longValue() == 0) {
			final IgniteAtomicSequence seq = ignite.atomicSequence("invoiceSeq", 0, true);
			id = seq.incrementAndGet();
		}
		
		invoices.put(id	, invoice);
		
		invoiceIgniteRepository.save(invoices);
	}
	
	public void saveBulk(List<InvoiceUploadDto> dtos) {
		
		Date date = new Date();
		try{
			for(InvoiceUploadDto dto : dtos){
				
				log.info(dto.getIndex() + " | " + dto.getInvoiceNo1() + " | " + dto.getSkuCode());
				
				Long id = null;
				TblInvoice invoice = null; 
				Cache.Entry<Long, TblInvoice> optional = getByInvoiceNoAndSkuCode(dto.getInvoiceNo1(), dto.getSkuCode());
				if (optional != null) {
					id = optional.getKey();
					invoice = optional.getValue();
				}
				if (invoice == null) {
					invoice = new TblInvoice();
					invoice.setCreatedDate(new Timestamp(date.getTime()));
				}
				
				invoice = new InvoiceUploadDto().parse(dto, invoice);
				
				invoice.setModifiedDate(new Timestamp(date.getTime()));
				
				save(id, invoice);
			}
		} catch(Exception e) {
			log.error(e.toString());
		}
	}
	
}
