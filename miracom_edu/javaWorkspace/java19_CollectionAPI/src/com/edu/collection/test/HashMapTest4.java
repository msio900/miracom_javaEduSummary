package com.edu.collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 					Map
 * 				|			|
 * 			HashTable		HashMap
 * 				|
 * 			**Properties**
 * 			(Key, Value��� ���ڿ��� ����)
 * put(key, value)
 * get(key) : value
 * remove(key) : value
 * remove(Object key, Object value) : boolean
 * keySet() : Set
 */
public class HashMapTest4 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("��ȣ��", 90);
		map.put("������", 95);
		map.put("�̼���", 100);
		map.put("����ö", 90);
		map.put("�迵ö", 92);
		
		//1. map�� ����� ��� Ű���� �޾ƿ´�...Set�� ��Ƽ� return
		Set<String> set = map.keySet();
		
		//2. Set�� ����� key���� �̾Ƴ���...iterator()�Լ� ����
		/*Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
		}*/
		//2-1. ���� for�� : index�� ������ ���� for�� ������ �� ����.
		int total = 0;
		for(String name : set) {
			int score = map.get(name);
			System.out.println(name+" :: "+score);
			total += score;
		}
		System.out.println("��� ������� ������ ���� : "+total+" �� �Դϴ�.");
		System.out.println("��� ������� ������ ��� : "+total/map.size()+" �� �Դϴ�.");
		
		System.out.println("=== values ===");
		Collection<Integer> scores = map.values();
		int total2 = 0;
		for(int score : scores) {
			System.out.println(score);
			total2 += score;
			
		}
		System.out.println("��� ������� ������ ���� : "+total+" �� �Դϴ�.");
		System.out.println("��� ������� ������ ��� : "+total/map.size()+" �� �Դϴ�.");
		

		System.out.println("=== values ===");
		System.out.println("�ְ�����"+Collections.max(scores)+"��!!");
		System.out.println("����������"+Collections.min(scores)+"��!!");
		
	}

}
