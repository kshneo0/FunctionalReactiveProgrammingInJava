package com.basicsstrong.reactive.sec07;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class Demo {

	public static void main(String[] args) {

		@NonNull
		PublishSubject<String> subject = PublishSubject.create();
		
		subject.subscribe(System.out::println);
		subject.subscribe(e -> System.out.println("Observer 2 " + e));
		
		subject.onNext("Hello");
		subject.onNext("BasicsStrong");
		subject.onComplete();
		subject.onNext("BasicsStrong");
		

				
	}

}
