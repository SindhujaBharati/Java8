package com.softvision.functionalIntefaces;

import java.util.List;
import java.util.function.Consumer;

public class CosumerExample {
	 static Consumer<Student> consumerStudent=(student1)->{System.out.println(student1);};
	 static Consumer<Student> consumerStudentName=(student)->{System.out.print(student.getName());};
	 static Consumer<Student> consumerStudentActivity=(student)->{System.out.println(student.getActivities());};
	 static List<Student> studentlist=StudentDataBase.getAllStudents();
	 
     public static void printStudents() { 
    	 studentlist.forEach(consumerStudent);
     }
     
     public static void printNameAndActivities() { 	
    	 studentlist.forEach(consumerStudentName.andThen(consumerStudentActivity));
     }
     public static void printGpaAndGrade() {
    	 System.out.println("Inside Gpa And Grade");
    	 studentlist.forEach(student->{    		 
    		 if(student.getGpa()>2 && student.getGradeLevel()>2) {
    			 consumerStudentName.andThen(consumerStudentActivity).accept(student);
    		 }
    	 });
     }
     
	public static void main(String[] args) {
	
	Consumer<String> consumer=(s)->{System.out.println(s.toUpperCase());};
	
	consumer.accept("java8");
	printStudents();
	printNameAndActivities();
	printGpaAndGrade();

	}

}
