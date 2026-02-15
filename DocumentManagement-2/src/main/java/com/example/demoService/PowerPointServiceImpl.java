package com.example.demoService;

public class PowerPointServiceImpl extends ServiceAbstractImpl{

	@Override
	public void processData() {
		System.out.println("processing data for powerpoint");
		System.out.println("processing data for power");
		
	}

	@Override
	public String printData() {
		System.out.println("printing powerpoint");
		return "power point";
	} 

}
