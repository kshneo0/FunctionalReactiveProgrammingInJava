package com.basicsstrong.reactive.sec03;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

public class CreatingObservable {
	
	public static void main(String[] args) {
		
		// create
		
		Observable<Integer> source = Observable.create(
			e -> {
			e.onNext(10);
			e.onNext(11);
			e.onNext(12);
			e.onComplete();
			}
		);
		
		source.subscribe(System.out::println);
		
		System.out.println("------------------------");
		
		// just()
		Observable<Integer> just = Observable.just(1, 2, 3);
		just.subscribe(System.out::println);
		
		System.out.println("------------------------");
		
		// fromIterable
		List<String> list = List.of("Ram", "Shyam", "Mike");
		
		@NonNull
		Observable<@NonNull String> fromIterable = Observable.fromIterable(list);
		
		fromIterable.subscribe(System.out::println);
		
		System.out.println("------------------------");
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ram");
		list1.add("Mike");
		Observable<String> source1 = Observable.defer(
			() -> Observable.fromIterable(list1)
		);

		source1.subscribe(System.out::println);

		list1.add("Paul");

		source1.subscribe(System.out::println);
		
		
	}

}
