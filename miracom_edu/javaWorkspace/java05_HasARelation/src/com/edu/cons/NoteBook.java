package com.edu.cons;

public class NoteBook {
	public String brandName;
	public int	price;
	public int serialNumber;
	// 생성자는 return 타입이 없음.
	public NoteBook(){}
	public NoteBook(String brandName, int price, int serialNumber) {
		this.brandName = brandName;
		this.price = price;
		this.serialNumber = serialNumber;
	}
	
	public void printInfo() {
		System.out.println("NoteBook Brand :: "+brandName+", Price :: "+price+", Number :: "+serialNumber);
	}
	public String getBrandName() {
		return "NoteBook brandName :: "+brandName; 
	}

	// method 추가... field에 값을 할당받을 수 있는 기능을 하나 추가한다.
	// identifier 설정
	//구현부(값 할당) : return 타입 이름 
	public void setNoteBookInfo(String brandName, int price, int serialNumber) //bn p ser 이것들은 변수지만 field가 아님. member변수가 아님.method영역 안에 선언됨.
	// local 변수, 지역 변수, argument list
	{
		//~Test에서 기능 호출할때 받은 인자값으로 다시 필드에 할당.
		//필드초기화(field initialization) : 새로운 값할당을 초기화라고 함.
		this.brandName=brandName; // 앞에는 field 뒤에는 local 변수
		this.price=price;
		this.serialNumber=serialNumber;
		// this.(예약어) :: field와 local variable의 이름이 같을때 구분하기 위해서 field앞에 붙인다.
		
	}
}
