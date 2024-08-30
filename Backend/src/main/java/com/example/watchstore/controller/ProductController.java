package com.example.watchstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.watchstore.model.Product;
import com.example.watchstore.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1/auth")
public class ProductController {
	private final ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }
	
	@GetMapping("/get")
	public List<Product> getAlList(){
		return productService.getALLProducts();
	}
	
}
