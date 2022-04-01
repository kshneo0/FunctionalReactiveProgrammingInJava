package com.basicsstrong.reactive.sec09;

import java.awt.desktop.ScreenSleepEvent;
import java.util.concurrent.atomic.AtomicInteger;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class Backpressure {

	public static void main(String[] args) {
		
		Flowable.range(1, 1000000)
		.map(e -> {
			System.out.println("Produced item is : "+ e + " : "+ Thread.currentThread().getName());
			return e;
		})
		.observeOn(Schedulers.io())
		.subscribe( e -> {
			sleep(100);
			System.out.println("Consumed item is : "+ e +  " : "+ Thread.currentThread().getName());
		} );
		
		sleep(100000000);

	}

	private static void sleep(long milliseconds) {
		
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}


}