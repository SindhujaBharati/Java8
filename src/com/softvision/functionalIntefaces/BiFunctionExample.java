package com.softvision.functionalIntefaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    
	static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> bifunction=(studentList,StudPredicate)->{
		Map<String,Double> map=new HashMap();
		studentList.forEach(student->{
			if(StudPredicate.test(student)) {
			map.put(student.getName(), student.getGpa());
			}
		});
		return map;
		
	};
	public static void main(String[] args) {
		System.out.print(bifunction.apply(StudentDataBase.getAllStudents(), PredicateExample.p1));

	}

}
