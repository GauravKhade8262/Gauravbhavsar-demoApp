package com.example.demoService;

public class PdfServiceImpl extends ServiceAbstractImpl {

	@Override
	public void processData() {
		System.out.println("process data for pdf");
		
	}

	@Override
	public String printData() {
		System.out.println("Print data for pdf");
		return "print pdf";
	}

}
