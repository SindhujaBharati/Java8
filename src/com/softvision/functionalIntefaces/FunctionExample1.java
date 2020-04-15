package com.softvision.functionalIntefaces;

public class FunctionExample1 {
     public static String printNames() {
    	return FunctionExample.addSomeString.apply("bhaarti");
     }
	public static void main(String[] args) {
		System.out.println(printNames());

	}

}
