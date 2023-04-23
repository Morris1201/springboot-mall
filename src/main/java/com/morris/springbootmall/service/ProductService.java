package com.morris.springbootmall.service;

import com.morris.springbootmall.dto.ProductQueryParams;
import com.morris.springbootmall.dto.ProductRequest;
import com.morris.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer creatProduct(ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
