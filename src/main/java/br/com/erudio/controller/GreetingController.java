package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.utils.Utils;

@RestController
public class GreetingController {


	
	/**
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue= "world") String name) {
		return new Greeting(counter.getAndIncrement(), String.format(template, name));
		
	}
	
	**/
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numerid value");
		}
		Double sum = Utils.convertToDouble(numberOne) + Utils.convertToDouble(numberTwo);
		return sum;
	
	}
	
	@RequestMapping(value="/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numerid value");
		}
		Double mult = Utils.convertToDouble(numberOne) * Utils.convertToDouble(numberTwo);
		return mult;
	
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numerid value");
		}
		Double division = Utils.convertToDouble(numberOne) / Utils.convertToDouble(numberTwo);
		return division;
	
	}
	
	@RequestMapping(value="/avg/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numerid value");
		}
		Double average = (Utils.convertToDouble(numberOne) + Utils.convertToDouble(numberTwo)) / 2;
		return average;
	
	}
	
	@RequestMapping(value="/sqrt/{numberOne}", method=RequestMethod.GET)
	public Double sqrt(@PathVariable("numberOne") String numberOne) throws Exception {
		if(!Utils.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numerid value");
		}
		Double average = Math.sqrt(Utils.convertToDouble(numberOne)); 
		return average;
	
	}
	


	
}
