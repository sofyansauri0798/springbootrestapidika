package com.juaracoding.core;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 23/09/2024 17:00
@Last Modified 23/09/2024 17:00
Version 1.0
*/
import org.springframework.http.ResponseEntity;

public interface IService<T> {

    public ResponseEntity<Object> save(T t);//001-010
    public ResponseEntity<Object> update(Long id,T t);//011-020
    public ResponseEntity<Object> delete(Long id,T t);//021-030
    public ResponseEntity<Object> findAll();//031-040
    public ResponseEntity<Object> findById(Long id);//041-050
}
