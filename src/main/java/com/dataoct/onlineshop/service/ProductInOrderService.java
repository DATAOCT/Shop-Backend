package com.dataoct.onlineshop.service;

import com.dataoct.onlineshop.entity.ProductInOrder;
import com.dataoct.onlineshop.entity.User;

/**
 * Created By Dataoct Team on 1/3/2019.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
