package com.edu.service;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;

/*
 * Employee �� �ڽ�Ŭ������
 * Manager, Engineer, Secretary ��ü���� �ڵ鸵�ϴ� ��ɸ����� ������� ServiceŬ����..
 * 
 * 							Employee
 * 
 * 
 * 
 *  			Manager     Engineer     Secretary
 * 
 * 
 * 
 * 1step .. ���� ������������ �� ������ �ڵ鸵�Ҷ� ����ϴ� �޼ҵ� ���
 * ::
 * sub��ü���� �߰��� ���� �� ����� �����ϴ� ��� 
 * ������ �Ʒ�ó�� �޼ҵ� ���ǰ� �߸��Ǿ���. : ���� �ٸ� funcó�� ��������. �ڵ��� �������� ��û ��������. �׷��� ���� ������ �ڵ�
 * 
 * 	public void addManager(Manager m){// }
 *  public void insertEngineer(Engineer eg){// }
 *  public void manageSec(Secretary sc){// }
 *  
 *  �׷���  func������ ���� �������� ��������ƴ����� ǥ�����ִ� ���� �߿��ϴ�
 *  
 * 2step .. 1�ܰ� ���ٴ� ���� ���� ����...
 * ::
 * �ϰ����� �ִ�. identifier�� �ٸ����� add�� �ϰ����� Ȯ����
 * 
 * 	public void addManager(Manager m){// }
 * 	public void addEngineer(Engineer eg){// } 
 * 	public void addSecretary(Secretary sc){// }
 * 
 * 3step .. 2�ܰ�� ��������� �ξ��� �ϰ����� �������� ���δ�.
 * ::
 * �θ�� �ڽ��� ���� ����ϸ� ������ ����  : Method overloading
 * 	public void addEmployee(Manager m){// }
 *  public void addEmployee(Engineer eg){// } 
 *  public void addEmployee(Secretary sc){// }
 * 
 * 4step .. 3�ܰ�� ���� ������ ������ �� 1���� �����ϸ� �ȴ�.
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
			System.out.println("Engineer �� ���� -----------");
			System.out.println();
		}if(e instanceof Manager){
			System.out.println("Manager �� �μ��� ���� ----------");
			((Manager)e).changeDept("������");
		}	

	}//main
   public void printAllEmployee(Employee[ ] emps) {
	      for(Employee e : emps)
	         System.out.println(e.getDetails());
   }//


}//class
