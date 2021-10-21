package com.edu.test;
/*
 * 자바에서 알아야하는 연산자를 정리한다...
 */
class Operator{
	public boolean test1() {
		System.out.println("test1()...calling");
		return true;
	}
	public boolean test2() {
		System.out.println("test2()...calling");
		return true;
	}
}

public class OperatorTest1 {
	public static void main(String[] args) {
		//변수 : 멤버(field), local 변수
			int i = 10;//로컬변수 method영역 안에서만 사용할 수 있다.
			int j = 8;//로컬변수
			// = 은 assign의 의미를 갖음. 공간의 이름이 i 10이라는 값이 i에 할당.
			// == 는 같다.
			/*
			 *  = :: 할당
			 *  == :: 같다.
			 *  != :: 같지 않다.
			 *  % :: modulars 나머지를 구해줌.
			 */
			System.out.println(i==j); //False
			System.out.println(i!=j); //True
			System.out.println("==============================");
			System.out.println("연산자 % ::"+i % j); //2
			
			// ++ :: 1씩 값을 증가시키는 연산자
			// -- :: 1씩 값을 감소시키는 연산자
			int k = 10; //Local V 초기화 (선언 + 값할당)
			System.out.println(k++); //10... 1이 나중에 증가
			System.out.println(k);		//11
			
			int m = 10;
			System.out.println(++m);// 11...먼저 1이 증가됨.
			System.out.println(m); //11
		}
//		i=100; 로컬변수는 영역밖에서 쓰면 에러가 남.
}
