package com.juaracoding.controller;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 23/09/2024 17:00
@Last Modified 23/09/2024 17:00
Version 1.0
*/

import com.juaracoding.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PanggilController {


//    @GetMapping("/v1/contoh/1")
//    public String dataContoh(){
//
//        String strContoh = ContohConfig.getFlagContoh();
//        String strContohLain = ContohConfig.getFlagContohLain();
//
//        return "VALUE CONTOH : "+ strContoh +" -- VALUE CONTOH LAIN : "+ strContohLain;
//    }
//    @Value("${contoh.aja}")
//    private String strContohAja;

    @PostMapping("/contoh")
    public String save(@RequestBody User user){
//        minimal 1 huruf kecil 1 huruf besar 1 angka 1 spesial karakter $_@!
//        panjang min 8 maks 16

//        ContohConfig.getFlagContoh()
        System.out.println(user.getAlamat());
        System.out.println(user.getEmail());
        System.out.println(user.getNama());
//        System.out.println(user.getAkses().getId());
//        System.out.println(user.getAkses().getNamaAkses());
        return user.getAlamat();
    }


    @PutMapping("/contoh/{id}/{page}/{nama}")
    public String update(
            @PathVariable(value = "nama") String strNama,
            @PathVariable(value = "id") Long id,
            @PathVariable(value = "page") Integer page,
            @RequestBody User user,
            @RequestParam(value = "p1") String strP1,
            @RequestParam(value = "p2") String strP2
    ){
        System.out.println(strNama);
        System.out.println(id);
        System.out.println(page);
        System.out.println("===================");
        System.out.println(user.getAlamat());
        System.out.println(user.getEmail());
        System.out.println(user.getNama());
//        System.out.println(user.getAkses().getId());
//        System.out.println(user.getAkses().getNamaAkses());
        System.out.println("====================");
        System.out.println(strP1);
        System.out.println(strP2);

        return user.getAlamat();
    }

    @DeleteMapping("/contoh/{id}")
    public String delete(){
        return null;
    }

    @GetMapping("/contoh")
    public String findAll(){
        System.out.println("KESINI");
        return null;
    }

    @GetMapping("/contoh/{id}")
    public String findById(){
        return null;
    }

    @GetMapping("/contoh/export")
    public String export(){
        return null;
    }

    @GetMapping("/contoh/template")
    public String getTemplate(){
        return null;
    }

    @PostMapping("/contoh/import")
    public String contohImport(){
        return null;
    }
}