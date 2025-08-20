package com.productapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product 
{
	private String  productName;
	private  int productId; 
	private String  brand;
	private String  category;
	private double  price;
	

}
