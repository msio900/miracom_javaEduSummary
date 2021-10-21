package com.edu.condition.test;
/*
 *  앞에서 배운 switch문은 break 키워드를 어떻게 활용하느냐에 따라서
 *  다양한 결과를 도출할 수 있다.
 *  
 *  1) static한 기능을 접근하는 방법
 *  2) break 키워드 사용법
 *  ::
 *  Math m = new Math();
 *  m.random();
 *  random()은 static한 성질로 만들어져 있기 때문에
 *  위처럼 객체 생성할 필요가 없다.
 *  미리 메모리에 올라가 있다.
 *  --> 
 *  Math.random(); 이렇게 className.기능();
 */
public class SwitchNoBreakTest3 {
	public static void main(String[] args) {
		
		/*double time = Math.random(); //0~1사이의 실수를 return한다.
		System.out.println(time);*/
		int time = (int)(Math.random()*4) + 8; //8~11까지의 정수를 return한다.
		System.out.println("[현재시각 : "+time+" 시]");
		
		switch(time) {
			case 8: //8시 인경우
				System.out.println("출근 준비 합니다...");
			case 9: //9시 인경우
				System.out.println("회사 도착, 아침 회의를 가집니다...");
			case 10: //10시 인경우
				System.out.println("오전 업무를 봅니다...");
			case 11: //11시 인경우
				System.out.println("외근을 나갑니다...");
				
		}//switch
		
	}//main

}//class
