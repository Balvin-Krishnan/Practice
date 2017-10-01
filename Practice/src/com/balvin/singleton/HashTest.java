package com.balvin.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashTest {

	public static void main(String[] args) {
		HashValue hashValue1 = new HashValue(2);
		HashValue hashValue2 = new HashValue(2);
			
		System.out.println(hashValue1.hashCode());
		System.out.println(hashValue2.hashCode());
		
		Map<HashValue, String> map1 = new HashMap<HashValue, String>();

		map1.put(hashValue1, "Hello");	
		map1.put(hashValue2, "How are you!!");
		
		for(Entry<HashValue, String> entry:map1.entrySet()){
			System.out.println(entry.getValue());
		}
	}
}

class HashValue{
	private int A;
	
	public int getA(){
		return A;
	}
	
	public HashValue(int a) {
		// TODO Auto-generated constructor stub
		this.A = a;
	} 
	
	public int hashCode(){
		return 2;
	}
	
	public boolean equals(Object o){
		HashValue hashValue = (HashValue)o;
		
		if(A==hashValue.getA()){
			return true;
		}
		else{
			return false;
		}
	}
}
