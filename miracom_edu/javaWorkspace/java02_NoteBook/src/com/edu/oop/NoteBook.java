package com.edu.oop;
/*
 * �ʵ� ���� ��ġ
 * ::
 * class ���� �ٷ� �Ʒ� + method ���� �ٱ�
 * 
 * method �����/ method ���� �κ�
 * ::
 * returnŸ�� + method �̸� (���ڰ� 0~many){ //method �����
 * // method�� � ���� �ϴ����� ���... // method ������ - worker/ method ����
 * }
 */
public class NoteBook {
	public String brandName;
	public int	price;
	// field �߰�
	public int serialNumber;
	
	public void printInfo() {
		// ���� field�� �߰� �Ǿ �߰��� ������ �־����.
		System.out.println("NoteBook Brand :: "+brandName+", Price :: "+price+", Number :: "+serialNumber);
	}
	// �޼ҵ带 �߰�...return type�� void�� �ƴ� ����� �߰�
	public String getBrandName() {//?
		// ���� ���ϵǴ°�?????? calling + worker �Դٰ���.
		return "NoteBook brandName :: "+brandName; // ȣ���� ������ brandName�� return�� ~testŬ������ 26��° ����
	}
}
