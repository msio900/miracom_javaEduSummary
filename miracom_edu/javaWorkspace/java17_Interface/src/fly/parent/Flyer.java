package fly.parent;
/*
 * 인터페이스는
 * 구현부가 없는
 * 기능의 Template(추상적인 기능)들 만으로 구성된다.
 * ::
 * 인터페이스의 구성요소
 * 1)Template기능(추상메소드)
 * 2)public static final 상수 -- 필드가 아님..
 */
public interface Flyer {
	int SPEED = 100; //인터페이스안에서는 무조건 변수 앞에 public static final이 붙는다
	
	//구현부가 없는 메소드 선언일때는 abstract키워드를 붙여야 한다.
	public abstract void fly();//fly()...어떻게 구체적으로fly하는지는 명시되어있지 않음
	void land(); //인터페이스안에서는 무조건 앞에 public abstract이 붙는다.
	void take_off();
}
