package com.edu.array.test;
/*
 * 배열이 가지고 있는 중요한 성질...
 * 
 * "다른 사이즈를 가진 배열의 내용을 Copy해 올수는 있다."
 * System.arraycopy()
 * 
 */

public class BasicArrayCopyTest5 {
	public static void main(String[] args) {
		
		int[ ] target = {1, 2, 3, 4, 5, 6};//6
		int[ ] source = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};//10
		
		// target데이터 결과가....8, 7, 6, 5, 4, 3
		
		//System.arraycopy(); static한 성질은 객체 생성을 안해도 됨.
		//for이용해서 target인 데이터를 출력 받아서 확인해보세요...
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array.
		System.arraycopy(source, 2, target, 0, target.length);
		for(int i : target) System.out.print(i+" ");
	}

}
