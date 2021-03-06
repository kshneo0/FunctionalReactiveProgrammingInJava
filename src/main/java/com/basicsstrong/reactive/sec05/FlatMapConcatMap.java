package com.basicsstrong.reactive.sec05;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public class FlatMapConcatMap {
	public static void main(String[] args) {
		
		List<String> list = List.of("Hello","Reactive","Programming");
		
		Observable.fromIterable(list)
			.flatMap(e -> Observable.fromArray(e.split("")))
			.subscribe(System.out::println);
		
		Observable.fromIterable(list)
			.concatMap(e -> Observable.fromArray(e.split("")))
			.subscribe(System.out::println);
		
	}
}
