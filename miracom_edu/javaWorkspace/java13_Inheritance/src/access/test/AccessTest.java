package access.test;

import access.child.Child;

public class AccessTest {

	public static void main(String[] args) {
		//1. 자식이 생성되면 부모를 만들어줘야한다.(부모가 생성되지 않으면 자식이 생성되지 않는다.) O
		//2. 자식이 생성되면 부모를 만들어주지 않아도 된다. X
		// 부모생성이 먼저 전데로 진행된다...
		Child c = new Child();
	
		c.access();
	}
}
