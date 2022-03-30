package com.basicsstrong.reactive.sec01;

public interface CallBack {
	
	void pushData(String data);
	
	void pushComplete();

	void pushError(Exception ex);

}
