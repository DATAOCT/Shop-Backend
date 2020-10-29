package com.dataoct.onlineshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dataoct.onlineshop.entity.User;

import java.util.Collection;

/**
 * Created By Dataoct Team on 3/13/2018.
 */

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
    Collection<User> findAllByRole(String role);

}
