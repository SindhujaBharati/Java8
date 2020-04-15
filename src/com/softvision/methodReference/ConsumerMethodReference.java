package com.softvision.methodReference;

import java.util.function.Consumer;

import com.softvision.functionalIntefaces.Student;
import com.softvision.functionalIntefaces.StudentDataBase;

public class ConsumerMethodReference {
    static Consumer<String> consumerLambda=(s)->System.out.println(s);
    static Consumer<Student> consumerRef=(s)->System.out.println(s);
    static Consumer<String> consumermethodRef=System.out::println;
    
    static Consumer<Student> consumerinstanceRef=Student::printListOfActivities;
	public static void main(String[] args) {
		consumerLambda.accept("sindhuja");
		consumermethodRef.accept("bharati");
		StudentDataBase.getAllStudents().forEach(consumerRef);
		StudentDataBase.getAllStudents().forEach(consumerinstanceRef);
	}

}
