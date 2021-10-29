package fly.child;

import fly.parent.Flyer;

/*
 * 인터페이스를 상속받는 클래스는
 * 반드시 인터페이스의 추상메소드를
 * 구현해야한다.
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
	
	//SuperMan만의 기능
	public String stop_bullet() {
		return "망또로 총알을 막다";
	}
	
}




