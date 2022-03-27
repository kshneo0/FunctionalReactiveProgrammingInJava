package com.basicsstrong.functional.sec3;

public class LambdaPractice3 {

	public static void main(String[] args) {
		
		LengthOfString len = str -> str.length();		
		int length = len.length("BasicsStrong");
		System.out.println(length);
		
		
	}
}
