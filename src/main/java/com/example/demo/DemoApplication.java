package com.example.demo;

import com.example.demo.entity.ConnectionSettings;
import com.example.demo.interceptor.MyInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {
//	@Bean
//	@ConfigurationProperties(prefix = "connection1")
//	public ConnectionSettings connectionSettings(){
//		return new ConnectionSettings();
//
//	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
