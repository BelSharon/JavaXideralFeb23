package com.last.v0;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		//ESTAMOS CREANDO STREAMS
		Stream<String> streamEmpty = Stream.empty();
		
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> stramOfCollection = collection.stream();
		
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		
		String[] arr = new String[] {"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);//a b c
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3); //b c
		//streamOfArrayFull.forEach(System.out::println);
		
		

	}

}
