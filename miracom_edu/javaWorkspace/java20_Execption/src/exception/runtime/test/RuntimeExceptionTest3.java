package exception.runtime.test;

import java.sql.SQLException;

/*
  catch�� ������ �Ҽ� �ִ�.
   ������ �� �߿��� �ϳ��� catch�� ����ȴ�.
 */
public class RuntimeExceptionTest3 {
	public static void main(String[] args) {
		String[ ] str = {
				"Hello JAVA",
				"No, I Mean it",
				"Nice to meet you"
		};
		int i=0;
		while(i<=3) {
			try {
				System.out.println(str[i]);				
			}catch(NullPointerException e) {
				System.out.println("Nice Catch1~~~!!");
			}catch(ArithmeticException e) {
				System.out.println("Nice Catch2~~~!!");
			}catch(NegativeArraySizeException e) {
				System.out.println("Nice Catch3~~~!!");
			}
			i++;
		}//
		System.out.println("while loop the end...");
	}//
}//
