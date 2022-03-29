package com.basicsstrong.functional.sec10;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		
		Stream.iterate(0, i -> i+1)
		.limit(5)
		.forEach(System.out::println);
		
		IntStream.iterate(0, i -> i -1 )
		.limit(5)
		.forEach(System.out::println);
		
		Stream.generate(() -> "Hello")
		.limit(5)
		.forEach(System.out::println);
		
		Stream.generate(new Random() :: nextInt)
		.limit(5)
		.forEach(System.out::println);
		
		
	}

}