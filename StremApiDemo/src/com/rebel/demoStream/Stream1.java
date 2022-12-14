package com.rebel.demoStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
		
		//filtering without using Stream api
		
		//taking new list for even numbers
		
		List<Integer> Even = new ArrayList();
		
		
		for(Integer i : list1)
		{
			if(i%2==0)
			{
				Even.add(i);
			}
		}
		
		System.out.println("Showing even numbers after filtering "+Even);
		
		
		//Lets try to use it StreamAPI and filter function
		
		Stream<Integer> stream =list1.stream();
		Collection<Integer> newList =stream.filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		/* we can still perform operation in one line
		we did method chaining here so we can make our code more shorter
		so in a line we can do filter and also gets the new list 
		this is helpful for reducing the length of the code 
		*/
		
		Collection<Integer> list=list1.stream().
				       filter(i -> i % 2 == 0).collect(Collectors.toList());
	}

}
