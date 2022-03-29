package com.basicsstrong.functional.sec03;

public class LambdaPractice3 {

	public static void main(String[] args) {
		
//		LengthOfString len = str -> str.length();
		
		LengthOfString len = str -> {
			
			int l = str.length();
			
			System.out.println("The length of the given String is "+ l);
			
			return l;
			
		};
		int length = len.length("BasicsStrong");
		System.out.println(length);		
		
	}
}
