package com.rebel.demoStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
 * 
 * Here we can see some of the ways to create Stream and use of that 
 * 
 */
public class StreamObject 
{	
	public static void main(String [] args)
	{
		
	//we can get empty object of Stream
		
   //1
	Stream<Object> emptyStream =Stream.empty();
	
	String names[] = {"Hiren", "Rucha", "Ruhi"};
	
	//we can also print the value using for loop but here
	// I am gonna use Stream aPI
	
  //2 with arrays
	Stream<String> stream1 = Stream.of(names);
	
	stream1.forEach(e -> {
		System.out.println(e);
	});
	
  //3 builder method to create Stream
	
     Stream<Object> emptyStream2 = Stream.builder().build();
     
     System.out.println();
     
  //4 using arrays method
     
     IntStream st =  Arrays.stream(new int[] {11,21,20,25,11});
     st.forEach(e -> 
     {
    	 System.out.println(e);
     });
	
     System.out.println();
	
  //5 list, set i means using collection frameworks
     
     List<Integer> list2 = new ArrayList<>();
		list2.add(14);
		list2.add(18);
		list2.add(45);
		
		Stream<Integer> streamList = list2.stream();
		streamList.forEach(e -> {
			System.out.println(e);
		});
		
	}

}
