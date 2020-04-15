package com.softvision.functionalIntefaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator=(s)->s.concat("defalut");
	public static void main(String[] args) {
		System.out.print(unaryOperator.apply("java"));
	}

}
