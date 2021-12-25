package com.oop.dataaccess.concretes;

import com.oop.dataaccess.abstracts.ProductDao;
import com.oop.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Hibernate Eklendi" + product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Hibernate güncellendi" + product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Hibernate silindi" + product.getName());
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
