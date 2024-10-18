package com.project.pub.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.project.pub.model.Product;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Produk A", 10000L));
        products.add(new Product(2, "Produk B", 20000L));
        products.add(new Product(3, "Produk C", 3000L));
        return products;
    }
}
