package com.jsp.product.Service;

import com.jsp.product.model.Product;

public interface ProductService {

    Product findProductById(int id);
    Product saveProduct(Product product);
//    Product updateProduct(int id, Product product);
//    Product deleteProduct(int id);


}
