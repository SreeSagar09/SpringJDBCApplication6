package com.app;

public class Product {
	private Integer productId;
	private String productCode;
	private String productName;
	private Integer quantity;
	private Double price;
	
	public Product() {
		super();
	}

	public Product(Integer productId, String productCode, String productName, Integer quantity, Double price) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", productName=" + productName
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	
}
