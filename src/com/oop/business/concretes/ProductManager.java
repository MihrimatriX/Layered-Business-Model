package com.oop.business.concretes;

import com.oop.business.abstracts.ProductService;
import com.oop.core.LoggerService;
import com.oop.dataaccess.abstracts.ProductDao;
import com.oop.entities.concretes.Product;
import com.oop.jlogger.JLoggerManager;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("izin verilmiyor");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("eklendi : " + product.getName());

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
