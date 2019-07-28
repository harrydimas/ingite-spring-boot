package com.test.upload.app.repository;

import javax.cache.Cache;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.Query;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;
import org.springframework.stereotype.Repository;

import com.test.upload.ignite.model.TblInvoice;

@Repository
@RepositoryConfig(cacheName = "TblInvoiceCache")
public interface InvoiceIgniteRepository extends IgniteRepository<TblInvoice, Long> {

	@Query("SELECT * FROM \"TblInvoiceCache\".tbl_invoice where invoice_no1 = ? AND sku_code = ? ")
	public Cache.Entry<Long, TblInvoice> findByInvoiceNoAndSkuCode(String invoiceNo, String skuCode);
	
}
