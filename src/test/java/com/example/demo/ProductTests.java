package com.example.demo;

import com.example.demo.Product.Product;
import com.example.demo.Product.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class ProductTests {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    TestEntityManager entityManager;

    @Test
    public void testInsertRightProduct() {
        Product product = new Product();
        Product insertProduct = productRepository.save(product);
        Product found = entityManager.find(Product.class, insertProduct.getId());
        Assertions.assertEquals(product, found);

    }
}
