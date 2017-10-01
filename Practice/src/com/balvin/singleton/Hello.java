package com.balvin.singleton;

public class Hello {
static Hello hello = new Hello();
private Hello(){
	
}
public static Hello getInstance(){
	return hello;
}
}
