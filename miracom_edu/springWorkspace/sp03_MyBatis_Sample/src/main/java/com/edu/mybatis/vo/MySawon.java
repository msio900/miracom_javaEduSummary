package com.edu.mybatis.vo;

public class MySawon {
	private int num, age; //컬럼명과 동일
	private String id, pwd, name, hiredate; //컬럼명과 동일
	
    //	Framework 기술 사용시 반드시 기본 생성자가 있어야 한다!!!
	//  명시적 생성자가 없다면 그 안에는 자동으로 기본 생성자가 들어가 있다.
	public MySawon() {}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	@Override
	public String toString() {
		return "MySawon [num=" + num + ", age=" + age + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", hiredate="
				+ hiredate + "]";
	}	
}
