package spring.service.hello.test;

import spring.service.hello.Hello;

/*
 * FileName : HelloTestApp01.java
 * ㅇ Hello.class 사용하는 Application
 */
public class HelloTestApp01 {
	
	///main method
	public static void main(String[] args) {
		//==>1. instance 생성 
		Hello hello = new Hello();
		//==> 2. printMessage() method 호출
		hello.printMessage();
	}
	
}//end of class

/*
 * [ 고려할 사항 :: 다른 Bean 사용 및 출력 Message 변경 시... ]
 * 
 * 1. new Hello() 의 instance 생성 하드코딩
 * 		-  Hello.class, 하위 class 또는 다른 class 사용을 할 경우 
 * 			==>  다시 코딩 후 컴파일 과정 수행
 * 
 * 2. 출력할 message 하드 코딩 
 *		-  다른 message 를 출력코자 한다면 
 *			==> 다시 코딩 후 컴파일 과정 수행 ( :: setter Method 를 사용하지 않은 경우로 한정 )
 *
 *  ==> 위의 하드코딩된 부분(1.instance 생성, 2.출력 message)을 
 *  		text file(부가정보,Meta Data) 에 저장하고  Application 은 runtime 시  text 에 저장된 내용을 
 *  		읽어 수행하는 구조라면,  사용 할 instance/message 에  변경사항이 발생하면 text만 수정
 *  		Application 은  text 를 통해 전달된 정보를 사용 함으로 Bean 은 수정 할 필요가 없다
 *         ( text/메타데이터의 활용 )
 */