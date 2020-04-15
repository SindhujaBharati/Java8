package com.softvision.functionalIntefaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		Comparator<Integer> comparator=(a,b)-> a.compareTo(b);
		BinaryOperator<Integer> binOperator=(a,b)->a*b;
        System.out.println(binOperator.apply(3, 4));
        BinaryOperator<Integer> minByr=BinaryOperator.minBy(comparator);
        System.out.println(minByr.apply(3, 4));
        
        BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(3, 4));
	}

}
