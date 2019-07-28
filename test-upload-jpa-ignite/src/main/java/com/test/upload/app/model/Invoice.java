package com.test.upload.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_invoice")
public class Invoice implements Serializable {

	/**
	 * @author dimassulistyono
	 */
	private static final long serialVersionUID = -2748966449294631552L;

	@Id
	@GeneratedValue
	private Long invoiceId;

	private Long groupId;

	private Long companyId;
	private Long createdBy;
	private Long modifiedBy;
	private Date createdDate;
	private Date modifiedDate;

	private String distributorName;
	private String seller;
	private String hilCode;
	private String retailerCode;
	private String retailerName;
	private String invoiceNo1;
	private String channelName;
	private Date invoiceDate;
	private String invoiceNo;
	private String orderId;
	private String skuCode;
	private String skuName;
	private String batchDescription;
	private Double qtyCase;
	private Double qtyPiece;
	private Double price;
	private Double schemeAmount;
	private Double discount;
	private Double tax;
	private Double value;
	private Double volume;
	private Double billDiscount;
	private Double sihNetAmount;
	private Double textbox12;

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getHilCode() {
		return hilCode;
	}

	public void setHilCode(String hilCode) {
		this.hilCode = hilCode;
	}

	public String getRetailerCode() {
		return retailerCode;
	}

	public void setRetailerCode(String retailerCode) {
		this.retailerCode = retailerCode;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public String getInvoiceNo1() {
		return invoiceNo1;
	}

	public void setInvoiceNo1(String invoiceNo1) {
		this.invoiceNo1 = invoiceNo1;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getBatchDescription() {
		return batchDescription;
	}

	public void setBatchDescription(String batchDescription) {
		this.batchDescription = batchDescription;
	}

	public Double getQtyCase() {
		return qtyCase;
	}

	public void setQtyCase(Double qtyCase) {
		this.qtyCase = qtyCase;
	}

	public Double getQtyPiece() {
		return qtyPiece;
	}

	public void setQtyPiece(Double qtyPiece) {
		this.qtyPiece = qtyPiece;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSchemeAmount() {
		return schemeAmount;
	}

	public void setSchemeAmount(Double schemeAmount) {
		this.schemeAmount = schemeAmount;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getBillDiscount() {
		return billDiscount;
	}

	public void setBillDiscount(Double billDiscount) {
		this.billDiscount = billDiscount;
	}

	public Double getSihNetAmount() {
		return sihNetAmount;
	}

	public void setSihNetAmount(Double sihNetAmount) {
		this.sihNetAmount = sihNetAmount;
	}

	public Double getTextbox12() {
		return textbox12;
	}

	public void setTextbox12(Double textbox12) {
		this.textbox12 = textbox12;
	}

}
