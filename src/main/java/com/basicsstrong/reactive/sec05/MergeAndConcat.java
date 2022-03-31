package com.basicsstrong.reactive.sec05;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class MergeAndConcat {

	public static void main(String[] args) throws InterruptedException {
		

		Observable<String> src1 = Observable.just("Ella","Alexa","Lily");
		Observable<String> src2 = Observable.just("Priya","Chloe");
	
		Observable.merge(src1,src2)
			.subscribe(e -> System.out.println("Received : " + e));
		
		
		Observable<String> src11 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src1 : " + e);
		Observable<String> src12 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src2 : " + e);
		
//		Observable.merge(src11,src12)
//		.subscribe(e -> System.out.println("Received : " + e));
//		
//		Thread.sleep(10000);
		
//		Observable.concat(src11,src12)
//		.subscribe(e -> System.out.println("Received : " + e));
		
		src11.concatWith(src12)
		.subscribe(e -> System.out.println("Received : " + e));
		
		Thread.sleep(20000);
	}
}
