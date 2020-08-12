package com.customer.CustomerInfo.dao;

import com.customer.CustomerInfo.bean;
import java.util.List;

public interface CustomerDao {
	
	Public List <Customer> getAll();
	
	public int save(Customer customer);
	public int update(Customer customer);
	public int delete(Customer customer);

}
