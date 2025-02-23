package com.springdatajpa.springboot.Service;

import com.springdatajpa.springboot.entity.Product;
import com.springdatajpa.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getProducts () {
        return this.repository.findAll();
    }

    public Product getProduct (Long id) {
        return this.repository.findById(id).get();
    }

    public Product saveProduct (Product product) {
        return this.repository.save(product);
    }

    public List<Product> saveProducts (List<Product> products) {
        return this.repository.saveAll(products);
    }


}
