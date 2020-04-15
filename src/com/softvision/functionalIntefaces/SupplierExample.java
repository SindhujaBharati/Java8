package com.softvision.functionalIntefaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
  static Supplier<List<Student>> studentsupplier=()->{
	  return StudentDataBase.getAllStudents();
  };
	public static void main(String[] args) {
		
   System.out.println(studentsupplier.get());
	}

}
