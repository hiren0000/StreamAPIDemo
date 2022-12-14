package com.rebel.demoStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream1 {

	public static void main(String[] args) {
		
	// Three different ways to create a list
		
		//first but cant modify this list
		List<Integer> list1 = List.of(2, 12,1, 15, 20, 22, 24, 50, 55);
		
		
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(14);
		list2.add(18);
		list2.add(45);
		
		List<Integer> list3 = Arrays.asList(1,25,11,25,14,20,22,24,25);
		
	}

}
