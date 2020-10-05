package com.oracle.repository.customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Connection;

public class CustomerRepo implements CustomerInterface{
	
	
	
	@Override
    public int newCustomer(Customer customer) {
    	String sqlQueryString = "insert into customer values(?,?,?,?,?,?,?)";
    	int result = 0;
    	try(Connection connection = DatabaseConnection.getConnection();){
    		PreparedStatement preparedStatement = connection.prepareStatement(sqlQueryString);
			preparedStatement.setString(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setInt(3, customer.getAddress());
			preparedStatement.setDouble(4, customer.getContactDetails());
			preparedStatement.setInt(5,customer.getEmail());
			preparedStatement.setInt(6,customer.getAge());
			preparedStatement.setInt(6,customer.getGender());
			result = preparedStatement.executeUpdate();	
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return result;
    };
	
    @Override
	public Customer getCustomerByApplicationId(String applicationId) {
    	String sqlQueryString = "select * from customer C join loanApplication L using(customerId) where applicationId = ?";
    	
    	ResultSet resultSet = null;
		try (Connection connection = DatabaseConnection.getConnection();) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQueryString);
			preparedStatement.setString(1, applicationId);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Customer customer = null;

		try {
			if (resultSet.next()) {
				String customerId = resultSet.getString("customerId");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String contactDetails = resultSet.getString("contactDetails");
				String email = resultSet.getString("email");
				String age = resultSet.getString("age");
				String gender = resultSet.getString("gender");
				customer = new Customer (customerId,  name, address, contactDetails,email,age,gender );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}
	
    @Override
	public Customer getCustomerByCustomerId(String customerId) {
    	
    	String sqlQueryString = "select * from customer where customerId = ?";
    	
    	ResultSet resultSet = null;
		try (Connection connection = DatabaseConnection.getConnection();) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQueryString);
			preparedStatement.setString(1, customerId);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Customer customer = null;

		try {
			if (resultSet.next()) {
				String customerId = resultSet.getString("customerId");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String contactDetails = resultSet.getString("contactDetails");
				String email = resultSet.getString("email");
				String age = resultSet.getString("age");
				String gender = resultSet.getString("gender");
				customer = new Customer (customerId,  name, address, contactDetails,email,age,gender );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}
	
    	
    };

	
	
}