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
import com.juaracoding.model.Akses;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AksesService implements IService<Akses> {

    @Override
    public ResponseEntity<Object> save(Akses akses) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(Long id, Akses akses) {
        return null;
    }

    @Override
    public ResponseEntity<Object> delete(Long id, Akses akses) {
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
}

