package com.basicsstrong.reactive.sec07;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class Subjects {

	public static void main(String[] args) throws InterruptedException {
		
		@NonNull
		Observable<Integer> src1 = Observable.just(5,10,15,20);		
		Observable<Integer> src2 = Observable.just(50,100,150,200);
		
//		src1.subscribe(e -> System.out.println(e));		
//		src2.subscribe(e -> System.out.println(e));	
		
		@NonNull
		Subject<Object> subject = PublishSubject.create();
		
		subject.subscribe(e -> System.out.println(e));  //Observer 1
		
		src1.subscribe(subject);   //source 1
		src2.subscribe(subject);	//source 2
		
		//Subject가 소스를 구독할 때 한번만 방출하기 때문.
	}

}
