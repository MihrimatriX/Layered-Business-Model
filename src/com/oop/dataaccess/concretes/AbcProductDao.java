package com.oop.dataaccess.concretes;

import com.oop.dataaccess.abstracts.ProductDao;
import com.oop.entities.concretes.Product;

import java.util.List;

public class AbcProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Abc ile eklendi" + product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product getProduct(int id) {
        return null;
    }

    @Override
    public List<Product> getProductList() {
        return null;
    }
}
