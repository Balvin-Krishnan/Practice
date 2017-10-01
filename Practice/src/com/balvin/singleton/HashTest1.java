package com.balvin.singleton;

public class HashTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("1234");
		Student student2 = new Student("1234");
		
		System.out.println(student1.equals(student2));
		System.out.println(student1==student2);
	}

}
class Student{
	private String a;
	
	public String getA(){
		return a;
	}
	
	public Student(String a){
		this.a = a;
	}
}