package com.dataoct.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataoct.onlineshop.entity.Cart;

/**
 * Created By Dataoct Team on 1/2/2019.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
