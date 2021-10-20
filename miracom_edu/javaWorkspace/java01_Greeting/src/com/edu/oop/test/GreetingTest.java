package com.edu.oop.test;

import com.edu.oop.Greeting;

/*
 * main 메소드를 가진 실행 클래스
 * ~~Test.java
 * ::
 * 
 * 1)객체를 생성한다. ==클래스의 모든 요소를 메모리에 올린다.
 * 2) 메모리에 올라간 변수와 메소드에 접근한다.
 * 변수에 접근 ----> 값 할당(assign)
 * 메소드 접근 ----> 호출(calling)
 */
public class GreetingTest {

	public static void main(String[] args) {
		//객체 생성 == Greeting 클래스의 모든 요소가 메모리에 올라감. - 사용하려고 메모리에 올립니다.
		Greeting g = new Greeting(); // 메시지는 값이 아니라 공간
		
		//메모리에 올라간 멤버(변수와 메소드)에 접근
		g.message = "안녕^^ 여러부운~~"; // 값 할당
		//(message)변수에 (안녕^^...)값을 넣겠다! 
		//literal value(값-실제 값) 
		//= assign(할당)
		g.printMessage(); // 메시지를 호출한다.(calling) 호출하지 않으면 워킹이 되지 않음.
	}

}
