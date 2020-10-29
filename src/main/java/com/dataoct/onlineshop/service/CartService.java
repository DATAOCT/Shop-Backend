package com.dataoct.onlineshop.service;

import java.util.Collection;

import com.dataoct.onlineshop.entity.Cart;
import com.dataoct.onlineshop.entity.ProductInOrder;
import com.dataoct.onlineshop.entity.User;

/**
 * Created By Dataoct Team on 3/10/2018.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
