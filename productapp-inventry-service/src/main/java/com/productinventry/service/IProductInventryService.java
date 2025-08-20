package com.productinventry.service;

import java.util.List;
import java.util.Optional;

import com.productinventry.model.Inventory;

public interface IProductInventryService {

	List<Inventory> getAllStock();
	Optional<Inventory> getById(int productId);
}
