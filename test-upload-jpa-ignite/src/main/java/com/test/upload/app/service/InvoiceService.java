package com.test.upload.app.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.upload.app.dto.InvoiceUploadDto;
import com.test.upload.app.jparepository.InvoiceRepository;
import com.test.upload.app.model.Invoice;

@Service
public class InvoiceService {

	private static Logger log = LoggerFactory.getLogger(InvoiceService.class);
	
	@Autowired
	private InvoiceRepository invoiceRepository;

	public Invoice getByInvoiceNoAndSkuCode(String invoiceNo, String skuCode) {
		try {
			return invoiceRepository.findByInvoiceNoAndSkuCode(invoiceNo, skuCode);
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Invoice> getAll() {
		
		try {
			return invoiceRepository.findAll();
		} catch (Exception e) {
			log.error(e.toString());
			return Collections.emptyList();
		}
	}
	
	public void saveBulk(List<InvoiceUploadDto> dtos) {
		
		Date date = new Date();
		try {
			for(InvoiceUploadDto dto : dtos){
				log.info(dto.getIndex() + " | " + dto.getInvoiceNo1() + " | " + dto.getSkuCode());
				
				Invoice invoice = getByInvoiceNoAndSkuCode(dto.getInvoiceNo1(), dto.getSkuCode());
				if (invoice == null) {
					invoice = new Invoice();
					invoice.setCreatedDate(date);
				}
				
				invoice = new InvoiceUploadDto().parse(dto, invoice);
				
				invoice.setModifiedDate(date);
				
				invoice = invoiceRepository.save(invoice);
			}
		} catch (Exception e) {
			log.error(e.toString());
		}
	}
	
}
