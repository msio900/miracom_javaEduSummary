package com.edu.oop.test;
import com.edu.oop2.NoteBook;
/*
 * NoteBookTest2 �ڵ忡���� �������� ã�Ƴ�����
 * 1) class�� field�� ���� �Ҵ��ϴ� �κ��� �ڵ������ �ʹ� ��� �����.
 * ���࿡ field�� ���� �� �� �߰��ȴٸ� field�� �Ҵ��ϴ� �κ��� �þ��.
 * ������ ��ü ������ ������ �Ѵٸ� ���ϱ޼������� �ڵ������ �þ��.
 * --> ���뼺�� ����߸��� �������� ����.
 * 
 * ::
 * �ذ�å?
 * method�� ����� �ذ��Ѵ�.
 * 
 */


public class NoteBookTest2 {
	public static void main(String[] args) {
	      
		NoteBook nb = new NoteBook();
		NoteBook nb2 = new NoteBook();// �ϳ��� ����.����� �޸𸮿� �߰�

	      
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
