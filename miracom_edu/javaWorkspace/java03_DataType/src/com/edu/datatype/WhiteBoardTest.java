package com.edu.datatype;
/*
 * Class�� ������ �Ѳ����� �ۼ��Ҷ���
 * - main method�� ������ class�տ� public�� ���δ�.(�ٸ� Ŭ���� �տ��� ���̸� �ȵ�.)
 * - public�� ���� Ŭ���� �̸����� ���ϸ��� �����Ѵ�.
 * 
 */
class Date{
	int year;
	int month;
	int day;
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//String + nonString �ٿ����� String���� Converting!!
	public String getDate() {
		return year+"-"+month+"-"+day;
	}
}
class WhiteBoard{
	// company, color, material, price, scratch, madeDate(2000.1.23)
	String company;
	char color;
	String material;
	double price;
	boolean scratch;
	Date madeDate;
	
	//2. �ʵ忡 �� �Ҵ�...(setWhiteBoard())/�Ҵ�� �� �޾ƿ���...(getWhiteBoard())
	public void setWhiteBoard(char color, double price, boolean scratch, Date madeDate) {
		this.color = color;
		this.price = price;
		this.scratch = scratch;
		this.madeDate = madeDate;
		
	}
	public String getWhiteBoard() {
		return color+","+price+","+scratch+","+madeDate.getDate();//getDate() ����
	}
	
}
public class WhiteBoardTest {
	public static void main(String[] args) {		
		//1. wb��� �̸����� WhiteBoard ��ü�� ����
		WhiteBoard wb = new WhiteBoard();
		//2. �ʵ��ʱ�ȭ
		Date madeDate = new Date();
		madeDate.setDate(2020, 1, 12);
		wb.setWhiteBoard('W', 100.5, false, madeDate);
		//3. �ʵ尪�� �ַܼ� ���
		System.out.println(wb.getWhiteBoard());
		
	}
}

