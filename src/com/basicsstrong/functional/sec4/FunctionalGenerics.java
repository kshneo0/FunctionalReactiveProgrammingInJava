package com.basicsstrong.functional.sec4;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {
	
	R execute(T t); 
}

