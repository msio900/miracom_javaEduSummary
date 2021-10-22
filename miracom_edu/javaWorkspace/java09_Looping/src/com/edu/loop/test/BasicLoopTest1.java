package com.edu.loop.test;
/*
 * Loop문...반복문
 * ::
 * for, while
 * ::
 * 참인 조건을 만족하는 동안에만
 * 코드블락을 반복적으로 수행하는 문장
 * ::
 * <Syntax>
 * for(initialization;boolean expresion;update){
 * //code block
 * }
 * 
 * <Syntax>
 * initialization
 * while(boolean) {
 * 
 * }
 * 
 */
public class BasicLoopTest1 {
	public static void main(String[] args) {
		
		/*System.out.println("===========for==========\n");
		//statement가 하나이기 때문에...{} 없애도 됨!
		// for (1번 순서 :: int i=0;2번 순서 :: i < 10;3번 순서:: ++i)
		for (int i=0; i < 10; ++i) {
			System.out.println("for....."+i);
		}
		//또 i를 써도 무관함.
		//이중으로 쓸수 있다.
		for(int i=1, j=1; i <= 10 & j <= 10; i++) {
			System.out.println(i+"...for loop..."+j);
		}*/
		System.out.println("==================while================");
		int i=10;
		while(i>0) {
			System.out.println("while..."+i);
			i--;
			}
		
		
	}
}
