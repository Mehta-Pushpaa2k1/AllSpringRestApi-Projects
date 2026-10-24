package com.jsp.productss.controller;

import com.jsp.productss.model.Product;
import com.jsp.productss.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    // 1. Create a new product
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        product.setId(null);
        return productRepository.save(product);
    }

   // 2. Get all products
   @GetMapping
   public List<Product> getAllProducts(@Re
                                       ) {
       return productRepository.getAllProducts();
   }

}
