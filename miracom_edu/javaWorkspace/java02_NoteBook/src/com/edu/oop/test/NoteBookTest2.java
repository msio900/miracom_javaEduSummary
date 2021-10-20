package com.edu.oop.test;
import com.edu.oop2.NoteBook;
/*
 * NoteBookTest2 코드에서의 문제점을 찾아내보자
 * 1) class의 field에 값을 할당하는 부분이 코드라인을 너무 길게 만든다.
 * 만약에 field가 여러 개 더 추가된다면 field값 할당하는 부분이 늘어난다.
 * 더욱이 객체 생성을 여러개 한다면 기하급수적으로 코드라인이 늘어난다.
 * --> 재사용성을 떨어뜨리는 결정적인 요인.
 * 
 * ::
 * 해결책?
 * method를 만들어 해결한다.
 * 
 */


public class NoteBookTest2 {
	public static void main(String[] args) {
	      
		NoteBook nb = new NoteBook();
		NoteBook nb2 = new NoteBook();// 하나더 만듦.멤버를 메모리에 추가

	      
	     /* nb.brandName = "apple macbook pro";
	      nb.price = 290;
	      nb.serialNumber = 1234;
	      
	      nb2.price = 240;
	      nb2.serialNumber = 4455;*/
	      
		nb.setNoteBookInfo("apple macbook pro", 290, 1234);
		nb2.setNoteBookInfo("SAMSUNG GALAXY BOOK PRO 360", 240, 4455);

		
	      nb.printInfo(); 
	      System.out.println(nb.getBrandName());
	      
	      System.out.println("=======================");
	      
	      nb2.printInfo(); 
	      System.out.println(nb2.getBrandName());

	   }
}
