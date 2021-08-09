package com.item;

public class Item {
	
	int ItemID;
	String ItemCode;
	String ItemName;
	double Price;
	
	
	public Item(int ItemId,String itemCode, String itemName, double price) {
		ItemID= ItemId;
		ItemCode = itemCode;
		ItemName = itemName;
		Price = price;
	}

	
	
	public int  getItemID() {
		
		return ItemID;
	}
	
	public String getItemCode() {
		return ItemCode;
	}


	public String getItemName() {
		return ItemName;
	}

	
	public double getPrice() {
		return Price;
	}


	
	
}
