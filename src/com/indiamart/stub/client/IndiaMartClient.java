package com.indiamart.stub.client;

import java.util.List;

import com.anil.indiamart.resource.Product;
import com.anil.indiamart.resource.ProductCatelogImpl;
import com.anil.indiamart.resource.ProductCatelogImplService;

public class IndiaMartClient {

	public static void main(String[] args) {

		ProductCatelogImplService prodservice=new ProductCatelogImplService();
		ProductCatelogImpl indiamrt_stub= prodservice.getProductCatelogImplPort();
		List<String> products=indiamrt_stub.getProductDetails();
		for(String product:products){
			System.out.println(product);
		}
		Product item=indiamrt_stub.getProduct();
		System.out.println("--------------------------");
		System.out.println("Item name: "+item.getProductname());
		System.out.println("Price: "+item.getPrice());
		System.out.println("Mfg Date: "+item.getMfgdate());
		System.out.println("Exp Date: "+item.getExpdate());
	}

}
