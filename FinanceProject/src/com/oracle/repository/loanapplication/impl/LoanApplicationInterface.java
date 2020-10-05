package com.oracle.repository.loanapplication.impl;

import java.util.List;

import com.oracle.model.loanapplication.LoanApplication;

public interface LoanApplicationInterface {

	public LoanApplication getLoanApplicationById(String applicationId);

	public List<LoanApplication> getLoanApplicationByApprovedDate();

	public List<LoanApplication> getLoanApplicationByApprovalStatus();

	public int newapplication(LoanApplication loanApplication);

}

