package com.basicsstrong.reactive.sec03;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

public class Disposing1 {

	public static void main(String[] args) throws InterruptedException {
		
		@NonNull
		Observable<Long> src = Observable.interval(1, TimeUnit.SECONDS);
		
		@NonNull
		Disposable d = src.subscribe(e -> System.out.println("Observer 1 : " + e));
		
		Thread.sleep(5000);
		
		d.dispose();
		
		src.subscribe(e -> System.out.println("Observer 2 : " + e));
		
		Thread.sleep(10000);
				
	}

}
