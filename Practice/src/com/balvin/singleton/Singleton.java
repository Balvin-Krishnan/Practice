package com.balvin.singleton;

public class Singleton {
	static Singleton singleton = new Singleton();
	private Singleton(){
		
	}
	public static Singleton getObject(){
		return singleton;
	}
}
