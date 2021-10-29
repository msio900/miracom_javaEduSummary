package com.edu.service.impl;
/*
 * VO클래스들을 핸들링하는 기능들만 모아놓은 서비스 클래스
 * 서비스 인터페이스를 상속받아서 작성했다.
 * 
 * 이런 서비스 클래스는 클라이언트에서 요청이 아무리 많이 들어와도
 * 클래스 인스턴스는 단 하나 서버상에 만들어 놓고
 * 요청을 처리하는 것은 서비스 클래스에 메소드가 요청을 받아서 처리한다.
 * 즉, Singletone Pattern으로 작성
 * 
 * 해당 서비스클래스는 이후 JDBC 기술에서 Database 어플리케이션이 될 것이다.
 * 
 * 싱글톤 작성 패턴
 * 1. private static객체를 일단 하나 생성
 * 2. private 생성자...다른 곳에서 생성을 하지 못하도록 막아둔다.
 * 3. public static 생성한 객체를 받아 쓸 수 있도록 열어둔다.
 */
import java.util.ArrayList;

import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;

public class EmployeeListServiceImpl implements EmployeeListService{
	
	//추가
	private ArrayList<Employee> list;
	
	//싱글톤 추가
	private static EmployeeListServiceImpl service= new EmployeeListServiceImpl();
	
	private EmployeeListServiceImpl() {
		System.out.println("EmployeeListServiceImpl Creating...");
	}
	
	public static EmployeeListServiceImpl getInstance() {
		return service;
	}

	
	@Override
	public void addEmployee(Employee e) {		
		//	list에 추가
	}
	@Override
	public void deleteEmployee(String empId) {		
		//	list에서 삭제
		
	}
	@Override
	public void updateEmployee(Employee e) {		
		boolean find = false;
		//list에서 수정
	}//updateEmployee
	
	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		//list에서 검색
		return temp;
	}
	
	@Override
	public void findEmployees() {
		//
	}
}
