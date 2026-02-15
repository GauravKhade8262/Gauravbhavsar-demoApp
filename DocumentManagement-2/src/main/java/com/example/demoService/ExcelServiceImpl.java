package com.example.demoService;

public class ExcelServiceImpl extends ServiceAbstractImpl{

	@Override
	public void processData() {
		System.out.println("Process data for Excel");
		
	}

	@Override
	public String printData() {
		System.out.println("Print data for Excel");
		return "print Excel";
	}

}
