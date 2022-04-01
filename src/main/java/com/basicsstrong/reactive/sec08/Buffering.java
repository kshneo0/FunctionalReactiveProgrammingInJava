package com.basicsstrong.reactive.sec08;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

public class Buffering {
	public static void main(String[] args) throws InterruptedException {
		
		Observable.range(1, 30)
//		.buffer(4)
//		.buffer(4, HashSet::new)
//		.buffer(4,5)
		.buffer(4,7)
		.subscribe(System.out::println);
		
		System.out.println("--------------------------");
/*		
		Observable.interval(500, TimeUnit.MILLISECONDS)
//		.buffer(1, TimeUnit.SECONDS)
		.buffer(1, TimeUnit.SECONDS,2)
		.subscribe(System.out::println);
*/
/*		
		@NonNull
		Observable<Long> interval = Observable.interval(1, TimeUnit.SECONDS);
		
		Observable.interval(500, TimeUnit.MILLISECONDS)
		.buffer(interval)
		.subscribe(System.out::println);
*/
/*		
		@NonNull
		Observable<Long> interval = Observable.interval(500, TimeUnit.MILLISECONDS);
		
		Observable.interval(1000, TimeUnit.MILLISECONDS)
		.buffer(interval)
		.subscribe(System.out::println);
*/		
		@NonNull
		Observable<Long> interval = Observable.interval(500, TimeUnit.MILLISECONDS);
		
		Observable.interval(1000, TimeUnit.MILLISECONDS)
		.window(interval)
		.subscribe(System.out::println);
		
		Thread.sleep(8000);
		
	}
}
