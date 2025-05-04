package com.example.controlandstocksystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class ControlAndStockSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(ControlAndStockSystemApplication.class, args);

	}

}
