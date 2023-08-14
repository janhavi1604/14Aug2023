package com.mystream;

public class Customet {
	public Customet(int customer_id, Product product_name, float amount_paid, float payment_type, String location) {
		super();
		this.customer_id = customer_id;
		this.product_name = product_name;
		this.amount_paid = amount_paid;
		this.payment_type = payment_type;
		this.location = location;
	}
	private int customer_id;
	private Product product_name;
	private float amount_paid;
	private float payment_type;
	private String location;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public Product getProductName() {
		return product_name;
	}
	public void setProduct(Product productname) {
		this.product_name = productname;
	}
	public float getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(float amount_paid) {
		this.amount_paid = amount_paid;
	}
	public float getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(float payment_type) {
		this.payment_type = payment_type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customet [customer_id=" + customer_id + ", product=" + product_name + ", amount_paid=" + amount_paid
				+ ", payment_type=" + payment_type + ", location=" + location + "]";
	}
	

}
