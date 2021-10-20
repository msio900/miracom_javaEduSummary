package com.edu.oop2;

public class NoteBook {
	public String brandName;
	public int	price;
	public int serialNumber;
	
	public void printInfo() {
		System.out.println("NoteBook Brand :: "+brandName+", Price :: "+price+", Number :: "+serialNumber);
	}
	public String getBrandName() {
		return "NoteBook brandName :: "+brandName; 
	}

	// method �߰�... field�� ���� �Ҵ���� �� �ִ� ����� �ϳ� �߰��Ѵ�.
	// identifier ����
	//������(�� �Ҵ�) : return Ÿ�� �̸� 
	public void setNoteBookInfo(String brandName, int price, int serialNumber) //bn p ser �̰͵��� �������� field�� �ƴ�. member������ �ƴ�.method���� �ȿ� �����.
	// local ����, ���� ����, argument list
	{
		//~Test���� ��� ȣ���Ҷ� ���� ���ڰ����� �ٽ� �ʵ忡 �Ҵ�.
		//�ʵ��ʱ�ȭ(field initialization) : ���ο� ���Ҵ��� �ʱ�ȭ��� ��.
		this.brandName=brandName; // �տ��� field �ڿ��� local ����
		this.price=price;
		this.serialNumber=serialNumber;
		// this.(�����) :: field�� local variable�� �̸��� ������ �����ϱ� ���ؼ� field�տ� ���δ�.
		
	}
}
