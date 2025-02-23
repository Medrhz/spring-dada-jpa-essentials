package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
        //@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;


    @Test
    void saveMethod () {
        // create product object
        Product product = new Product();
        product.setName("product three");
        product.setDescription("product three description");
        product.setSku("3000abc");
        product.setPrice(new BigDecimal(200));
        product.setActive(false);
        product.setImagUrl("productTwo.jpg");

        //save product into database.
        Product saveObject = this.repository.save(product);
        // display product information
        System.out.println(saveObject.getId());
        System.out.println(saveObject);
    }

    @Test
    void updateUsingSaveMethod () {
        // find or retrieve an entity by id
        Long ref = 102L;

        //update entity information
        Product product = this.repository.findById(ref).get();
        System.out.println(product);
        //save updated entity
        product.setPrice(new BigDecimal(30000));
        product.setActive(true);

        Product updateProduct = this.repository.save(product);

        // display updated entity
        System.out.println(updateProduct.getId());
        System.out.println(updateProduct);
    }

    @Test
    void findByIdMethod () {
        // find or retrieve an entity by id
        Long ref = 1L;

        //update entity information
        Product product = this.repository.findById(ref).get();
    }

    @Test
    void saveAllMethod () {

        List<Product> products = new ArrayList<Product>();

        // create product 1
        Product product = new Product();
        product.setName("product test 1");
        product.setDescription("product test 1 description");
        product.setSku("test111");
        product.setPrice(new BigDecimal(1111));
        product.setActive(true);
        product.setImagUrl("productTest1.jpg");
        // create product 2
        Product product1 = new Product();
        product1.setName("product test 2");
        product1.setDescription("product test 2 description");
        product1.setSku("test222");
        product1.setPrice(new BigDecimal(2222));
        product1.setActive(true);
        product1.setImagUrl("productTest2.jpg");
        // create product 3
        Product product2 = new Product();
        product2.setName("product test 3");
        product2.setDescription("product test 3 description");
        product2.setSku("test333");
        product2.setPrice(new BigDecimal(3333));
        product2.setActive(true);
        product2.setImagUrl("productTest3.jpg");
        products.add(product);
        products.add(product1);
        products.add(product2);

        // save all products in db
        this.repository.saveAll(products);
        // way 2
        //        this.repository.saveAll(List.of(product, product1, product2));
    }

    @Test
    void findAllMethod () {

        List<Product> products = this.repository.findAll();

        products.forEach(product -> System.out.println(product.getName()));

    }

    @Test
    void deleteByIdMethod () {
        Long ref = 101L;
        this.repository.deleteById(ref);
    }

    @Test
    void deleteMethod () {
        Long ref = 153L;
        Product product = this.repository.findById(ref).get();
        this.repository.delete(product);
    }

    @Test
    void deleteAllMethod () {
        this.repository.deleteAll();

        // way 2
        Product product = this.repository.findById(151L).get();
        Product product2 = this.repository.findById(152L).get();

        this.repository.deleteAll(List.of(product, product2));
    }

    @Test
    void countMethod () {
        Long count = this.repository.count();
        System.out.println(count);
    }

    @Test
    void existsById () {
        Long ref = 1L;
        Boolean result = this.repository.existsById(ref);
        System.out.println(result);
    }

    @Test
    void findByDateCreatedMethod () {
        // start date
        LocalDateTime startDate = LocalDateTime.of(2024, 02, 23, 17, 26, 04);
        // end date
        LocalDateTime endDate = LocalDateTime.of(2025, 02, 23, 17, 31, 15);

        // query
        List<Product> productsBetweenDate = this.repository.findByDataCreatedBetween(startDate, endDate);
        productsBetweenDate.forEach(p -> System.out.println(p.getName()));

    }

}