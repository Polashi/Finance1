package com.oracle.repository.document.impl;

import java.util.List;

import com.oracle.model.document.Document;

public interface DocumentInterface {

	public List<File> getDocumentByApplicationId(String applicationId);
	
}
