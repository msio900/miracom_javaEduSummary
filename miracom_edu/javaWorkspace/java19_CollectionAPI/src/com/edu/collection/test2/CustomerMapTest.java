package com.edu.collection.test2;

import java.util.HashMap;
import java.util.Set;

import com.edu.collection.vo.Customer;

public class CustomerMapTest {
	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<>();
		
		map.put("111", new Customer("KANG", "강호동", 50));
		map.put("222", new Customer("LEE", "이수근", 46));
		map.put("333", new Customer("SEO", "서장훈", 42));
		map.put("444", new Customer("KIM", "김희철", 38));
		
		//1. key값이 222인사람을 찾아서 정보를 출력
		System.out.println(map.get("222"));
		
		//2. id가 LEE인 사람을 찾아서 그 사람의 이름을 출력
		Set<String> set=map.keySet();
		for (String key : set) {
			Customer cust=map.get(key);
			if (cust.getCustId().equals("LEE"))
				System.out.println("id가 LEE인 사람의 이름은? "+cust.getName()+" !!");
		}
		
		//3. MAP에 저장된 모든 데이터의 key를 모두 출력
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		//4. MAP에 저장된 사람들의 나이와 평균 나이를 모두 출력
		Set<String> set2 = map.keySet();
		int totalAge = 0;
		
		for (String key : set2) 
			totalAge += map.get(key).getAge();
		System.out.println("멤버들의 평균연령은 "+totalAge/map.size());
		
	}//main
}//class
