package com.jsp.productss.repository;

import com.jsp.productss.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product,Integer> {

  List<Product> getAllProducts();

    /*
    // 6. Active products
    List<Product> findByActiveTrue();

    // 7. Products by category
    List<Product> findByCategoryIgnoreCase(String category);

    // 8. Products by brand
    List<Product> findByBrandIgnoreCase(String brand);

    // 9. Price greater than
    List<Product> findByPriceGreaterThan(BigDecimal price);

    // 10. Price less than
    List<Product> findByPriceLessThan(BigDecimal price);
*/
}
