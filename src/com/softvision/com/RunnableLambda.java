package com.softvision.com;

public class RunnableLambda {

	public static void main(String[] args) {
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable 1 Without Lambdas");
				System.out.println("Runnable 1");
			}};
		
			new Thread(runnable).start();
			
        Runnable runnable2=()->System.out.println("Runnable 2 With Lambdas");
        
        new Thread(runnable2).start();
        new Thread(()->System.out.println("Runnable 3 With Lambdas")).start();
	}

	
}
