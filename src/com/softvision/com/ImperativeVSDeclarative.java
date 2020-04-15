package com.softvision.com;

import java.util.stream.IntStream;

public class ImperativeVSDeclarative {

	public static void main(String[] args) {
		//Imperative way--Before Java 8
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println("Imperative Sum:::"+sum);
		
		//After Java 8
		int sum1=IntStream.rangeClosed(0,100).sum();
		System.out.println("Declarative:;"+sum1);
	}
       
	
	
}
