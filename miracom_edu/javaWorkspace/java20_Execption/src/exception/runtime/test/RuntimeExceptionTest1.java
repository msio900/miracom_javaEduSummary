package exception.runtime.test;
/*
 * Runtime Exception
 * ::
 * 1.
 * 컴파일러가 인식을 못함.
 * 컴파일은 되고, 실행할때 예외를 발생시킨다.
 * 
 * 2. 
 * 예외 처리를 굳이 명시적으로 할 필요가 없고
 * 소스코드를 수정하기만 하면된다.
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
		System.out.println("while loop the end...");//비정상 종료
	}//

}//
