package com.jsp.productrestapi.controller;

import com.jsp.productrestapi.entity.Product;
import com.jsp.productrestapi.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // 1. Create product
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }

    // 2. Get all products
    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    // 3. Get product by ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 4. Update product
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id,
                          @RequestBody Product product) {
        return service.update(id, product);
    }

    // 5. Delete product
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    // 6. Active products
    @GetMapping("/active")
    public List<Product> active() {
        return service.active();
    }

    // 7. By category
    @GetMapping("/category/{category}")
    public List<Product> category(@PathVariable String category) {
        return service.category(category);
    }

    // 8. By brand
    @GetMapping("/brand/{brand}")
    public List<Product> brand(@PathVariable String brand) {
        return service.brand(brand);
    }

    // 9. Price greater than
    @GetMapping("/price/greater-than/{price}")
    public List<Product> greater(@PathVariable double price) {
        return service.greater(price);
    }

    // 10. Price less than
    @GetMapping("/price/less-than/{price}")
    public List<Product> less(@PathVariable double price) {
        return service.less(price);
    }

    // 11. Price between min and max
    @GetMapping("/price")
    public List<Product> between(@RequestParam double min,
                                 @RequestParam double max) {
        return service.between(min, max);
    }

    // 12. Name contains keyword
    @GetMapping("/search")
    public List<Product> keyword(@RequestParam String keyword) {
        return service.keyword(keyword);
    }

    // 13. Rating greater than
    @GetMapping("/rating/greater-than/{rating}")
    public List<Product> rating(@PathVariable double rating) {
        return service.rating(rating);
    }

    // 14. Quantity less than
    @GetMapping("/quantity/less-than/{quantity}")
    public List<Product> lowQuantity(@PathVariable int quantity) {
        return service.lowQuantity(quantity);
    }

    // 15. Out of stock
    @GetMapping("/out-of-stock")
    public List<Product> outOfStock() {
        return service.outOfStock();
    }

    // 16. Price ascending
    @GetMapping("/sort/price-ascending")
    public List<Product> ascending() {
        return service.ascending();
    }

    // 17. Price descending
    @GetMapping("/sort/price-descending")
    public List<Product> descending() {
        return service.descending();
    }

    // 18. Most expensive
    @GetMapping("/most-expensive")
    public ResponseEntity<Product> mostExpensive() {
        return service.mostExpensive()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 19. Cheapest
    @GetMapping("/cheapest")
    public ResponseEntity<Product> cheapest() {
        return service.cheapest()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 20. Average price
    @GetMapping("/statistics/average-price")
    public Double average() {
        return service.average();
    }

    // 21. Total products
    @GetMapping("/statistics/count")
    public long count() {
        return service.count();
    }

    // 22. Total available quantity
    @GetMapping("/statistics/total-quantity")
    public Long totalQuantity() {
        return service.totalQuantity();
    }

    // 23. Count by category
    @GetMapping("/statistics/category-count")
    public List<Object[]> categoryCounts() {
        return service.categoryCounts();
    }

    // 24. Average price by category
    @GetMapping("/statistics/category-average-price")
    public List<Object[]> categoryAverages() {
        return service.categoryAverages();
    }

    // 25 and 30. Highest-priced product in each category
    @GetMapping("/statistics/category-maximum-price")
    public List<Product> categoryMaximums() {
        return service.categoryMaximums();
    }

    // 26. Categories with more than 3 products
    @GetMapping("/statistics/categories-over-three")
    public List<Object[]> categoriesOverThree() {
        return service.categoriesOverThree();
    }

    // 27. Products above average price
    @GetMapping("/statistics/above-average")
    public List<Product> aboveAverage() {
        return service.aboveAverage();
    }

    // 28. Second-highest price
    @GetMapping("/statistics/second-highest")
    public List<Product> secondHighest() {
        return service.secondHighest();
    }

    // 29. Top 5 expensive products
    @GetMapping("/top-5-expensive")
    public List<Product> topFive() {
        return service.topFive();
    }
}