package access.child;

import access.parent.Parent;

/*
 * Parent의 자식 클래스...
 */
public class Child extends Parent{
	@Override
	public void access() {
		System.out.println(publicTest);		//접근허용
		System.out.println(protectedTest);	//접근허용
		//System.out.println(defaultTest);	//접근불가
		//System.out.println(privateTest);	//접근불가
		
		System.out.println("상속관계시 public, protected 지정자만 접근 가능!!");
		
	}
}
