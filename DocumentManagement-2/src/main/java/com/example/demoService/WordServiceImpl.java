package com.example.demoService;

public class WordServiceImpl extends ServiceAbstractImpl {

	@Override
	public void processData() {
		System.out.println("Process data for word");

	}

	@Override
	public String printData() {
		System.out.println("print data for word");
		return "printing word";
	}

}
