package com.onlinebookshop.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onlinebookshop.shop.model.Author;
import com.onlinebookshop.shop.model.Book;
import com.onlinebookshop.shop.model.Order;

@Configuration
public class AppConfig {
	@Bean
	public Author author1() {
		return new Author(1,"Craig","USA");
	}
	@Bean
	public Author author2() {
		return new Author(2,"John","UK");
	}
	@Bean
	public Book book1() {
		return new Book(1,"Spring Boot in action",29.99,1);
	}
	@Bean
	public Book book2() {
		return new Book(2,"Microservices with spring boot",34.99,3);
	}
	@Bean
	public Order order1() {
		return new Order(1,5,34);
	}
	@Bean
	public Order order2() {
		return new Order(3,7,35);
	}
}
