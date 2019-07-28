package com.test.upload.ignite.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * TblInvoice definition.
 * 
 * This file was generated by Ignite Web Console (10/24/2018, 11:35)
 **/
public class TblInvoice implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;
    
    private Long invoiceId;

    /** Value for batchDescription. */
    private String batchDescription;

    /** Value for billDiscount. */
    private Double billDiscount;

    /** Value for channelName. */
    private String channelName;

    /** Value for companyId. */
    private Long companyId;

    /** Value for createdBy. */
    private Long createdBy;

    /** Value for createdDate. */
    private Timestamp createdDate;

    /** Value for discount. */
    private Double discount;

    /** Value for distributorName. */
    private String distributorName;

    /** Value for groupId. */
    private Long groupId;

    /** Value for hilCode. */
    private String hilCode;

    /** Value for invoiceDate. */
    private Timestamp invoiceDate;

    /** Value for invoiceNo. */
    private String invoiceNo;

    /** Value for invoiceNo1. */
    private String invoiceNo1;

    /** Value for modifiedBy. */
    private Long modifiedBy;

    /** Value for modifiedDate. */
    private Timestamp modifiedDate;

    /** Value for orderId. */
    private String orderId;

    /** Value for price. */
    private Double price;

    /** Value for qtyCase. */
    private Double qtyCase;

    /** Value for qtyPiece. */
    private Double qtyPiece;

    /** Value for retailerCode. */
    private String retailerCode;

    /** Value for retailerName. */
    private String retailerName;

    /** Value for schemeAmount. */
    private Double schemeAmount;

    /** Value for seller. */
    private String seller;

    /** Value for sihNetAmount. */
    private Double sihNetAmount;

    /** Value for skuCode. */
    private String skuCode;

    /** Value for skuName. */
    private String skuName;

    /** Value for tax. */
    private Double tax;

    /** Value for textbox12. */
    private Double textbox12;

    /** Value for value. */
    private Double value;

    /** Value for volume. */
    private Double volume;

    /** Empty constructor. **/
    public TblInvoice() {
        // No-op.
    }

    /** Full constructor. **/
    public TblInvoice(Long invoiceId, 
    	String batchDescription,
        Double billDiscount,
        String channelName,
        Long companyId,
        Long createdBy,
        Timestamp createdDate,
        Double discount,
        String distributorName,
        Long groupId,
        String hilCode,
        Timestamp invoiceDate,
        String invoiceNo,
        String invoiceNo1,
        Long modifiedBy,
        Timestamp modifiedDate,
        String orderId,
        Double price,
        Double qtyCase,
        Double qtyPiece,
        String retailerCode,
        String retailerName,
        Double schemeAmount,
        String seller,
        Double sihNetAmount,
        String skuCode,
        String skuName,
        Double tax,
        Double textbox12,
        Double value,
        Double volume) {
    	this.invoiceId = invoiceId;
        this.batchDescription = batchDescription;
        this.billDiscount = billDiscount;
        this.channelName = channelName;
        this.companyId = companyId;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.discount = discount;
        this.distributorName = distributorName;
        this.groupId = groupId;
        this.hilCode = hilCode;
        this.invoiceDate = invoiceDate;
        this.invoiceNo = invoiceNo;
        this.invoiceNo1 = invoiceNo1;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.orderId = orderId;
        this.price = price;
        this.qtyCase = qtyCase;
        this.qtyPiece = qtyPiece;
        this.retailerCode = retailerCode;
        this.retailerName = retailerName;
        this.schemeAmount = schemeAmount;
        this.seller = seller;
        this.sihNetAmount = sihNetAmount;
        this.skuCode = skuCode;
        this.skuName = skuName;
        this.tax = tax;
        this.textbox12 = textbox12;
        this.value = value;
        this.volume = volume;
    }

    public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	/**
     * Gets batchDescription
     * 
     * @return Value for batchDescription.
     **/
    public String getBatchDescription() {
        return batchDescription;
    }

    /**
     * Sets batchDescription
     * 
     * @param batchDescription New value for batchDescription.
     **/
    public void setBatchDescription(String batchDescription) {
        this.batchDescription = batchDescription;
    }

    /**
     * Gets billDiscount
     * 
     * @return Value for billDiscount.
     **/
    public Double getBillDiscount() {
        return billDiscount;
    }

    /**
     * Sets billDiscount
     * 
     * @param billDiscount New value for billDiscount.
     **/
    public void setBillDiscount(Double billDiscount) {
        this.billDiscount = billDiscount;
    }

    /**
     * Gets channelName
     * 
     * @return Value for channelName.
     **/
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets channelName
     * 
     * @param channelName New value for channelName.
     **/
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * Gets companyId
     * 
     * @return Value for companyId.
     **/
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * Sets companyId
     * 
     * @param companyId New value for companyId.
     **/
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * Gets createdBy
     * 
     * @return Value for createdBy.
     **/
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets createdBy
     * 
     * @param createdBy New value for createdBy.
     **/
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets createdDate
     * 
     * @return Value for createdDate.
     **/
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets createdDate
     * 
     * @param createdDate New value for createdDate.
     **/
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets discount
     * 
     * @return Value for discount.
     **/
    public Double getDiscount() {
        return discount;
    }

    /**
     * Sets discount
     * 
     * @param discount New value for discount.
     **/
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * Gets distributorName
     * 
     * @return Value for distributorName.
     **/
    public String getDistributorName() {
        return distributorName;
    }

    /**
     * Sets distributorName
     * 
     * @param distributorName New value for distributorName.
     **/
    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    /**
     * Gets groupId
     * 
     * @return Value for groupId.
     **/
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets groupId
     * 
     * @param groupId New value for groupId.
     **/
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * Gets hilCode
     * 
     * @return Value for hilCode.
     **/
    public String getHilCode() {
        return hilCode;
    }

    /**
     * Sets hilCode
     * 
     * @param hilCode New value for hilCode.
     **/
    public void setHilCode(String hilCode) {
        this.hilCode = hilCode;
    }

    /**
     * Gets invoiceDate
     * 
     * @return Value for invoiceDate.
     **/
    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets invoiceDate
     * 
     * @param invoiceDate New value for invoiceDate.
     **/
    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * Gets invoiceNo
     * 
     * @return Value for invoiceNo.
     **/
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets invoiceNo
     * 
     * @param invoiceNo New value for invoiceNo.
     **/
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Gets invoiceNo1
     * 
     * @return Value for invoiceNo1.
     **/
    public String getInvoiceNo1() {
        return invoiceNo1;
    }

    /**
     * Sets invoiceNo1
     * 
     * @param invoiceNo1 New value for invoiceNo1.
     **/
    public void setInvoiceNo1(String invoiceNo1) {
        this.invoiceNo1 = invoiceNo1;
    }

    /**
     * Gets modifiedBy
     * 
     * @return Value for modifiedBy.
     **/
    public Long getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets modifiedBy
     * 
     * @param modifiedBy New value for modifiedBy.
     **/
    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Gets modifiedDate
     * 
     * @return Value for modifiedDate.
     **/
    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets modifiedDate
     * 
     * @param modifiedDate New value for modifiedDate.
     **/
    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Gets orderId
     * 
     * @return Value for orderId.
     **/
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets orderId
     * 
     * @param orderId New value for orderId.
     **/
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Gets price
     * 
     * @return Value for price.
     **/
    public Double getPrice() {
        return price;
    }

    /**
     * Sets price
     * 
     * @param price New value for price.
     **/
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Gets qtyCase
     * 
     * @return Value for qtyCase.
     **/
    public Double getQtyCase() {
        return qtyCase;
    }

    /**
     * Sets qtyCase
     * 
     * @param qtyCase New value for qtyCase.
     **/
    public void setQtyCase(Double qtyCase) {
        this.qtyCase = qtyCase;
    }

    /**
     * Gets qtyPiece
     * 
     * @return Value for qtyPiece.
     **/
    public Double getQtyPiece() {
        return qtyPiece;
    }

    /**
     * Sets qtyPiece
     * 
     * @param qtyPiece New value for qtyPiece.
     **/
    public void setQtyPiece(Double qtyPiece) {
        this.qtyPiece = qtyPiece;
    }

    /**
     * Gets retailerCode
     * 
     * @return Value for retailerCode.
     **/
    public String getRetailerCode() {
        return retailerCode;
    }

    /**
     * Sets retailerCode
     * 
     * @param retailerCode New value for retailerCode.
     **/
    public void setRetailerCode(String retailerCode) {
        this.retailerCode = retailerCode;
    }

    /**
     * Gets retailerName
     * 
     * @return Value for retailerName.
     **/
    public String getRetailerName() {
        return retailerName;
    }

    /**
     * Sets retailerName
     * 
     * @param retailerName New value for retailerName.
     **/
    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    /**
     * Gets schemeAmount
     * 
     * @return Value for schemeAmount.
     **/
    public Double getSchemeAmount() {
        return schemeAmount;
    }

    /**
     * Sets schemeAmount
     * 
     * @param schemeAmount New value for schemeAmount.
     **/
    public void setSchemeAmount(Double schemeAmount) {
        this.schemeAmount = schemeAmount;
    }

    /**
     * Gets seller
     * 
     * @return Value for seller.
     **/
    public String getSeller() {
        return seller;
    }

    /**
     * Sets seller
     * 
     * @param seller New value for seller.
     **/
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * Gets sihNetAmount
     * 
     * @return Value for sihNetAmount.
     **/
    public Double getSihNetAmount() {
        return sihNetAmount;
    }

    /**
     * Sets sihNetAmount
     * 
     * @param sihNetAmount New value for sihNetAmount.
     **/
    public void setSihNetAmount(Double sihNetAmount) {
        this.sihNetAmount = sihNetAmount;
    }

    /**
     * Gets skuCode
     * 
     * @return Value for skuCode.
     **/
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * Sets skuCode
     * 
     * @param skuCode New value for skuCode.
     **/
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    /**
     * Gets skuName
     * 
     * @return Value for skuName.
     **/
    public String getSkuName() {
        return skuName;
    }

    /**
     * Sets skuName
     * 
     * @param skuName New value for skuName.
     **/
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * Gets tax
     * 
     * @return Value for tax.
     **/
    public Double getTax() {
        return tax;
    }

    /**
     * Sets tax
     * 
     * @param tax New value for tax.
     **/
    public void setTax(Double tax) {
        this.tax = tax;
    }

    /**
     * Gets textbox12
     * 
     * @return Value for textbox12.
     **/
    public Double getTextbox12() {
        return textbox12;
    }

    /**
     * Sets textbox12
     * 
     * @param textbox12 New value for textbox12.
     **/
    public void setTextbox12(Double textbox12) {
        this.textbox12 = textbox12;
    }

    /**
     * Gets value
     * 
     * @return Value for value.
     **/
    public Double getValue() {
        return value;
    }

    /**
     * Sets value
     * 
     * @param value New value for value.
     **/
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets volume
     * 
     * @return Value for volume.
     **/
    public Double getVolume() {
        return volume;
    }

    /**
     * Sets volume
     * 
     * @param volume New value for volume.
     **/
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof TblInvoice))
            return false;
        
        TblInvoice that = (TblInvoice)o;
        
        if (invoiceId != null ? !invoiceId.equals(that.invoiceId) : that.invoiceId != null)
        	return false;

        if (batchDescription != null ? !batchDescription.equals(that.batchDescription) : that.batchDescription != null)
            return false;
        

        if (billDiscount != null ? !billDiscount.equals(that.billDiscount) : that.billDiscount != null)
            return false;
        

        if (channelName != null ? !channelName.equals(that.channelName) : that.channelName != null)
            return false;
        

        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null)
            return false;
        

        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null)
            return false;
        

        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null)
            return false;
        

        if (discount != null ? !discount.equals(that.discount) : that.discount != null)
            return false;
        

        if (distributorName != null ? !distributorName.equals(that.distributorName) : that.distributorName != null)
            return false;
        

        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null)
            return false;
        

        if (hilCode != null ? !hilCode.equals(that.hilCode) : that.hilCode != null)
            return false;
        

        if (invoiceDate != null ? !invoiceDate.equals(that.invoiceDate) : that.invoiceDate != null)
            return false;
        

        if (invoiceNo != null ? !invoiceNo.equals(that.invoiceNo) : that.invoiceNo != null)
            return false;
        

        if (invoiceNo1 != null ? !invoiceNo1.equals(that.invoiceNo1) : that.invoiceNo1 != null)
            return false;
        

        if (modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null)
            return false;
        

        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null)
            return false;
        

        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null)
            return false;
        

        if (price != null ? !price.equals(that.price) : that.price != null)
            return false;
        

        if (qtyCase != null ? !qtyCase.equals(that.qtyCase) : that.qtyCase != null)
            return false;
        

        if (qtyPiece != null ? !qtyPiece.equals(that.qtyPiece) : that.qtyPiece != null)
            return false;
        

        if (retailerCode != null ? !retailerCode.equals(that.retailerCode) : that.retailerCode != null)
            return false;
        

        if (retailerName != null ? !retailerName.equals(that.retailerName) : that.retailerName != null)
            return false;
        

        if (schemeAmount != null ? !schemeAmount.equals(that.schemeAmount) : that.schemeAmount != null)
            return false;
        

        if (seller != null ? !seller.equals(that.seller) : that.seller != null)
            return false;
        

        if (sihNetAmount != null ? !sihNetAmount.equals(that.sihNetAmount) : that.sihNetAmount != null)
            return false;
        

        if (skuCode != null ? !skuCode.equals(that.skuCode) : that.skuCode != null)
            return false;
        

        if (skuName != null ? !skuName.equals(that.skuName) : that.skuName != null)
            return false;
        

        if (tax != null ? !tax.equals(that.tax) : that.tax != null)
            return false;
        

        if (textbox12 != null ? !textbox12.equals(that.textbox12) : that.textbox12 != null)
            return false;
        

        if (value != null ? !value.equals(that.value) : that.value != null)
            return false;
        

        if (volume != null ? !volume.equals(that.volume) : that.volume != null)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = batchDescription != null ? batchDescription.hashCode() : 0;

        res = 31 * res + (invoiceId != null ? invoiceId.hashCode() : 0);
        
        res = 31 * res + (billDiscount != null ? billDiscount.hashCode() : 0);

        res = 31 * res + (channelName != null ? channelName.hashCode() : 0);

        res = 31 * res + (companyId != null ? companyId.hashCode() : 0);

        res = 31 * res + (createdBy != null ? createdBy.hashCode() : 0);

        res = 31 * res + (createdDate != null ? createdDate.hashCode() : 0);

        res = 31 * res + (discount != null ? discount.hashCode() : 0);

        res = 31 * res + (distributorName != null ? distributorName.hashCode() : 0);

        res = 31 * res + (groupId != null ? groupId.hashCode() : 0);

        res = 31 * res + (hilCode != null ? hilCode.hashCode() : 0);

        res = 31 * res + (invoiceDate != null ? invoiceDate.hashCode() : 0);

        res = 31 * res + (invoiceNo != null ? invoiceNo.hashCode() : 0);

        res = 31 * res + (invoiceNo1 != null ? invoiceNo1.hashCode() : 0);

        res = 31 * res + (modifiedBy != null ? modifiedBy.hashCode() : 0);

        res = 31 * res + (modifiedDate != null ? modifiedDate.hashCode() : 0);

        res = 31 * res + (orderId != null ? orderId.hashCode() : 0);

        res = 31 * res + (price != null ? price.hashCode() : 0);

        res = 31 * res + (qtyCase != null ? qtyCase.hashCode() : 0);

        res = 31 * res + (qtyPiece != null ? qtyPiece.hashCode() : 0);

        res = 31 * res + (retailerCode != null ? retailerCode.hashCode() : 0);

        res = 31 * res + (retailerName != null ? retailerName.hashCode() : 0);

        res = 31 * res + (schemeAmount != null ? schemeAmount.hashCode() : 0);

        res = 31 * res + (seller != null ? seller.hashCode() : 0);

        res = 31 * res + (sihNetAmount != null ? sihNetAmount.hashCode() : 0);

        res = 31 * res + (skuCode != null ? skuCode.hashCode() : 0);

        res = 31 * res + (skuName != null ? skuName.hashCode() : 0);

        res = 31 * res + (tax != null ? tax.hashCode() : 0);

        res = 31 * res + (textbox12 != null ? textbox12.hashCode() : 0);

        res = 31 * res + (value != null ? value.hashCode() : 0);

        res = 31 * res + (volume != null ? volume.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "TblInvoice [" + 
    		"invoiceId=" + invoiceId + ", " + 
            "batchDescription=" + batchDescription + ", " + 
            "billDiscount=" + billDiscount + ", " + 
            "channelName=" + channelName + ", " + 
            "companyId=" + companyId + ", " + 
            "createdBy=" + createdBy + ", " + 
            "createdDate=" + createdDate + ", " + 
            "discount=" + discount + ", " + 
            "distributorName=" + distributorName + ", " + 
            "groupId=" + groupId + ", " + 
            "hilCode=" + hilCode + ", " + 
            "invoiceDate=" + invoiceDate + ", " + 
            "invoiceNo=" + invoiceNo + ", " + 
            "invoiceNo1=" + invoiceNo1 + ", " + 
            "modifiedBy=" + modifiedBy + ", " + 
            "modifiedDate=" + modifiedDate + ", " + 
            "orderId=" + orderId + ", " + 
            "price=" + price + ", " + 
            "qtyCase=" + qtyCase + ", " + 
            "qtyPiece=" + qtyPiece + ", " + 
            "retailerCode=" + retailerCode + ", " + 
            "retailerName=" + retailerName + ", " + 
            "schemeAmount=" + schemeAmount + ", " + 
            "seller=" + seller + ", " + 
            "sihNetAmount=" + sihNetAmount + ", " + 
            "skuCode=" + skuCode + ", " + 
            "skuName=" + skuName + ", " + 
            "tax=" + tax + ", " + 
            "textbox12=" + textbox12 + ", " + 
            "value=" + value + ", " + 
            "volume=" + volume +
        "]";
    }
}