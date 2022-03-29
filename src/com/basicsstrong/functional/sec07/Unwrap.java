package com.basicsstrong.functional.sec07;

import java.util.Optional;

public class Unwrap {

	public static void main(String[] args) {
		
		Integer a = 10;
		
		Optional<Integer> optional = Optional.of(a);
		
		//get
		//가능하면 사용하지 말것.
		Integer integerVal = optional.get();
		
		System.out.println(integerVal);
		 
		Optional<Integer> emptyOptional = Optional.empty();
		
		//emptyOptional.get();
		
		
		//isPresent
		
		//Integer val = optional.isPresent() ? optional.get() : 0 ;
		Integer val = emptyOptional.isPresent() ? emptyOptional.get() : 0 ;
		System.out.println(val);
		
		//orElse, orElseGet
		
		//orElse
		
		Integer orElse = emptyOptional.orElse(0);
		System.out.println(orElse);
		
		//orElseGet
		//성능 오버헤드가 발생할 수 있다.
		Integer orElseGet = emptyOptional.orElseGet(() -> 0 );
		System.out.println(orElseGet);
		
		//orElseThrow
		
		Integer orElseThrow = emptyOptional.orElseThrow(() -> new IllegalArgumentException());
		
		// java 10
		//orElseThrow() = get()
		
		
	}

}