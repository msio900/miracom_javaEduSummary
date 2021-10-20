package com.edu.oop.test;
/*
 * ~Test class
 * ::
 * 실행클래스...main
 * ::
 * 1. 객체 생성
 * 2. 메모리에 올라간 멤버에 접근...
 * 	field ---> 값 할당 (assign)
 * 	method ---> 호출 (calling)
 */
import com.edu.oop.NoteBook;

public class NoteBookTest {
	public static void main(String[] args) {
		// 1. NoteBook 클래스를 객체를 생성 == NoteBook 멤버를 메모리에 올림
	      NoteBook nb = new NoteBook();
	      
	    // 2. 멤버에 접근 : 값할당
	      nb.brandName = "apple macbook";
	      nb.price = 290;
	      nb.serialNumber = 1234;
	    // 3. 호출
	      nb.printInfo(); // 콘솔창에 출력(return 타입이 void라서)
	      //추가된 method 추가
	      System.out.println(nb.getBrandName());//String일때, 이쪽으로 리턴된 값을 출력
	   }
}
