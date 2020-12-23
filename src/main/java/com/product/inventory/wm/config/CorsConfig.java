package com.product.inventory.wm.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig  {

    @Bean
    public FilterRegistrationBean<CorsFilter> corsFilter(){
    	List<String> allowedHeaders = new ArrayList<>();
    	List<String> allowedMethods = new ArrayList<>();
    	List<String> exposedHeaders = new ArrayList<>();
    	
    	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    	CorsConfiguration config = new CorsConfiguration();
    	
    	allowedHeaders.add("Content-Type");
    	allowedHeaders.add("Accept");
    	allowedHeaders.add("Content-Type");
    	allowedHeaders.add("Access-Control-Allow-Origin");
    	allowedHeaders.add("Access-Control-Allow-Headers");
    	allowedHeaders.add("Access-Control-Allow-Methods");
    	allowedHeaders.add("strict-origin-when-cross-origin");
    	allowedHeaders.add("*");
    	allowedMethods.add("GET");
    	allowedMethods.add("POST");
    	allowedMethods.add("PUT");
    	allowedMethods.add("DELETE");
    	this.addAllowedOrigins(config);
    	config.setAllowedHeaders(allowedHeaders);
    	config.setAllowedMethods(allowedMethods);
    	config.setExposedHeaders(exposedHeaders);
    	
    	source.registerCorsConfiguration("/**", config);
    	
    	final FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
    	
    	bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
    	return bean;
    	
    }
    
    public void addAllowedOrigins(CorsConfiguration config) {
    	config.setAllowedMethods(Arrays.asList("POST","GET"));
    	config.addAllowedOrigin("http://localhost:4200");
    	config.addAllowedOrigin("http://localhost:4000");
    	config.addAllowedOrigin("http://localhost:8080");
    	config.addAllowedOrigin("http://192.168.0.20:80");
    	config.addAllowedOrigin("http://192.168.0.14:80");
    	config.addAllowedOrigin("http://192.168.0.22:80");
    	config.addAllowedOrigin("http://192.168.0.22");
    	config.addAllowedOrigin("http://192.168.0.18");
    	config.addAllowedOrigin("http://73.40.201.238:80");
    	config.addAllowedOrigin("https://localhost:4200");
    }
    
}
