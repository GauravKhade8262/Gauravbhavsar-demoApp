package com.example.demo.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoFactory.Factory;
import com.example.demoService.DocumentServiceInterface;

@RestController
public class DocumentControler {


	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type) {
	
		DocumentServiceInterface ds	=  Factory.createobject(type);
		  
		return ds.print();
		
	}
	
	
}
