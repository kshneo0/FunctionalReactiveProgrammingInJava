package com.basicsstrong.functional.sec09;

public class FactoryMethodPattern {

	public static void main(String[] args) {
		
		Flooring floor = FlooringFactory.getFlooring(13, 46);
		floor.installation();

	}
}
