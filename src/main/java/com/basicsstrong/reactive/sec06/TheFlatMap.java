package com.basicsstrong.reactive.sec06;

import java.time.LocalTime;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class TheFlatMap {

	public static void main(String[] args) throws InterruptedException {

		Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
			.flatMap(e -> Observable.just(e)
			.subscribeOn(Schedulers.computation())
			.map(str -> compute(str)))
			.subscribe(System.out::println);
		
		Thread.sleep(10000);
		
	}

	public static String compute(String element) throws InterruptedException {

		String string =element + " : Printed By : " + Thread.currentThread().getName() + " at : "+ LocalTime.now();
		return string;
		
	}

}
