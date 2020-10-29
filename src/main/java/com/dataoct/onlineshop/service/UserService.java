package com.dataoct.onlineshop.service;


import java.util.Collection;

import com.dataoct.onlineshop.entity.User;

/**
 * Created By Dataoct Team on 3/13/2018.
 */
public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
