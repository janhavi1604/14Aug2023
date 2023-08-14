package com.mystream;

public class Product {

	public Product(String productName, float price, int quality, boolean in_stock, String store_name) {
		super();
		this.productName = productName;
		this.price = price;
		this.quality = quality;
		this.in_stock = in_stock;
		this.store_name = store_name;
	}
	private String productName;
	private float price;
	private int quality;
	private boolean in_stock;
	private String store_name;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public boolean isIn_stock() {
		return in_stock;
	}
	public void setIn_stock(boolean in_stock) {
		this.in_stock = in_stock;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", quality=" + quality + ", in_stock="
				+ in_stock + ", store_name=" + store_name + "]";
	}
	
}
