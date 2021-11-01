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
 * ::
 * 
 * <<��������� ���� ó���ϴ� ���>>
 * try{
 * 		// ���� �߻� ���ɼ��ִ� �ڵ�...
 * 		// ���� ���� �߻��� �ȵǸ� �� �κ��� ����...
 * }catch(���� Ÿ���� ���ڰ����� ����. ){
 * 		// ���ܸ� ������� ����Ǵ� �ڵ�...
 * 		// ���࿡ try������� ���ܰ� �߻��Ǹ� �� �κ����� ������
 * }finally{
 * 		//���� �߻� �ϵ� ���ϵ� ������ ����Ǿ����� �ϴ� �ڵ�...
 * }
 * 
 */

import javax.management.openmbean.ArrayType;

public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		String[ ] str = {
				"Hello JAVA",
				"No, I Mean it",
				"Nice to meet you"
		};
		int i =0;
		while(i<=3) {
			try {
				System.out.println(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice Catch1~~~!!");
			}
			i++;
		}//
		System.out.println("while loop the end...");//������ ����
	}//

}//
