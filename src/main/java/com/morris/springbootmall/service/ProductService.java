package com.morris.springbootmall.service;

import com.morris.springbootmall.dto.ProductRequest;
import com.morris.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer creatProduct(ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
