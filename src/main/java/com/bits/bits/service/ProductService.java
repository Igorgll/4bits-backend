package com.bits.bits.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.bits.model.ProductModel;
import com.bits.bits.repository.ProductRepository;

@Service
public class ProductService {
    
        private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

        @Autowired
        private ProductRepository productRepository;

        public Optional<ProductModel> createProduct(ProductModel product) {
            LOGGER.info("Product sucessfully created");
            return Optional.of(productRepository.save(product));
        }
}
