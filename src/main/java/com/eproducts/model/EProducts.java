package com.eproducts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "e_products")
public class EProducts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private int productId;
	
	@Column(name = "productBrand")
	private String productBrand;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "productPrice")
	private double productPrice;

	public EProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public EProducts(int productId, String productBrand, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productBrand = productBrand;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	
	


	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}



	@Override
	public String toString() {
		return "EProducts [productId=" + productId + ", productBrand=" + productBrand + ", productName=" + productName
				+ ", productPrice=" + productPrice + "]";
	}
	
}
