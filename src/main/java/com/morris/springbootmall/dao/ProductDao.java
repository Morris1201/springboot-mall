package com.morris.springbootmall.dao;

import com.morris.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
