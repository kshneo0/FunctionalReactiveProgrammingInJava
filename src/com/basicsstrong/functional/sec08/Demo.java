package com.basicsstrong.functional.sec08;

public class Demo {

	public static void main(String[] args) {
		
		int result = add(multiply(2,3) , multiply(3,4) );
//		int result = add(6 , 12 );
		System.out.println(result);
		
	}

	
	public static int add(int a, int b) {
		return a + b;
	}

	public static int multiply(int a, int b) {
		log(String.format("Returning %s as the result of %s * %s", a * b, a, b));
		return a * b;
	}

	public static void log(String m) {
		System.out.println(m);
	}

}
