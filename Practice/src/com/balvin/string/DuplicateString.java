package com.balvin.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateString {
public static void main(String[] args) {
	String str = "Java Java jasper jquery Java html udeploy spring spring struts spring struts";
	String str1 = "";
	List<String> lstString = new ArrayList<String>();
	System.out.println("Input is "+str);
	
	
	String[] arrStr = str.split(" ");
	Map<String, Integer> strMap = new HashMap<String, Integer>();
	for (String string : arrStr) {
		
		int i=0;
		
		if(strMap.get(string)!=null ){//&& !lstString.contains(string)){
			i = strMap.get(string);
			str1 = str1+" "+string;
			//lstString.add(string);
		}	
			
			strMap.put(string, ++i);
	}
	
	for(Entry<String,Integer> entry: strMap.entrySet()){
		System.out.println(entry.getKey() +" "+entry.getValue());
	}
	
	System.out.println("Output is "+str1);
}
}
