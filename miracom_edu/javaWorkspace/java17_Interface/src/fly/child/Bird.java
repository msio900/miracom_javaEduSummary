package fly.child;

import fly.parent.Flyer;

/*
 * �������̽��� ��ӹ޴� Ŭ������
 * �ݵ�� �������̽��� �߻�޼ҵ带
 * �����ؾ��Ѵ�.
 */
public class Bird implements Flyer{

	@Override
	public void fly() {		
		System.out.println("Bird fly...");
	}
	@Override
	public void land() {		
		System.out.println("Bird land...");
	}

	@Override
	public void take_off() {
		System.out.println("Bird take_off...");
	}
	//Bird���� ���..
	public String layEggs() {
		return "���� ����";
	}
	
	public String buildNest() {
		return "������ ����";
	}	
}
