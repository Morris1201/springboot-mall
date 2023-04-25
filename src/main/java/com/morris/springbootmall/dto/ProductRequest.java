package com.morris.springbootmall.dto;

import com.morris.springbootmall.constant.ProductCategory;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class ProductRequest {

    @NonNull
    private String productName;
    @NonNull
    private ProductCategory category;
    @NonNull
    private String imageUrl;
    @NonNull
    private Integer price;
    @NonNull
    private Integer stock;
    private String description;
}
