package com.test.upload.app.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.upload.app.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

	@Query("SELECT x FROM Invoice x where x.invoiceNo1 = ?  AND x.skuCode = ? ")
	public Invoice findByInvoiceNoAndSkuCode(String invoiceNo, String skuCode);
	
}
