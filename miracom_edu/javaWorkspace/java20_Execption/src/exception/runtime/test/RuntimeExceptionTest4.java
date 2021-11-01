package exception.runtime.test;
/*
 *catch는 여러번 할 수 있다.
 *하지만 이때
 *작은 것(자식)  --> 큰 것(부모) 순으로 해야된다.
 *
 *			Exception
 *				|
 *			RuntimeEception
 *        	--- ArrayIndexOutOfBoundsException
 *        	--- ArithmeticException
 *        	--- NullPointerException   
 *           
 *        
 */

public class RuntimeExceptionTest4 {

	public static void main(String[] args) {
		String[ ] str = {
				"Hello JAVA",
				"No, I Mean it",
				"Nice to meet you"
		};
		int i =0;
		while(i<=3) {
			System.out.println(str[i]);
			try {
				System.out.println(str[i]);
			}catch(ArithmeticException e) {
				System.out.println("Nice Catch1~~~!!");
			}catch(Exception e) {
				System.out.println("Nice Catch2~~~!!");
			}
			i++;
		}//
		System.out.println("while loop the end...");//비정상 종료
	}//
}//

