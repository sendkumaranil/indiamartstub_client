package com.indiamart.rest.client;

public class Product {

	private String productname;
	private String price;
	private String mfgdate;
	private String expdate;
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	@Override
	public String toString() {
		return "Product [productname=" + productname + ", price=" + price + ", mfgdate=" + mfgdate + ", expdate="
				+ expdate + "]";
	}	
	
	
}
