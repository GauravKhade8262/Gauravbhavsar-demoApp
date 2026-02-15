package com.example.demoService;

public abstract class ServiceAbstractImpl implements DocumentServiceInterface {

	@Override
	public void readDataFromDB() {
		System.out.println("Read data from DB");
		
	}
	public  String print() {
		
		 readDataFromDB();
		  processData();
		 return printData();	
	}



	
}
