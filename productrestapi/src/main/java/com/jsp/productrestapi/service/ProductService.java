
package com.jsp.productrestapi.service;

import com.jsp.productrestapi.entity.Product;
import com.jsp.productrestapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    // 1. Create product
    public Product create(Product product) {
        return repository.save(product);
    }

    // 2. Get all products
    public List<Product> getAll() {
        return repository.findAll();
    }

    // 3. Find product by ID
    public Optional<Product> getById(Long id) {
        return repository.findById(id);
    }
    // 4. Update product
    public Product update(Long id, Product updated) {

        Product existing = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Product not found: " + id));

        existing.setName(updated.getName());
        existing.setCategory(updated.getCategory());
        existing.setPrice(updated.getPrice());
        existing.setQuantity(updated.getQuantity());
        existing.setBrand(updated.getBrand());
        existing.setRating(updated.getRating());
        existing.setActive(updated.isActive());

        return repository.save(existing);
    }

    // 5. Delete product
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Product not found: " + id);
        }
        repository.deleteById(id);
    }

    // 6. Active products
    public List<Product> active() {
        return repository.findByActiveTrue();
    }

    // 7. Products by category
    public List<Product> category(String value) {
        return repository.findByCategoryIgnoreCase(value);
    }

    // 8. Products by brand
    public List<Product> brand(String value) {
        return repository.findByBrandIgnoreCase(value);
    }

    // 9. Price greater than
    public List<Product> greater(double value) {
        return repository.findByPriceGreaterThan(value);
    }

    // 10. Price less than
    public List<Product> less(double value) {
        return repository.findByPriceLessThan(value);
    }

    // 11. Price between
    public List<Product> between(double min, double max) {
        return repository.findByPriceBetween(min, max);
    }

    // 12. Search by product name
    public List<Product> keyword(String value) {
        return repository.findByNameContainingIgnoreCase(value);
    }

    // 13. Rating greater than
    public List<Product> rating(double value) {
        return repository.findByRatingGreaterThan(value);
    }

    // 14. Quantity less than
    public List<Product> lowQuantity(int value) {
        return repository.findByQuantityLessThan(value);
    }

    // 15. Out of stock
    public List<Product> outOfStock() {
        return repository.findByQuantityEquals(0);
    }

    // 16. Price ascending
    public List<Product> ascending() {
        return repository.findAllByOrderByPriceAsc();
    }

    // 17. Price descending
    public List<Product> descending() {
        return repository.findAllByOrderByPriceDesc();
    }

    // 18. Most expensive
    public Optional<Product> mostExpensive() {
        return repository.findFirstByOrderByPriceDesc();
    }

    // 19. Cheapest
    public Optional<Product> cheapest() {
        return repository.findFirstByOrderByPriceAsc();
    }

    // 20. Average price
    public Double average() {
        return repository.findAveragePrice();
    }

    // 21. Total products
    public long count() {
        return repository.count();
    }

    // 22. Total quantity
    public Long totalQuantity() {
        return repository.findTotalQuantity();
    }

    // 23. Count by category
    public List<Object[]> categoryCounts() {
        return repository.countProductsByCategory();
    }

    // 24. Average price by category
    public List<Object[]> categoryAverages() {
        return repository.averagePriceByCategory();
    }

    // 25 and 30. Highest price by category
    public List<Product> categoryMaximums() {
        return repository.findMostExpensiveByCategory();
    }

    // 26. Categories with more than 3 products
    public List<Object[]> categoriesOverThree() {
        return repository.findCategoriesWithMoreThanThreeProducts();
    }

    // 27. Products above average price
    public List<Product> aboveAverage() {
        return repository.findProductsAboveAveragePrice();
    }

    // 28. Second-highest price
    public List<Product> secondHighest() {
        return repository.findSecondHighestPricedProduct();
    }

    // 29. Top 5 expensive products
    public List<Product> topFive() {
        return repository.findTop5ByOrderByPriceDesc();
    }
}
