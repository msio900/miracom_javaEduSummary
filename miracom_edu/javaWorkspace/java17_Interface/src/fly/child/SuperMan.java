package fly.child;

import fly.parent.Flyer;

/*
 * �������̽��� ��ӹ޴� Ŭ������
 * �ݵ�� �������̽��� �߻�޼ҵ带
 * �����ؾ��Ѵ�.
 */
public class SuperMan implements Flyer{

	@Override
	public void fly() {		
		System.out.println("SuperMan fly...");
	}
	@Override
	public void land() {		
		System.out.println("SuperMan land...");
	}

	@Override
	public void take_off() {
		System.out.println("SuperMan take_off...");
	}
	
	//SuperMan���� ���
	public String stop_bullet() {
		return "���Ƿ� �Ѿ��� ����";
	}
	
}




