package com.basicsstrong.reactive.sec03;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

public class Disposing2 {

	public static void main(String[] args) throws InterruptedException {
		
		@NonNull
		Observable<Long> src = Observable.interval(1, TimeUnit.SECONDS);
		
		src.subscribe(e -> System.out.println("Observer 1 : " + e)).dispose();		
		
		src.subscribe(e -> System.out.println("Observer 2 : " + e));
		
		Thread.sleep(10000);

	}
}
