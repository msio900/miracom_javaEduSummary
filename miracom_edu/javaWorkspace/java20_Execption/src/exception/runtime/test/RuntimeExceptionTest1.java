package exception.runtime.test;
/*
 * Runtime Exception
 * ::
 * 1.
 * �����Ϸ��� �ν��� ����.
 * �������� �ǰ�, �����Ҷ� ���ܸ� �߻���Ų��.
 * 
 * 2. 
 * ���� ó���� ���� ��������� �� �ʿ䰡 ����
 * �ҽ��ڵ带 �����ϱ⸸ �ϸ�ȴ�.
 * 
 */

public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		String[ ] str = {
				"Hello JAVA",
				"No, I Mean it",
				"Nice to meet you"
		};
		int i =0;
		while(i<=3) {
			System.out.println(str[i]);
			i++;
		}//
		System.out.println("while loop the end...");//������ ����
	}//

}//
