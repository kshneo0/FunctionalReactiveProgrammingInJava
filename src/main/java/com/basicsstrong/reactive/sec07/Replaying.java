package com.basicsstrong.reactive.sec07;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

public class Replaying {

	public static void main(String[] args) throws InterruptedException {
		
		
		@NonNull
		Observable<@NonNull Long> src = Observable.interval(1, TimeUnit.SECONDS)
		//.replay()
		//.replay(1)	//이전 1개값만 추가로 가져온다.
		//.replay(1,TimeUnit.SECONDS)	//이전 1초에 해당하는 값만 추가로 가져온다.
		.replay(2,4,TimeUnit.SECONDS)	//이전 4초 중 마지막 2개를 가져온다.
		.autoConnect();
		
		src.subscribe(e -> System.out.println("Observer 1 : "+e));
		
		Thread.sleep(5000);
		
		src.subscribe(e -> System.out.println("Observer 2 : "+e));
		
		Thread.sleep(3000);
	}

}
