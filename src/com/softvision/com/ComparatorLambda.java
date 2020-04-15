package com.softvision.com;

import java.util.Comparator;

public class ComparatorLambda {


	public static void main(String[] args) {
		
		Comparator<Integer> comparator=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
			
		};
		
		System.out.println("Result without Lambda::"+comparator.compare(3, 2));
		
		Comparator<Integer> comparator1 =(a,b)->{return a.compareTo(b);};
		System.out.println("Result with Lambda::"+comparator1.compare(3, 2));
	}
    
}
