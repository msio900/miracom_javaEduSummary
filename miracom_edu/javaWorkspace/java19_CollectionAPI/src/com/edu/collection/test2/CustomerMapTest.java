package com.edu.collection.test2;

import java.util.HashMap;
import java.util.Set;

import com.edu.collection.vo.Customer;

public class CustomerMapTest {
	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<>();
		
		map.put("111", new Customer("KANG", "��ȣ��", 50));
		map.put("222", new Customer("LEE", "�̼���", 46));
		map.put("333", new Customer("SEO", "������", 42));
		map.put("444", new Customer("KIM", "����ö", 38));
		
		//1. key���� 222�λ���� ã�Ƽ� ������ ���
		System.out.println(map.get("222"));
		
		//2. id�� LEE�� ����� ã�Ƽ� �� ����� �̸��� ���
		Set<String> set=map.keySet();
		for (String key : set) {
			Customer cust=map.get(key);
			if (cust.getCustId().equals("LEE"))
				System.out.println("id�� LEE�� ����� �̸���? "+cust.getName()+" !!");
		}
		
		//3. MAP�� ����� ��� �������� key�� ��� ���
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		//4. MAP�� ����� ������� ���̿� ��� ���̸� ��� ���
		Set<String> set2 = map.keySet();
		int totalAge = 0;
		
		for (String key : set2) 
			totalAge += map.get(key).getAge();
		System.out.println("������� ��տ����� "+totalAge/map.size());
		
	}//main
}//class
