package com.basicsstrong.functional.sec04;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {
	
	R execute(T t); 
}

