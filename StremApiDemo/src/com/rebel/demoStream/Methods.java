package com.rebel.demoStream;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args)
	{
		
		
		
		
		//filter(Predicate:: is boolean value function which returns T or F)
		
		List<String> list = List.of("Hiren", "Rucha", "Devmurari", "blah-vlah-blah");
		List<String> newList = list.stream().filter(e -> e.length() > 5).collect(Collectors.toList());
		System.out.println(newList);
		
		
		//map(Function:: which returns function)
		/*
		 *map can update ur function and returns it  
		 * map can perform function and return it
		 * 
        */
		
		List<Integer> number = List.of(2,4,3,5,6);
		List<Integer> num = number.stream().map(i -> i*i).collect(Collectors.toList());
		 System.out.println(num);
		
		 // this is the other way we can print the function direct stream with the help of for each
		//num.stream().forEach(System.out::println);
		 
		 // sorted method 
		 number.stream().sorted().forEach(System.out::println);
		 
		 //minimum num
		 Integer a = number.stream().min((x,y) -> x.compareTo(y)).get();
		 System.out.println("min"+a);
		 
		 //maximum num
		 Integer b = number.stream().max((x,y) -> x.compareTo(y)).get();
		 System.out.println("max" + b);
		 
		

	}

}
