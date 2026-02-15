package com.example.demoFactory;

import com.example.demoService.DocumentServiceInterface;
import com.example.demoService.ExcelServiceImpl;
import com.example.demoService.PdfServiceImpl;
import com.example.demoService.PowerPointServiceImpl;
import com.example.demoService.WordServiceImpl;

public class Factory {

	
	public static DocumentServiceInterface createobject(String type) {

		if ("pdf".equals(type)) {
			return new PdfServiceImpl();
			 
		}

		if ("excel".equals(type)) {
			return new ExcelServiceImpl();
			
		}
		if ("word".equals(type)) {
			return new WordServiceImpl();
			
		}
		if ("powerpoint".equals(type)) {
			return new PowerPointServiceImpl();
			
		}
	
		return null;
	}
}
