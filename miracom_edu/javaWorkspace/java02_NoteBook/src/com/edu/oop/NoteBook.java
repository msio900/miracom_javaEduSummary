package com.edu.oop;
/*
 * 필드 선언 위치
 * ::
 * class 선언 바로 아래 + method 영역 바깥
 * 
 * method 선언부/ method 정의 부분
 * ::
 * return타입 + method 이름 (인자값 0~many){ //method 선언부
 * // method가 어떤 일을 하는지가 기술... // method 구현부 - worker/ method 정의
 * }
 */
public class NoteBook {
	public String brandName;
	public int	price;
	// field 추가
	public int serialNumber;
	
	public void printInfo() {
		// 수정 field가 추가 되어서 추가할 내용을 넣어야함.
		System.out.println("NoteBook Brand :: "+brandName+", Price :: "+price+", Number :: "+serialNumber);
	}
	// 메소드를 추가...return type이 void가 아닌 기능을 추가
	public String getBrandName() {//?
		// 어디로 리턴되는가?????? calling + worker 왔다갔다.
		return "NoteBook brandName :: "+brandName; // 호출한 곳으로 brandName이 return됨 ~test클래스의 26번째 라인
	}
}
