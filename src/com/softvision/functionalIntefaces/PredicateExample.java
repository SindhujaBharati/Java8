package com.softvision.functionalIntefaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	static List<Student> list=StudentDataBase.getAllStudents();
	static Predicate<Student> p1=(student)->student.getGradeLevel()>3;
	static Predicate<Student> p2=(student)->student.getGpa()>3;
	
    public static void printGrades() {
    	System.out.println("printGrades");
    	list.forEach(student->{
    		
    		if(p1.test(student)){
    			
    			System.out.println(student);
    		}
    	});
    }
    public static void printGPA() {
    	System.out.println("printGPA");
    	list.forEach(student->{
    		
    		if(p2.test(student)){
    			
    			System.out.println(student);
    		}
    	});
    }
    public static void filterStduents() {
    	System.out.println("printGPA & printGrades");
    	list.forEach(student->{
    		
    		if(p1.and(p2).test(student)){
    			
    			System.out.println(student);
    		}
    	});
    }
	public static void main(String[] args) {
		
		Predicate<Integer> predicate=(i)-> i%2==0;
		Predicate<Integer> predicate1=(i)-> i%5==0;
        
		
		System.out.println(predicate.test(10));
		System.out.println(predicate1.test(10));
		System.out.println(predicate.and(predicate1).test(10));
		System.out.println(predicate.and(predicate1).test(8));
		System.out.println(predicate.or(predicate1).test(10));
		System.out.println(predicate.or(predicate1).test(9));
		System.out.println(predicate.or(predicate1).negate().test(10));
		System.out.println(predicate.or(predicate1).negate().test(9));
		
		printGrades();
		printGPA();
		
		printGrades();
		filterStduents();
		
	}

}
