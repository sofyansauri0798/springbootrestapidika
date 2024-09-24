package com.juaracoding.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 23/09/2024 17:00
@Last Modified 23/09/2024 17:00
Version 1.0
*/

public class Akses {

    private int id;

    //    @JsonProperty("nama_akses")
    private String namaAkses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaAkses() {
        return namaAkses;
    }

    public void setNamaAkses(String namaAkses) {
        this.namaAkses = namaAkses;
    }
}
