package com.oracle.model.document;

import java.util.Date;

public class Document{
	private String applicationId;
	private File documentName;
	
	
	public Document(String applicationId, File documentName) {
		super();
		this.applicationId = applicationId;
		this.document = documentName;
	}
	
	public String getApplicationId() {
		return applicationId;
	}

	public File getDocumentName() {
		return documentName;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public void setDocumentName(File documentName) {
		this.documentName = documentName;
	}
}