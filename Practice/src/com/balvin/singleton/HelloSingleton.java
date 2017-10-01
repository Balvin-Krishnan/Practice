package com.balvin.singleton;

public class HelloSingleton {
static HelloSingleton helloSingleton = new HelloSingleton();
private HelloSingleton(){}
public static HelloSingleton getInstance(){
	return helloSingleton;
}
}
