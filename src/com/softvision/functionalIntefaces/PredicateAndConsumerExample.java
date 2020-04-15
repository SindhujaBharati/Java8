package com.softvision.functionalIntefaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
	Predicate<Student> p1=(student)->student.getGpa()>3;
	Predicate<Student> p2=(student)->student.getGradeLevel()>2;
	
	BiConsumer<String,List<String>> biconsumer=(student,activities)->System.out.println(student+" "+activities);
	BiPredicate<Double,Integer> bipredicate=(gpa,grade)->gpa>3 && grade>2;
	
    Consumer<Student> consumerStudent=(student)->{
    	if(p1.and(p2).test(student)) {
    		//if(bipredicate.test(student.getGpa(), student.getGradeLevel())) {
    		biconsumer.accept(student.getName(),student.getActivities() );
    	}
    };
	
    
    public void printNameAndActivities(List<Student> stuList) {
    	stuList.forEach(consumerStudent);
    	
    }
	public static void main(String[] args) {
		List<Student> stuList=StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivities(stuList);
		
	}	

}
