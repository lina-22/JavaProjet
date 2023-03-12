package com.example.springBootSecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors()
                .and().csrf().disable().exceptionHandling()
                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().authorizeHttpRequests().requestMatchers("/api/product").permitAll()
                .requestMatchers("/api/login").permitAll()
                .anyRequest().authenticated();


        return http.build();

    }

}
//csrf Microservice project ar kun kun project ar sathe sorasori excess korta parbo
//micrpservice payment/businesslogic/ controller alada alada korla thake microservice project bola,
