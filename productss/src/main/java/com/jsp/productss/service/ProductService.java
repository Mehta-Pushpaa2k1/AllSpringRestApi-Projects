package com.jsp.productss.service;

import com.jsp.productss.model.Product;

import java.util.List;

public interface ProductService {

    // 1. POST: Save a new product
    Product saveProduct(Product product);

    //2. GET: Fetch all products
    List<Product> getAllProducts();
}
