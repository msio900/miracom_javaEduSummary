package com.edu.collection.test;

import java.util.ArrayList;
import java.util.List;

/*
 * 		List
 *  	 |
 * 		ArrayList
 * 
 * 	순서를 가지면서(내부적으로 index로 관리된다.)
 * 	데이터 중복을 허용한다.
 */
public class ArrayListTest3 {
	public static void main(String[] args) {
		//java.awt를 고르면 안됨.
		List<String> list = new ArrayList<String>();
		list.add("강호동");
		list.add("이수근");
		list.add("강호동");
		list.add("김영철");
		list.add("서장훈");
		
		System.out.println(list);//순서가 있다.(입력한 순서대로 출력) / 중복 허용
		
		//2번째(index 1)데이터를 삭제...누가 삭제가 되었는지 출력?
		//인덱스를 넣게 되면 객체가 리턴, 객체를 넣으면 boolean이 리턴
		String removeName = list.remove(1);
		
		System.out.println(removeName+"님을 삭제하였습니다.");
		System.out.println(list);
		
		//가장 첫번째에 아이유를 추가
		list.add(0, "아이유");
		System.out.println(list);
		
		//list중에 있는 모든 멤버들 중에서 멤버이름이 서장훈인 사람을 찾아서 출력
		//for, equals(), get()을 써라!
		for(int i=0; i < list.size(); i++) {
			if (list.get(i).equals("서장훈"))
				System.out.println(list.get(i));
		}
	}//main
}//class
