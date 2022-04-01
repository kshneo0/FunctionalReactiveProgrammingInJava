package com.basicsstrong.reactive.sec09;

import java.text.ParseException;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Conversion {

	public static void main(String[] args) throws InterruptedException, ParseException {
		
//		Observable.range(1, 1000000)
//		.toFlowable(BackpressureStrategy.BUFFER)
		Flowable.range(1, 1000000)
		.toObservable()
		.toObservable()
		.observeOn(Schedulers.io())
		.subscribe(e -> System.out.println(e+ " " +Thread.currentThread().getName() ));
		
		Thread.sleep(5000);
		
	}

}
