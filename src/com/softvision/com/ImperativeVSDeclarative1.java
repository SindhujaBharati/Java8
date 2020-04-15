package com.softvision.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVSDeclarative1 {

	public static void main(String[] args) {
		
		//Imperative Style
		List<Integer> list=Arrays.asList(1,2,2,4,3,4,3,5,5,6,7,7,7,8,8,9);
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer i:list) {
			if(!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		System.out.println("list::::::::"+list);
		System.out.println("uniqueList::"+uniqueList);
		
		//Declarative Style
		
		List <Integer> uniqueList1=list.stream().distinct().collect(Collectors.toList());
		System.out.println("list deaclrative way::::::::"+list);
		System.out.println("uniqueList deaclrative way::"+uniqueList);

	}

}
