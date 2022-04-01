package com.basicsstrong.reactive.sec07;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class Subjects2 {
public static void main(String[] args) throws InterruptedException {
		
		@NonNull
		Observable<Integer> src1 = Observable.just(5,10,15,20)
			.subscribeOn(Schedulers.computation());
		
		@NonNull
		Subject<Object> subject = PublishSubject.create();
		
		subject.subscribe(e -> System.out.println(e));
		subject.subscribe(e -> System.out.println("The element is "+e));
		
		src1.subscribe(subject);   //source 1
		
		Thread.sleep(9000);
		
	}
}
