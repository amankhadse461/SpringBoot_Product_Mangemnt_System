package com.app.reposiatry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Product;

@Repository
public interface HomeRepositary  extends JpaRepository<Product, Integer>{

}
