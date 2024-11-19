package com.app.reposiatry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface HomeRepositary  extends JpaRepository<Product, Integer>{

}
