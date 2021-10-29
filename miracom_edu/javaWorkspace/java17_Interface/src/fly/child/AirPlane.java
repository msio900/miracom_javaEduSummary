package fly.child;

import fly.parent.Flyer;

/*
 * 인터페이스를 상속받는 클래스는
 * 반드시 인터페이스의 추상메소드를
 * 구현해야한다.
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
