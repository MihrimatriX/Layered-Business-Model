package com.oop;

import com.oop.business.abstracts.ProductService;
import com.oop.business.concretes.ProductManager;
import com.oop.core.JLoggerManagerAdapter;
import com.oop.dataaccess.concretes.AbcProductDao;
import com.oop.entities.concretes.Product;
import com.oop.jlogger.JLoggerManager;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());

        Product product = new Product(1,2, "Elma",12,50);
        productService.add(product);
    }
}
