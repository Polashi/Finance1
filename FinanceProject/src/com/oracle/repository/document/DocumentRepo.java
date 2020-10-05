package com.oracle.repository.document;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.jni.File;

import com.oracle.database.DatabaseConnection;
import com.oracle.model.document.Document;
import com.oracle.repository.document.impl.documentInterface;

public class DocumentRepo implements DocumentInterface {
	
	
	@Override
	public List<File> getDocumentByApplicationId(String applicationId){
		String sqlQueryString = "select documentId from document where applicationId = ?";
		
		List <File> list = new ArrayList<>();
		
		
		ResultSet resultSet = null;
		try (Connection connection = DatabaseConnection.getConnection();) {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlQueryString);
			preparedStatement.setString(1, applicationId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				File documentName = resultSet.getDocumentName("documentName");
				list.add(documentName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
