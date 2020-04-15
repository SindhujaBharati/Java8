package com.softvision.functionalIntefaces;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
     
	public static  void printNamesAndActivities() {
	BiConsumer<String,List<String>> biconsumer=(student,activities)->{System.out.println(student+" "+activities);};
	List<Student> studentList=StudentDataBase.getAllStudents();
	studentList.forEach(student->biconsumer.accept(student.getName(),student.getActivities()));	
	}
	
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> biconsumer =(a,b)->{
			System.out.println("a::"+a+" b:::"+b);
		};
		biconsumer.accept(10,5);
		
		BiConsumer<Integer,Integer> mulitply =(a,b)->{
			System.out.println("multiplication::"+(a*b));
		};
		
		BiConsumer<Integer,Integer> division =(a,b)->{
			System.out.println("multiplication::"+(a/b));
		};
		
		mulitply.andThen(division).accept(10, 5);
		printNamesAndActivities();
	}

}
