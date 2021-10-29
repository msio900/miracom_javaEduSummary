package com.edu.test;

public class StaticExamTest4 {
	static int i =0;
	
	public static void main(String[] args) {
		System.out.println("1. main method...static block.."+i); //0

	}//main
	
	//static initialization...(static 초기화 블락)!!!!
	static {
		i = 300;
		System.out.println("2. static initialization block..."+i);//300
	}
}
