package com.item;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;



public class sliderDbUtill {

public static List<sliderClass> validate(){
		
		ArrayList<sliderClass> slider = new ArrayList<sliderClass>();
		
		
		//create dbConnetion 
		String url = "jdbc:mysql://localhost:3306/item";
		String user = "root";
		String password = "";
		
		
		//db Validate
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con  = DriverManager.getConnection(url,user,password);
			
			Statement st  = con.createStatement();
			
			String sql = "select * from  slider";
	
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				int id =rs.getInt(1);
				String Name = rs.getString("text");
				Blob blob  =rs.getBlob("img");
				
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
	                
	              
	                sliderClass  sliderObj = new sliderClass(id,Name,base64Image);
				
	               sliderObj.setImg(base64Image);
//				System.out.println("testing");
//						String testing=it.getBase64Image();
//						  System.out.println(testing);
				
				slider.add(sliderObj);
				
			}
			
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return slider;
	}
	
	
	
	
}
