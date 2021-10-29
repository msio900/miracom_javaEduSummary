package com.edu.service;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;

/*
 * Employee 의 자식클래스인
 * Manager, Engineer, Secretary 객체들을 핸들링하는 기능만으로 만들어진 Service클래스..
 * 
 * 							Employee
 * 
 * 
 * 
 *  			Manager     Engineer     Secretary
 * 
 * 
 * 
 * 1step .. 가장 저차원적으로 위 구조를 핸들링할때 사용하는 메소드 기법
 * ::
 * sub객체들을 추가에 관련 된 기능을 정의하는 경우 
 * 절때로 아래처럼 메소드 정의가 잘못되었다. : 서로 다른 func처럼 느껴진다. 코드의 가독력이 엄청 떨어진다. 그래서 가장 안좋은 코드
 * 
 * 	public void addManager(Manager m){// }
 *  public void insertEngineer(Engineer eg){// }
 *  public void manageSec(Secretary sc){// }
 *  
 *  그래서  func지정할 떄는 공통적인 기능인지아닌지를 표현해주는 것이 중요하다
 *  
 * 2step .. 1단계 보다는 조금 나은 정의...
 * ::
 * 일관성이 있다. identifier는 다르지만 add로 일관성이 확보됨
 * 
 * 	public void addManager(Manager m){// }
 * 	public void addEngineer(Engineer eg){// } 
 * 	public void addSecretary(Secretary sc){// }
 * 
 * 3step .. 2단계와 비슷하지만 훨씬더 일관성과 가독성을 높인다.
 * ::
 * 부모로 자식을 묶어 사용하면 가독성 좋다  : Method overloading
 * 	public void addEmployee(Manager m){// }
 *  public void addEmployee(Engineer eg){// } 
 *  public void addEmployee(Secretary sc){// }
 * 
 * 4step .. 3단계와 같은 역할을 하지만 단 1번만 정의하면 된다.
 * ::
 * 	public void addEmployee (Employee e){
 * 		if(e instance Manager){
 * 		}if(e instance Engineer){
 * 		}if(e instance Secretary){
 * 		}
 *	}
 * 
 */
public class EmployeeServiceImpl implements EmployeeService{
	public void manageEmployee(Employee  e) {
		if(e instanceof Engineer) {
			System.out.println("Engineer 의 연봉 -----------");
			System.out.println();
		}if(e instanceof Manager){
			System.out.println("Manager 의 부서를 변경 ----------");
			((Manager)e).changeDept("오락부");
		}	

	}//main
   public void printAllEmployee(Employee[ ] emps) {
	      for(Employee e : emps)
	         System.out.println(e.getDetails());
   }//


}//class
