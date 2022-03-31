package com.cg.entities;

import java.time.LocalDate;

public class Product {
	private String modelNumber;
	private String producttName;
	private String productCategoryName;
	private LocalDate dateofPurchase;
	private int warrentyYears;
	private LocalDate warrantyDate;

	public Product() {
	}

	public Product(String modelNumber, String productName, String productCategoryName, LocalDate dateOfPurchase,
			int warrentyYears, LocalDate warrantyDate) {
		super();
		this.modelNumber = modelNumber;
		this.producttName = productName;
		this.productCategoryName = productCategoryName;
		this.dateofPurchase = dateOfPurchase;
		this.warrentyYears = warrentyYears;
		this.warrantyDate = warrantyDate;

	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getProducttName() {
		return producttName;
	}

	public void setProducttName(String producttName) {
		this.producttName = producttName;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public LocalDate getDateofPurchase() {
		return dateofPurchase;
	}

	public void setDateofPurchase(LocalDate dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}

	public int getWarrentyYears() {
		return warrentyYears;
	}

	public void setWarrentyYears(int warrentyYears) {
		this.warrentyYears = warrentyYears;
	}

	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
}
