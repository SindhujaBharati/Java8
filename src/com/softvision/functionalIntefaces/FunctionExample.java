package com.softvision.functionalIntefaces;

import java.util.function.Function;

public class FunctionExample {
     
	static Function<String,String> function=(name)->name.toUpperCase();
	static Function<String,String> addSomeString=(name)->name.toUpperCase().concat("default");
	public static void main(String[] args) {
		
		System.out.println(function.apply("java8"));
		System.out.println(function.andThen(addSomeString).apply("sindhuja"));
		System.out.print(function.compose(addSomeString).apply("sindhuja"));
	}

}
