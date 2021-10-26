package access.parent;
/*
 * Access Modifier 지정 범위를 알아보는 로직을 작성.
 * 각각의 필드에 접근 지정자를 서로 다르게 지정한다.
 * 각각의 서로 다른 클래스에서 해당 필드에 어떻게 접근하는지 확인해보자
 */
public class Parent {
	public String publicTest = "publicTest";
	protected String protectedTest = "protectedTest";
	String dafaultTest = "dafaultTest";
	private String privateTest = "privateTest";
	
	public void access() {
		System.out.println("Acess Modifier Test...");
		
	}
}
