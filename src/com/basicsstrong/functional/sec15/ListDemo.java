package com.basicsstrong.functional.sec15;

import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		ListFun<Integer> list = ListFun.list(3, 6, 9);
		list.forEach(System.out::println);
		
		System.out.println("----------1----------");

		ListFun<Integer> newList = list.addEle(56);
		newList.forEach(System.out::println);
		
		System.out.println("---------2----------");

		ListFun<Integer> removeEle = newList.removeEle(9);
		removeEle.forEach(System.out::println);
	
		System.out.println("---------3-----------");
		
		ListFun<Integer> reverseList = removeEle.reverseList();
		reverseList.forEach(System.out::println);
		
		System.out.println("----------4----------");

		ListFun<Integer> list1 = ListFun.list(3, 6, 9, 8);
		ListFun<Integer> list2 = ListFun.list(35, 78, 90);

		ListFun.concat(list1, list2).forEach(System.out::println);

		System.out.println("---------5-----------");

		List<Integer> l = List.of(2, 5, 8, 6);
		list1.addAllEle(l).forEach(System.out::println);
	}

}