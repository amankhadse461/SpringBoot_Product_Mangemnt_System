package com.app.service;

import java.util.List;

import com.app.model.Product;

public interface HomeService {

	void saveProduct(Product product);

	List<Product> allProducts();

}
