package com.edu.loop.test;
/*
 * Loop��...�ݺ���
 * ::
 * for, while
 * ::
 * ���� ������ �����ϴ� ���ȿ���
 * �ڵ����� �ݺ������� �����ϴ� ����
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
		//statement�� �ϳ��̱� ������...{} ���ֵ� ��!
		// for (1�� ���� :: int i=0;2�� ���� :: i < 10;3�� ����:: ++i)
		for (int i=0; i < 10; ++i) {
			System.out.println("for....."+i);
		}
		//�� i�� �ᵵ ������.
		//�������� ���� �ִ�.
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
