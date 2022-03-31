package com.basicsstrong.reactive.sec03;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

public class Disposing {

	public static void main(String[] args) throws InterruptedException {
		
		@NonNull
		Observable<Long> src = Observable.interval(1, TimeUnit.SECONDS);
		
		src.subscribe(e -> System.out.println("Observer 1 : " + e));
		src.subscribe(e -> System.out.println("Observer 2 : " + e));
		
		// interval()은 메인 쓰레드에서 실행되는 게 아니라 워커 쓰레드에서 실행되기 때문에, 
		// interval()로 만든 Observable이 워커 쓰레드에서 작동하면 
		// 메인 쓰레드는 자기가 할 일이 없는 줄 알고 프로그램을 종료시켜버린다. 
		// 그래서 메인 쓰레드가 프로그램을 종료시키지 않도록 sleep()을 거는 것이다.
		Thread.sleep(10000);

		
	}

}
