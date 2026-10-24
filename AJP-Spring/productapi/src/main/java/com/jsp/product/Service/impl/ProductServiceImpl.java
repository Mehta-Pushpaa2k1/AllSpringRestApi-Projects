package com.jsp.product.Service.impl;

import com.jsp.product.Service.ProductService;
import com.jsp.product.dao.ProductRepository;
import com.jsp.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product findProductById(int id) {

        Optional<Product> op = productRepository.findById(id);

        if (op.isPresent()) {
            return op.get();
        } else {
            throw new RuntimeException("Product not found ");
        }
    }

    @Override
    public Product saveProduct(Product product) {

        return productRepository.save(product);
    }
//
//    @Override
//    public Product updateProduct(int id, Product product) {
//
//        Product existingProduct = productRepository.findById(id)
//                .orElseThrow(() ->
//                        new RuntimeException("Product not found with id: " + id)
//                );
//
//        existingProduct.setName(product.getName());
//        existingProduct.setDescription(product.getDescription());
//
//        return productRepository.save(existingProduct);
//    }
//
//    @Override
//    public void deleteProduct(int id) {
//
//        Product existingProduct = productRepository.findById(id)
//                .orElseThrow(() ->
//                        new RuntimeException("Product not found with id: " + id)
//                );
//
//        productRepository.delete(existingProduct);
//    }
}