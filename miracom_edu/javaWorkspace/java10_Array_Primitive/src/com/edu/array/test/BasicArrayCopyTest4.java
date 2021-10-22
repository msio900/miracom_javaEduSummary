package com.edu.array.test;
/*
 * 배열이 가지고 있는 중요한 성질...
 * 
 * "배열은 Resizing이 안됨..."
 * 한번 만든 배열 객체를 가지고 사이즈를 수정하게 되면
 * 새로운 객체가 만들어진다...아까 만든건 쓰레기 객체가 됨.
 * 한번 배열을 만들때 사이즈를 넉넉히 만들자!!!
 * 
 * "다른 사이즈를 가진 배열의 내용을 Copy해 올수는 있다."
 * System.arraycopy()
 * 
 */

public class BasicArrayCopyTest4 {
	public static void main(String[] args) {
		int[ ] target = {1, 2, 3, 4, 5, 6};
		for(int i=0;i<target.length;i++) System.out.print(target[i]+" ");
		
		//향상된 for문, for in "뭐가 어디서 돌아가나?"
		System.out.println(" ");
		for(int i : target) System.out.print(i+" ");

		//회원수가 늘었다..그래서 배열의 사이즈를 늘려야 한다....
		target = new int[10]; //칸을 늘렸다.
		target[6] = 11;
		target[7] = 22;
		target[8] = 33;
		target[9] = 44;
		
		System.out.println(" ");
		for (int i : target)System.out.print(i+" ");
	}

}
