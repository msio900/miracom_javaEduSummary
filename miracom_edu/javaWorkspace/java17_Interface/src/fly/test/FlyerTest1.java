package fly.test;

import fly.child.AirPlane;
import fly.child.Bird;
import fly.child.SuperMan;
import fly.parent.Flyer;

/*
 * 인터페이스는 객체 생성 대상이 될 수 없다.
 * --> 
 */
public class FlyerTest1 {
	public static void main(String[] args) {
		//Flyer f1 = new Flyer();
		//인터페이스는 객체생성의 대상은 못되지만...Type으로서는 존재한다.
		Flyer bird = new Bird();
		Flyer airplane = new AirPlane();
		Flyer superman = new SuperMan();
		
		Flyer[ ] flyers = {
				bird,airplane,superman
		};
		
		for(Flyer f : flyers) {
			if(f instanceof Bird) {
				System.out.println(((Bird) f).layEggs());
				f.fly();
				f.land();
				System.out.println("----------------------");
			}
			if(f instanceof SuperMan) {
				System.out.println(((SuperMan) f).stop_bullet());
				f.fly();
				f.land();
				System.out.println("----------------------");
			}
		}//for		
	}//main
}//class








