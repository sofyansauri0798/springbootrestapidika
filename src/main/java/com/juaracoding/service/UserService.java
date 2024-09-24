package com.juaracoding.service;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 23/09/2024 17:04
@Last Modified 23/09/2024 17:04
Version 1.0
*/

import com.juaracoding.core.IService;
import com.juaracoding.model.User;
import com.juaracoding.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


/**
 * inventory platform code = 01
 * code module user = 07
 * fe -> 001 - 010
 * fv
 * 0107FV005
 */
@Service
public class UserService implements IService<User> {

//    @Autowired
//    UserRepo userRepo;

    @Override
    public ResponseEntity<Object> save(User user) {//001-010

//        userRepo.save(user);
        return null;
    }

    @Override
    public ResponseEntity<Object> delete(Long id, User user) {//011-020
        return null;
    }

    @Override
    public ResponseEntity<Object> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Object> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(Long id, User user) {
        return null;
    }
}

