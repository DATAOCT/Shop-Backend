package com.dataoct.onlineshop.service;

import java.util.List;

import com.dataoct.onlineshop.entity.ProductCategory;

/**
 * Created By Dataoct Team on 3/10/2018.
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
