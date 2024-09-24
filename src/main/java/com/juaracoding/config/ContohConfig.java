package com.juaracoding.config;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 23/09/2024 16:59
@Last Modified 23/09/2024 16:59
Version 1.0
*/

import com.juaracoding.security.Crypto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:contoh.properties")
public class ContohConfig {

    private static String flagContoh;
    private static String flagContohLain;

    public static String getFlagContoh() {
        return flagContoh;
    }

    @Value("${flag.contoh}")
    private void setFlagContoh(String flagContoh) {
        this.flagContoh = Crypto.performDecrypt(flagContoh);
    }

    public static String getFlagContohLain() {
        return flagContohLain;
    }

    @Value("${flag.contoh.lain}")
    private void setFlagContohLain(String flagContohLain) {
        this.flagContohLain = Crypto.performDecrypt(flagContohLain);
    }

    //    private static String flagContoh;
//    private static String flagContohLain;
//
//
//    public static String getFlagContoh() {
//        return flagContoh;
//    }
//
//    @Value("${flag.contoh}")
//    private void setFlagContoh(String flagContoh) {
//        this.flagContoh = Crypto.performDecrypt(flagContoh);
//    }
//
//    public static String getFlagContohLain() {
//        return flagContohLain;
//    }
//
//    @Value("${flag.contoh.lain}")
//    private void setFlagContohLain(String flagContohLain) {
//        this.flagContohLain = Crypto.performDecrypt(flagContohLain);
//    }
}
