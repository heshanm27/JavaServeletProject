package com.item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class itemDbUtil {

	public static List<Item> validate(String itemname){
		
		ArrayList<Item> item = new ArrayList<Item>();
		
		
		//create dbConnetion 
		String url = "jdbc:mysql://localhost:3306/item";
		String user = "root";
		String password = "";
		
		
		//db Validate
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con  = DriverManager.getConnection(url,user,password);
			
			Statement st  = con.createStatement();
			
			String sql = "select * from item where itemName ='"+itemname+"'";
	
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				int id =rs.getInt("Item_id");
				String code = rs.getString(2);
				String Name = rs.getString(3);
				double price =rs.getDouble(4);
				
				Item  it = new Item(id,code,Name,price);
				
				item.add(it);
				
			}
			
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return item;
	}
	
	
	
	
	
}
