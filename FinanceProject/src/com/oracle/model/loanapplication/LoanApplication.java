package com.oracle.model.loanapplication;

import java.util.Date;

public class LoanApplication {

	private String applicationId;
	private String customerId;
	private int loanId;
	private double amount;
	private int repaymentTime;
	private Date approvedDate;
	private Date appliedDate;
	private int applicationStatus;

	public LoanApplication(String applicationId, String customerId, int loanId, double amount, int repaymentTime,
			Date approvedDate, Date appliedDate, int applicationStatus) {
		super();
		this.applicationId = applicationId;
		this.customerId = customerId;
		this.loanId = loanId;
		this.amount = amount;
		this.repaymentTime = repaymentTime;
		this.approvedDate = approvedDate;
		this.appliedDate = appliedDate;
		this.applicationStatus = applicationStatus;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public int getLoanId() {
		return loanId;
	}

	public double getAmount() {
		return amount;
	}

	public int getRepaymentTime() {
		return repaymentTime;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public int getApplicationStatus() {
		return applicationStatus;
	}

}
