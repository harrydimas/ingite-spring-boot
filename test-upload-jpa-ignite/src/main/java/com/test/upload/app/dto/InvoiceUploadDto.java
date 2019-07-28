package com.test.upload.app.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.test.upload.app.model.Invoice;
import com.test.upload.ignite.model.TblInvoice;

public class InvoiceUploadDto implements Serializable {

	private static final long serialVersionUID = -2692532586718839024L;
	private int index;
	private String distName;
	private String seller;
	private String hilCode;
	private String retailerCode;
	private String retailerName;
	private String invoiceNo1;
	private String channelName;
	private String date;
	private String invoiceNo;
	private String orderId;
	private String skuCode;
	private String skuName;
	private String batch;
	private String qtyCase;
	private String qtyPiece;
	private String price;
	private String schemeAmount;
	private String discount;
	private String tax;
	private String value;
	private String volume;
	private String billDiscount;
	private String sihNetAmount;
	private String textbox12;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getQtyCase() {
		return qtyCase;
	}

	public void setQtyCase(String qtyCase) {
		this.qtyCase = qtyCase;
	}

	public String getQtyPiece() {
		return qtyPiece;
	}

	public void setQtyPiece(String qtyPiece) {
		this.qtyPiece = qtyPiece;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSchemeAmount() {
		return schemeAmount;
	}

	public void setSchemeAmount(String schemeAmount) {
		this.schemeAmount = schemeAmount;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getBillDiscount() {
		return billDiscount;
	}

	public void setBillDiscount(String billDiscount) {
		this.billDiscount = billDiscount;
	}

	public String getSihNetAmount() {
		return sihNetAmount;
	}

	public void setSihNetAmount(String sihNetAmount) {
		this.sihNetAmount = sihNetAmount;
	}

	public String getTextbox12() {
		return textbox12;
	}

	public void setTextbox12(String textbox12) {
		this.textbox12 = textbox12;
	}

	public InvoiceUploadDto() {
		super();
	}

	public InvoiceUploadDto(int index, String[] objects) {
		super();
		if (objects.length == 24) {
			this.index = index;
			this.distName = objects[0].trim();
			this.seller = objects[1].trim();
			this.hilCode = objects[2].trim();
			this.retailerCode = objects[3].trim();
			this.retailerName = objects[4].trim();
			this.invoiceNo1 = objects[5].trim();
			this.channelName = objects[6].trim();
			this.date = objects[7].trim();
			this.invoiceNo = objects[8].trim();
			this.orderId = objects[9].trim();
			this.skuCode = objects[10].trim();
			this.skuName = objects[11].trim();
			this.batch = objects[12].trim();
			this.qtyCase = objects[13].trim();
			this.qtyPiece = objects[14].trim();
			this.price = objects[15].trim();
			this.schemeAmount = objects[16].trim();
			this.discount = objects[17].trim();
			this.tax = objects[18].trim();
			this.value = objects[19].trim();
			this.volume = objects[20].trim();
			this.billDiscount = objects[21].trim();
			this.sihNetAmount = objects[22].trim();
			this.textbox12 = objects[23].trim();
		}
	}

	public Invoice parse(InvoiceUploadDto dto, Invoice invoice) throws Exception {

		invoice.setDistributorName(dto.getDistName());
		invoice.setSeller(dto.getSeller());
		invoice.setHilCode(dto.getHilCode());
		invoice.setRetailerCode(dto.getRetailerCode());
		invoice.setRetailerName(dto.getRetailerName());
		invoice.setInvoiceNo1(dto.getInvoiceNo1());
		invoice.setChannelName(dto.getChannelName());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		invoice.setInvoiceDate(dateFormat.parse(dto.getDate()));
		invoice.setInvoiceNo(dto.getInvoiceNo());
		invoice.setOrderId(dto.getOrderId());
		invoice.setSkuCode(dto.getSkuCode());
		invoice.setSkuName(dto.getSkuName());
		invoice.setBatchDescription(dto.getBatch());
		try {
			invoice.setQtyCase(Double.valueOf(dto.getQtyCase()));
		} catch (NumberFormatException e) {
			invoice.setQtyCase(0.0);
		}
		try {
			invoice.setQtyPiece(Double.valueOf(dto.getQtyPiece()));
		} catch (NumberFormatException e) {
			invoice.setQtyPiece(0.0);
		}
		try {
			invoice.setPrice(Double.valueOf(dto.getPrice()));
		} catch (NumberFormatException e) {
			invoice.setPrice(0.0);
		}
		try {
			invoice.setSchemeAmount(Double.valueOf(dto.getSchemeAmount()));
		} catch (NumberFormatException e) {
			invoice.setSchemeAmount(0.0);
		}
		try {
			invoice.setDiscount(Double.valueOf(dto.getDiscount()));
		} catch (NumberFormatException e) {
			invoice.setDiscount(0.0);
		}
		try {
			invoice.setTax(Double.valueOf(dto.getTax()));
		} catch (NumberFormatException e) {
			invoice.setTax(0.0);
		}
		try {
			invoice.setValue(Double.valueOf(dto.getValue()));
		} catch (NumberFormatException e) {
			invoice.setValue(0.0);
		}
		try {
			invoice.setVolume(Double.valueOf(dto.getVolume()));
		} catch (NumberFormatException e) {
			invoice.setVolume(0.0);
		}
		try {
			invoice.setBillDiscount(Double.valueOf(dto.getBillDiscount()));
		} catch (NumberFormatException e) {
			invoice.setBillDiscount(0.0);
		}
		try {
			invoice.setSihNetAmount(Double.valueOf(dto.getSihNetAmount()));
		} catch (NumberFormatException e) {
			invoice.setSihNetAmount(0.0);
		}
		try {
			invoice.setTextbox12(Double.valueOf(dto.getTextbox12()));
		} catch (NumberFormatException e) {
			invoice.setTextbox12(0.0);
		}

		return invoice;
	}
	
	public TblInvoice parse(InvoiceUploadDto dto, TblInvoice invoice) throws Exception {

		invoice.setDistributorName(dto.getDistName());
		invoice.setSeller(dto.getSeller());
		invoice.setHilCode(dto.getHilCode());
		invoice.setRetailerCode(dto.getRetailerCode());
		invoice.setRetailerName(dto.getRetailerName());
		invoice.setInvoiceNo1(dto.getInvoiceNo1());
		invoice.setChannelName(dto.getChannelName());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		invoice.setInvoiceDate(new Timestamp(dateFormat.parse(dto.getDate()).getTime()));
		invoice.setInvoiceNo(dto.getInvoiceNo());
		invoice.setOrderId(dto.getOrderId());
		invoice.setSkuCode(dto.getSkuCode());
		invoice.setSkuName(dto.getSkuName());
		invoice.setBatchDescription(dto.getBatch());
		try {
			invoice.setQtyCase(Double.valueOf(dto.getQtyCase()));
		} catch (NumberFormatException e) {
			invoice.setQtyCase(0.0);
		}
		try {
			invoice.setQtyPiece(Double.valueOf(dto.getQtyPiece()));
		} catch (NumberFormatException e) {
			invoice.setQtyPiece(0.0);
		}
		try {
			invoice.setPrice(Double.valueOf(dto.getPrice()));
		} catch (NumberFormatException e) {
			invoice.setPrice(0.0);
		}
		try {
			invoice.setSchemeAmount(Double.valueOf(dto.getSchemeAmount()));
		} catch (NumberFormatException e) {
			invoice.setSchemeAmount(0.0);
		}
		try {
			invoice.setDiscount(Double.valueOf(dto.getDiscount()));
		} catch (NumberFormatException e) {
			invoice.setDiscount(0.0);
		}
		try {
			invoice.setTax(Double.valueOf(dto.getTax()));
		} catch (NumberFormatException e) {
			invoice.setTax(0.0);
		}
		try {
			invoice.setValue(Double.valueOf(dto.getValue()));
		} catch (NumberFormatException e) {
			invoice.setValue(0.0);
		}
		try {
			invoice.setVolume(Double.valueOf(dto.getVolume()));
		} catch (NumberFormatException e) {
			invoice.setVolume(0.0);
		}
		try {
			invoice.setBillDiscount(Double.valueOf(dto.getBillDiscount()));
		} catch (NumberFormatException e) {
			invoice.setBillDiscount(0.0);
		}
		try {
			invoice.setSihNetAmount(Double.valueOf(dto.getSihNetAmount()));
		} catch (NumberFormatException e) {
			invoice.setSihNetAmount(0.0);
		}
		try {
			invoice.setTextbox12(Double.valueOf(dto.getTextbox12()));
		} catch (NumberFormatException e) {
			invoice.setTextbox12(0.0);
		}

		return invoice;
	}
	
	@Override
	public String toString() {
		return "InvoiceUploadDto [distributorName = " + distName + ", seller = " + seller + "," + "retailerCode = "
				+ retailerCode + ", retailerName = " + retailerName + ", invoiceNo1 = " + invoiceNo1 + ","
				+ "channelName = " + channelName + ", skuCode = " + skuCode + ", invoiceNo = " + invoiceNo + ","
				+ "orderId = " + orderId + ", skuCode = " + skuCode + ", skuName = " + skuName + "," + "batch = "
				+ batch + ", qtyCase = " + qtyCase + ", qtyPiece = " + qtyPiece + "," + "price = " + price
				+ ", schemeAmount = " + schemeAmount + ", discount = " + discount + "," + "tax = " + tax + ", value = "
				+ value + ", volume = " + volume + "," + "billDiscount = " + billDiscount + ", sihNetAmount = "
				+ sihNetAmount + ", textBox12 = " + textbox12 + "]";

	}
}