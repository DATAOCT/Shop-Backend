package com.dataoct.onlineshop.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dataoct.onlineshop.entity.OrderMain;

/**
 * Created By Dataoct Team on 3/14/2018.
 */

public interface OrderService {
    Page<OrderMain> findAll(Pageable pageable);

    Page<OrderMain> findByStatus(Integer status, Pageable pageable);

    Page<OrderMain> findByBuyerEmail(String email, Pageable pageable);

    Page<OrderMain> findByBuyerPhone(String phone, Pageable pageable);

    OrderMain findOne(Long orderId);


    OrderMain finish(Long orderId);

    OrderMain cancel(Long orderId);

}
