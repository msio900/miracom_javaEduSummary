package com.edu.loop.test;
/*
 * Looping
 * ::
 * break, 
 * continue - 
 */
public class ContinueTest2 {
	public static void main(String[] args) {
		int total = 0;
		
		for(int num = 1; num <= 10; num++) {
			if(num % 2 == 0) continue;//아랫 문장을 수행하지 않지만 계속 반복을 continue
			total += num;
		}//for
		System.out.println("1부터 10까지 홀수의 합은"+total);
			
		}

	}

