package com.productcatalog.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.Product;
import com.productcatalog.service.IProductCatalogService;


@RestController
@RequestMapping("/catalog-service/v1")
public class ProductCatalogController 
{
	@Autowired
	private IProductCatalogService catalogService;
	
	@GetMapping("/productcatalog")
	public List<Product> getAll()
	{		
		return catalogService.getAll();
	}
	
	//catalog-service/v1/productcatalog/category/Sports
	@GetMapping("/productcatalog/category/{category}")
	public List<Product> getByCategory( @PathVariable("category") String category)
	{
		
		return catalogService.getByCategory(category);
	}
	//catalog-service/v1/productcatalog/productId/1
	@GetMapping("/productcatalog/productId/{productId}")
	public Product getbyId(@PathVariable("productId") int productId)
	{
		Optional<Product> productopt=catalogService.getbyId(productId);
		
		
		return productopt.orElse(new Product() );
		
	}

	
}
