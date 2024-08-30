package com.example.watchstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.watchstore.model.Product;
import com.example.watchstore.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getALLProducts(){
		return productRepository.findAll();
	}
}
