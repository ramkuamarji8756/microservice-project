package com.productcatalog.service;

import java.util.List;
import java.util.Optional;

import com.productcatalog.model.Product;

public interface IProductCatalogService 
{
	List<Product> getAll();
	List<Product> getByCategory(String category);
	Optional<Product> getbyId(int productId);

}
