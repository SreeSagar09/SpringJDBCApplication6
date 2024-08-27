package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.Product;
import com.app.ProductMapper;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
		ProductMapper productMapper = new ProductMapper();
		
		String sql1 = "select * from product p where p.product_id=?";
		Object[] arguments1 = {2};
		Product product1 = jdbcTemplate.queryForObject(sql1, arguments1, productMapper);
		System.out.println(product1);
		
		String sql2 = "update product p set p.quantity=? where p.product_id=?";
		Object[] arguments2 = {20, 2};
		int row = jdbcTemplate.update(sql2, arguments2);
		if(row>0) {
			System.out.println("Records updated successfully.");
		}
		
		Product product2 = jdbcTemplate.queryForObject(sql1, arguments1, productMapper);
		System.out.println(product2);
	}
}
