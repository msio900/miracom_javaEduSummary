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
			if(num % 2 == 0) continue;//�Ʒ� ������ �������� ������ ��� �ݺ��� continue
			total += num;
		}//for
		System.out.println("1���� 10���� Ȧ���� ����"+total);
			
		}

	}

