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
 * 			(Key, Value모두 문자열로 저장)
 * put(key, value)
 * get(key) : value
 * remove(key) : value
 * remove(Object key, Object value) : boolean
 * keySet() : Set
 */
public class HashMapTest4 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("강호동", 90);
		map.put("서장훈", 95);
		map.put("이수근", 100);
		map.put("김희철", 90);
		map.put("김영철", 92);
		
		//1. map에 저장된 모든 키값을 받아온다...Set에 담아서 return
		Set<String> set = map.keySet();
		
		//2. Set에 담겨진 key값을 뽑아낸다...iterator()함수 적용
		/*Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
		}*/
		//2-1. 향상된 for문 : index로 돌리는 향상된 for문 성능이 더 좋음.
		int total = 0;
		for(String name : set) {
			int score = map.get(name);
			System.out.println(name+" :: "+score);
			total += score;
		}
		System.out.println("모든 사람들의 성적의 총합 : "+total+" 점 입니다.");
		System.out.println("모든 사람들의 성적의 평균 : "+total/map.size()+" 점 입니다.");
		
		System.out.println("=== values ===");
		Collection<Integer> scores = map.values();
		int total2 = 0;
		for(int score : scores) {
			System.out.println(score);
			total2 += score;
			
		}
		System.out.println("모든 사람들의 성적의 총합 : "+total+" 점 입니다.");
		System.out.println("모든 사람들의 성적의 평균 : "+total/map.size()+" 점 입니다.");
		

		System.out.println("=== values ===");
		System.out.println("최고성적은"+Collections.max(scores)+"점!!");
		System.out.println("최저성적은"+Collections.min(scores)+"점!!");
		
	}

}
