package com.rebel.demoStream;

import java.util.stream.Stream;

public class StreamObject 
{	
	public static void main(String [] args)
	{
		
	//we can get empty object of Stream
	Stream<Object> emptyStream =Stream.empty();
	
	String names[] = {"Hiren", "Rucha", "Ruhi"};
	
	//we can also print the value using for loop but here
	// I am gonna use Stream aPI
	
	Stream<String> stream1 = Stream.of(names);
	
	stream1.forEach(e -> {
		System.out.println(e);
	});
	
	
	
		
	}

}
