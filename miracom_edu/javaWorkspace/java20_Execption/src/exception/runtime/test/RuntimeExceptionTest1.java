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
 * ::
 * 
 * <<명시적으로 예외 처리하는 방법>>
 * try{
 * 		// 예외 발생 가능성있는 코드...
 * 		// 만약 예외 발생이 안되면 이 부분이 수행...
 * }catch(예외 타입을 인자값으로 적음. ){
 * 		// 예외를 잡았을때 수행되는 코드...
 * 		// 만약에 try블락에서 예외가 발생되면 이 부분으로 내려옴
 * }finally{
 * 		//예외 발생 하든 안하든 무조건 수행되어져야 하는 코드...
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
		System.out.println("while loop the end...");//비정상 종료
	}//

}//
