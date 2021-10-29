package com.edu.service.impl;
/*
 * VOŬ�������� �ڵ鸵�ϴ� ��ɵ鸸 ��Ƴ��� ���� Ŭ����
 * ���� �������̽��� ��ӹ޾Ƽ� �ۼ��ߴ�.
 * 
 * �̷� ���� Ŭ������ Ŭ���̾�Ʈ���� ��û�� �ƹ��� ���� ���͵�
 * Ŭ���� �ν��Ͻ��� �� �ϳ� ������ ����� ����
 * ��û�� ó���ϴ� ���� ���� Ŭ������ �޼ҵ尡 ��û�� �޾Ƽ� ó���Ѵ�.
 * ��, Singletone Pattern���� �ۼ�
 * 
 * �ش� ����Ŭ������ ���� JDBC ������� Database ���ø����̼��� �� ���̴�.
 * 
 * �̱��� �ۼ� ����
 * 1. private static��ü�� �ϴ� �ϳ� ����
 * 2. private ������...�ٸ� ������ ������ ���� ���ϵ��� ���Ƶд�.
 * 3. public static ������ ��ü�� �޾� �� �� �ֵ��� ����д�.
 */
import java.util.ArrayList;

import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;

public class EmployeeListServiceImpl implements EmployeeListService{
	
	//�߰�
	private ArrayList<Employee> list;
	
	//�̱��� �߰�
	private static EmployeeListServiceImpl service= new EmployeeListServiceImpl();
	
	private EmployeeListServiceImpl() {
		System.out.println("EmployeeListServiceImpl Creating...");
	}
	
	public static EmployeeListServiceImpl getInstance() {
		return service;
	}

	
	@Override
	public void addEmployee(Employee e) {		
		//	list�� �߰�
	}
	@Override
	public void deleteEmployee(String empId) {		
		//	list���� ����
		
	}
	@Override
	public void updateEmployee(Employee e) {		
		boolean find = false;
		//list���� ����
	}//updateEmployee
	
	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		//list���� �˻�
		return temp;
	}
	
	@Override
	public void findEmployees() {
		//
	}
}
