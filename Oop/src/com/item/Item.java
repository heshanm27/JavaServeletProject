package com.item;

import java.sql.Blob;

public class Item {
	
	int ItemID;
	String ItemCode;
	String ItemName;
	double Price;
	String base64Image;
	
	

	
	public Item(int id, String code, String name, double price2, String base64Image2) {
		
		
		ItemID= id;
		ItemCode = code;
		ItemName = name;
		Price = price2;
		base64Image =base64Image;
		
		// TODO Auto-generated constructor stub
	}



	public int getItemID() {
		return ItemID;
	}



	public void setItemID(int itemID) {
		ItemID = itemID;
	}



	public String getItemCode() {
		return ItemCode;
	}



	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}



	public String getItemName() {
		return ItemName;
	}



	public void setItemName(String itemName) {
		ItemName = itemName;
	}



	public double getPrice() {
		return Price;
	}



	public void setPrice(double price) {
		Price = price;
	}



	public String getBase64Image() {
		return base64Image;
	}



	public void setBase64Image(String base64Image) {
		this.base64Image = base64Image;
	}



	
	
}
