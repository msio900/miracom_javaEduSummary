package access.parent;
/*
 * Access Modifier ���� ������ �˾ƺ��� ������ �ۼ�.
 * ������ �ʵ忡 ���� �����ڸ� ���� �ٸ��� �����Ѵ�.
 * ������ ���� �ٸ� Ŭ�������� �ش� �ʵ忡 ��� �����ϴ��� Ȯ���غ���
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
