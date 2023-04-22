package com.morris.springbootmall.dao;

import com.morris.springbootmall.dto.ProductRequest;
import com.morris.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
