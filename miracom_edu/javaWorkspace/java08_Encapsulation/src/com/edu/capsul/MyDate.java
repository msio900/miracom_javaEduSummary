package com.edu.capsul;
//오늘 날짜 정보를 가지고 있는 클래스...
public class MyDate {
	//private은 같은 클래스에서만 ...접근 가능... 다른 class에서 접근 불가
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		// invalid한 값이 전달되더라도 필드 초기화 되기 직전에 걸러낼 수 있다.
		// month에 해당하는 값이 1~12일 경우에만 필드초기화 되도록한다.
		if() {
			this.month = month;
		}else {
			System.out.println("잘못된 월 입력입니다.");
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		/*
		 * switch문을 사용
		 * 1,3,5,7,9,12월 일때는 day가 1~31일
		 * 2,4,6,8,
		 */
		this.day = day;
	}

}
