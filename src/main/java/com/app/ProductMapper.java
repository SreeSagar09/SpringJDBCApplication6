package com.app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getInt(1));
		product.setProductCode(rs.getString(2));
		product.setProductName(rs.getString(3));
		product.setQuantity(rs.getInt(4));
		product.setPrice(rs.getDouble(5));
		
		return product;
	}

}
