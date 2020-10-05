package com.oracle.repository.loanapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.oracle.database.DatabaseConnection;
import com.oracle.model.loanapplication.LoanApplication;
import com.oracle.repository.loanapplication.impl.LoanApplicationInterface;

public class LoanApplicationRepo implements LoanApplicationInterface {

	@Override
	public LoanApplication getLoanApplicationById(String applicationId) {
		String sqlQueryString = "select * from loanApplication where application = ?";

		ResultSet resultSet = null;
		try (Connection connection = DatabaseConnection.getConnection();) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQueryString);
			preparedStatement.setString(1, applicationId);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		LoanApplication loanApplication = null;

		try {
			while (resultSet.next()) {
				String applicationIdString = resultSet.getString("applicationId");
				String customerIdString = resultSet.getString("customerId");
				int loanId = resultSet.getInt("loanId");
				double amount = resultSet.getDouble("amount");
				int repaymentTime = resultSet.getInt("repaymentTime");
				Date appliedDate = new java.util.Date(resultSet.getDate("appliedDate").getTime());
				Date approvedDate = new java.util.Date(resultSet.getDate("approvedDate").getTime());
				int applicationStatus = resultSet.getInt("applicationStatus");
				loanApplication = new LoanApplication(applicationIdString, customerIdString, loanId, amount,
						repaymentTime, approvedDate, appliedDate, applicationStatus);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loanApplication;
	}

	@Override
	public List<LoanApplication> getLoanApplicationByApprovedDate() {

		String sqlQueryString = "select * from loanApplication order by approvedDate";
		ResultSet resultSet = null;
		try (Connection connection = DatabaseConnection.getConnection();) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQueryString);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<LoanApplication> getLoanApplicationByApprovalStatus() {
		String sqlQueryString = "select * from loanApplication order by approvalStatus desc";
		ResultSet resultSet = null;
		try (Connection connection = DatabaseConnection.getConnection();) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQueryString);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int newapplication(LoanApplication loanApplication) {
		String sqlQueryString = "insert into loanApplication values(?,?,?,?,?,?,?,?)";
		int result = 0;
		try (Connection connection = DatabaseConnection.getConnection();) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQueryString);
			preparedStatement.setString(1, loanApplication.getApplicationId());
			preparedStatement.setString(2, loanApplication.getCustomerId());
			preparedStatement.setInt(3, loanApplication.getLoanId());
			preparedStatement.setDouble(4, loanApplication.getAmount());
			preparedStatement.setInt(5,loanApplication.getRepaymentTime());
			preparedStatement.setDate(6, new java.sql.Date( loanApplication.getAppliedDate().getTime() ) );
			preparedStatement.setDate(7, new java.sql.Date( loanApplication.getApprovedDate().getTime() ) );
			preparedStatement.setInt(8, loanApplication.getApplicationStatus());
			result = preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
