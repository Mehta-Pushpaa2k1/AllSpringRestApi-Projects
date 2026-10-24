package com.jsp.product.controller;

import com.jsp.product.Service.impl.ProductServiceImpl;
import com.jsp.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @PostMapping("/saveproduct")
    public Product saveProduct(@RequestBody Product product) {

        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable int id) {

        return productService.findProductById(id);
    }

}