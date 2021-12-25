package com.oop.dataaccess.abstracts;

import com.oop.entities.concretes.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product getProduct(int id);
    List<Product> getProductList();
}
