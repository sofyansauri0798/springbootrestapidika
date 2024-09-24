package com.juaracoding.config;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 24/09/2024 16:48
@Last Modified 24/09/2024 16:48
Version 1.0
*/
//
//import io.swagger.v3.oas.models.Components;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import io.swagger.v3.oas.models.security.SecurityRequirement;
//import io.swagger.v3.oas.models.security.SecurityScheme;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfigOld {
//
//    /*
//        DEFAULT URL Untuk mengakses SWAGGER http://localhost:8080/swagger-ui/index.html
//     */
//    @Bean
//    public OpenAPI openAPI() {
//        return new OpenAPI().addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"))
//                .components(new Components().addSecuritySchemes("Bearer Authentication", createAPIKeyScheme()))
//                .info(new Info().title("Springboot+JPA+JWT+SQLServer")
//                        .description("BIMA HEAL THE WORLD")
//                        .version("1.0").contact(new Contact().name("Bima Prakoso").email( "bimaprakoso@gmail.com")
//                        .url("localhost:8080/api/v1"))
//                        .license(new License().name("Springboot Open Source License")
//                                .url("https://spring.io/")));
//    }
//
//    private SecurityScheme createAPIKeyScheme() {
//        return new SecurityScheme().type(SecurityScheme.Type.HTTP)
//                .bearerFormat("JWT")
//                .scheme("bearer");
//    }
//}
