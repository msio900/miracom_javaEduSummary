package fly.child;

import fly.parent.Flyer;

/*
 * �������̽��� ��ӹ޴� Ŭ������
 * �ݵ�� �������̽��� �߻�޼ҵ带
 * �����ؾ��Ѵ�.
 */
public class AirPlane implements Flyer{

	@Override
	public void fly() {		
		System.out.println("AirPlane fly...");
	}
	@Override
	public void land() {		
		System.out.println("AirPlane land...");
	}

	@Override
	public void take_off() {
		System.out.println("AirPlane take_off...");
	}
	
}
