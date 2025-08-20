package com.productinventry.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productinventry.model.Inventory;
import com.productinventry.service.IProductInventryService;

@RestController
@RequestMapping("inventory-service/v1")
public class ProductInventoryController {

	@Autowired
	private IProductInventryService inventryService;
	
	
	//   http://localhost:8083/inventory-service/v1/productinventory
	@GetMapping("/productinventory")
	List<Inventory> getAllStock()
	{
		return inventryService.getAllStock();
		}

	
	//  http://localhost:8083/inventory-service/v1/productinventory/productId/2
	
	@GetMapping("/productinventory/productId/{productId}")
	Inventory  getById(@PathVariable("productId") int productId){
		Optional<Inventory> productopt = inventryService.getById(productId);
		return productopt.orElse(new Inventory());
		
	}

}
