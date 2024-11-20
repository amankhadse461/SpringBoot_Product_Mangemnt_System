package com.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.reposiatry.HomeRepositary;
import com.app.service.HomeService;

@Service
public class HomeServiceimp implements HomeService {

	@Autowired
	HomeRepositary hr;
	
	@Override
	public void saveProduct(Product product) {
		hr.save(product);
		
	}

	@Override
	public List<Product> allProducts() {
		return hr.findAll();
	}

	@Override
	public void deletedata(int pid) {
		hr.deleteById(pid);
		
	}

}
