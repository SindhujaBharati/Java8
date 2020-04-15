package com.softvision.methodReference;

import java.util.function.Function;

public class MethodRefExample {
	static Function<String,String> function=(s)->s.toUpperCase();
	static Function<String,String> methodRef=String::toUpperCase;
	public static void main(String[] args) {
		System.out.println(methodRef.apply("sindhuja"));
		System.out.print(function.apply("bharati"));
	}
}
