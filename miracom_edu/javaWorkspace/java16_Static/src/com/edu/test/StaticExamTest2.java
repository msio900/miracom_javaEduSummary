package com.edu.test;
/*
 * 4
 * static한 멤버는 생성된 객체들이 다 공유한다.
 */
class Car{
	int serialNumber; //field
	static int counter; //static V
	
	Car(){
		counter++; //1,2,3,4,,,,
		serialNumber =counter; //1, 2, 3, 4,,,
	}	
}
public class StaticExamTest2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println("=========Field serialNumber ==========");
		System.out.println(car1.serialNumber);//1
		System.out.println(car2.serialNumber);//2
		System.out.println(car3.serialNumber);//3
		
		System.out.println("\n=========static counter ==========");
		System.out.println(Car.counter);//3
		System.out.println(car1.counter);//3
		System.out.println(car2.counter);//3
		System.out.println(car3.counter);//3
	}
}










