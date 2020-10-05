package com.oracle.repository.document.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.util.List;

import org.junit.jupiter.api.Test;

class DocumentInterfaceTest{

	@Test
	void testGetDocumentByApplicationId(String applicationId)
	{
		File file1 = new File();
		FileInputStream fi = new FileInputStream(file1);
		
		File file2 = new File();
		FileOutputStream fo = new FileOutputStream(file2);
		
		assertEquals(file1, );
		
		fail("Not yet implemented");
	}

}
