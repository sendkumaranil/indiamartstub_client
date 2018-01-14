package com.indiamart.rest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IndiaMartRestClient {

	public static void main(String[] args) {
		IndiaMartRestClient client=new IndiaMartRestClient();
		client.getResourceCall("http://localhost:8080/indiamartrestexample/india-mart/products-category/product");
		
		Product newProduct=new Product();
		newProduct.setProductname("Dabur Chwanprash");
		newProduct.setPrice("125.00");
		newProduct.setMfgdate("01/01/2018");
		newProduct.setExpdate("12/12/2018");
		
		client.postResourceCall("http://localhost:8080/indiamartrestexample/india-mart/products-category/newproduct",newProduct);
	}

	public  void getResourceCall(String endpoint){
		URL url=null;
		HttpURLConnection urlconnection=null;
		try {
			url=new URL(endpoint);
			urlconnection=(HttpURLConnection)url.openConnection();
			urlconnection.setDoOutput(true);
			urlconnection.setRequestMethod("GET");
			urlconnection.setRequestProperty("Accept", "application/json");
			
			if(urlconnection.getResponseCode() != 200){
				throw new RuntimeException("Failed rest request:"+urlconnection.getResponseCode());
			}
			
			BufferedReader br=new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
			StringBuilder strappender=new StringBuilder();
			String str;
			while ((str = br.readLine()) != null) {
				strappender.append(str);
			}
			
			ObjectMapper mapper=new ObjectMapper();
			Product product=mapper.readValue(strappender.toString(), Product.class);
			System.out.println(product);
						
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			urlconnection.disconnect();
		}
	}
	
	public  void postResourceCall(String endpoint,Product product){
		URL url=null;
		HttpURLConnection urlconnection=null;
		try {
			url=new URL(endpoint);
			urlconnection=(HttpURLConnection)url.openConnection();
			urlconnection.setDoOutput(true);
			urlconnection.setRequestMethod("POST");
			urlconnection.setRequestProperty("Content-Type", "application/json");
			
			ObjectMapper mapper=new ObjectMapper();
			String productJsonString=mapper.writeValueAsString(product);
			
			OutputStream out=urlconnection.getOutputStream();
			out.write(productJsonString.getBytes());
			out.flush();
			
			if(urlconnection.getResponseCode() != HttpURLConnection.HTTP_CREATED){
				throw new RuntimeException("Failed create resource:"+urlconnection.getResponseCode());
			}
						
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			urlconnection.disconnect();
		}
	}
}
