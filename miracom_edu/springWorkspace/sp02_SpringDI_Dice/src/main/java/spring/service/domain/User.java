package spring.service.domain;

import java.io.Serializable;

/* 
 * FileName : User.java 
 *  -  User 의 정보 id / pwd / age 를 갖는 Value Object
 *  -  User 의 정보 id / pwd / age 를 갖는 domain / command Object
 *  -  User 의 정보 id / pwd / age 를 갖는 POJO  
*/ 
public class User implements Serializable {
	
	///Field
    private String userId; 			/* 회원 ID */
    private String password;     /* 비밀번호 */
    private int age;    					/* 나이 */ 
    
    ///Constructor
    public User() {
		System.out.println("\n::"+getClass().getName()+" 디폴트 생성자....");
	}
	public User(int age, String userId) {
		System.out.println("\n::"+getClass().getName()+" age,userId 인자 받는 생성자....");
		this.age = age;
		this.userId = userId;
	}
	public User(int age, String password, String userId) {
		System.out.println("\n::"+getClass().getName()+"age,password,userId 인자 받는 생성자");
		this.age = age;
		this.password = password;
		this.userId = userId;
	}
	
	///Method (getter/setter)
	public String getUserId(){
		return this.userId;
	}
	public void setUserId( String userId ){
	   System.out.println("::"+getClass().getName()+".setUserId()");
	   this.userId= userId;
	}
	public String getPassword(){
	   return this.password;
	}
	public void setPassword( String password ){
	   System.out.println("::"+getClass().getName()+".setPassword()");		
	   this.password= password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
        System.out.println("::"+getClass().getName()+".setAge()");
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", password=" + password + ", age="+ age + "]";
	}
	
}//end of class