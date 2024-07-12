package com.market.Ecomerce_Market.Domain.Repository;

import com.market.Ecomerce_Market.Domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScaseProducts(int quantity);
    Optional<List<Product>> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);

}
