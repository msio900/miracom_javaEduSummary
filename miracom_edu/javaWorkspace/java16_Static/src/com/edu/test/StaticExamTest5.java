package com.edu.test;
/*
 * Singletone Pattern 코드 작성방법 단계
 * ::
 * 하나의 클래스로부터 오직 하나의 객체만을 생성하는 패턴
 * ::
 * 1. private static으로 해당 클래스에서 객체를 일단 하나는 생성
 * 2. 다른 곳에서 객체생성을 못하도록 생성자 앞에 private
 * 3. 하나 만들어놓은 객체를 여기저기서 가져다 쓸수 있도록 public static으로 리턴하는 기능을 만든다
 */
class Factory{
	private static Factory factory = new Factory();//1
	private Factory(){ //2.
		System.out.println("Factory Only One Creating...");
	}
	public static Factory getInstance() { //3
		return factory;
	}
}
public class StaticExamTest5 {
	public static void main(String[] args) {
		System.out.println("Singtone Pattern.....");
		
		//Factory factory1 = new Factory();
		
		//getInstance()를 여러번 호출해서 Factory객체를 여러번 리턴받았다
		//이때 factory1, factory2, factory3가 서로 다른 객체가 아닌지 어떻게 확인?
		Factory factory1=Factory.getInstance();
		Factory factory2=Factory.getInstance();
		Factory factory3=Factory.getInstance();
		
		System.out.println(factory1);
		System.out.println(factory2);
		System.out.println(factory3);
	}
}








