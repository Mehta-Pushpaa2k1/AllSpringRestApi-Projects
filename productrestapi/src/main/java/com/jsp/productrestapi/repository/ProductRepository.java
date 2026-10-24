package com.jsp.productrestapi.repository;

import com.jsp.productrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository
        extends JpaRepository<Product, Long> {

    // 6. All active products
    List<Product> findByActiveTrue();

    // 7. Products by category
    List<Product> findByCategoryIgnoreCase(String category);

    // 8. Products by brand
    List<Product> findByBrandIgnoreCase(String brand);

    // 9. Price greater than
    List<Product> findByPriceGreaterThan(double price);

    // 10. Price less than
    List<Product> findByPriceLessThan(double price);

    // 11. Price between two values
    List<Product> findByPriceBetween(double min, double max);

    // 12. Name contains keyword
    List<Product> findByNameContainingIgnoreCase(String keyword);

    // 13. Rating greater than 4.5
    List<Product> findByRatingGreaterThan(double rating);

    // 14. Quantity less than 10
    List<Product> findByQuantityLessThan(int quantity);

    // 15. Out of stock
    List<Product> findByQuantityEquals(int quantity);

    // 16. Price ascending
    List<Product> findAllByOrderByPriceAsc();

    // 17. Price descending
    List<Product> findAllByOrderByPriceDesc();

    // 18. Most expensive product
    Optional<Product> findFirstByOrderByPriceDesc();

    // 19. Cheapest product
    Optional<Product> findFirstByOrderByPriceAsc();

    // 20. Average price
    @Query("SELECT AVG(p.price) FROM Product p")
    Double findAveragePrice();

    // 21. Total number of products
    long count();

    // 22. Total available quantity
    @Query("SELECT COALESCE(SUM(p.quantity), 0) FROM Product p")
    Long findTotalQuantity();

    // 23. Number of products in each category
    @Query("SELECT p.category, COUNT(p) FROM Product p GROUP BY p.category")
    List<Object[]> countProductsByCategory();

    // 24. Average price in each category
    @Query("SELECT p.category, AVG(p.price) FROM Product p GROUP BY p.category")
    List<Object[]> averagePriceByCategory();

    // 25 and 30. Highest-priced product in each category
    @Query("""
        SELECT p FROM Product p
        WHERE p.price = (
            SELECT MAX(p2.price)
            FROM Product p2
            WHERE p2.category = p.category
        )
        """)
    List<Product> findMostExpensiveByCategory();

    // 26. Categories having more than 3 products
    @Query("""
        SELECT p.category, COUNT(p)
        FROM Product p
        GROUP BY p.category
        HAVING COUNT(p) > 3
        """)
    List<Object[]> findCategoriesWithMoreThanThreeProducts();

    // 27. Products above average price
    @Query("SELECT p FROM Product p WHERE p.price > (SELECT AVG(p2.price) FROM Product p2)")
    List<Product> findProductsAboveAveragePrice();

    // 28. Second-highest distinct price
    @Query("""
        SELECT p FROM Product p
        WHERE p.price = (
            SELECT MAX(p2.price) FROM Product p2
            WHERE p2.price < (
                SELECT MAX(p3.price) FROM Product p3
            )
        )
        """)
    List<Product> findSecondHighestPricedProduct();

    // 29. Top 5 expensive products
    List<Product> findTop5ByOrderByPriceDesc();
}