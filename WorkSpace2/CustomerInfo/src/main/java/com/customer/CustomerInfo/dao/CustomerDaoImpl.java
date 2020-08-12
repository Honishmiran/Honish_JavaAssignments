package com.customer.CustomerInfo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.customer.CustomerInfo.bean.*;

public class CustomerDaoImpl implements CustomerDao{

	JdbcTemplate jdbcTemplate;
	private string id;
	
	public CustomerDaoImpl() {}
	public CustomerDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	@Override
	public List<Customer> getOne(){
		String strSelect1 = "Select * from customerinfo where id="+customer_id+"";
		List<customer> customer = jdbcTemplate.query(strSelect1, new RowMapper<Customer>() 
	}
	
}
