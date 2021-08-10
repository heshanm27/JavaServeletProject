package com.item;


import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream; 
import java.sql.PreparedStatement;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


public class itemDbUtil {

	public static List<Item> validate(){
		
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
			
			String sql = "select * from item";
	
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				int id =rs.getInt("Item_id");
				String code = rs.getString(2);
				String Name = rs.getString(3);
				double price =rs.getDouble(4);
				Blob blob  =rs.getBlob(5);
				
				 InputStream inputStream = blob.getBinaryStream();
	             ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	             byte[] buffer = new byte[4096];
	              int bytesRead = -1;
	                 
	                while ((bytesRead = inputStream.read(buffer)) != -1) {
	                    outputStream.write(buffer, 0, bytesRead);                  
	                }
	                 
	                byte[] imageBytes = outputStream.toByteArray();
	                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
				
	                inputStream.close();
	                outputStream.close();
	                
	              
				Item  it = new Item(id,code,Name,price,base64Image);
				
				it.setBase64Image(base64Image);
//				System.out.println("testing");
//						String testing=it.getBase64Image();
//						  System.out.println(testing);
				item.add(it);
				
			}
			
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return item;
	}
	
	
	
	
	
}
