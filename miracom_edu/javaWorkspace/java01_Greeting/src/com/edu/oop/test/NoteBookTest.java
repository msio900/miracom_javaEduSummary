package com.edu.oop.test;

import com.edu.oop.NoteBook;

public class NoteBookTest {
	public static void main(String[] args) {
		// 1. NoteBook Ŭ������ ��ü�� ���� == NoteBook ����� �޸𸮿� �ø�
	      NoteBook nb = new NoteBook();
	      
	    // 2. ����� ���� 
	      nb.brandName = "apple macbook";
	      nb.price = 290;
	      nb.printInfo();
	   }

}
