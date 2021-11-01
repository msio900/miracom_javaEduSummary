package exception.user.test;
/*
 * 사용자 정의 예외
 * 
 * 1. 내가 직접 Exception 클래스를 정의해서 사용.
 * 2. 어떤 특정한 조건이 되었을때, 내가 고의적으로 예외를 발생시키는것.
 * --> 사용자 정의 Exception은 하나의 강력한 제어문으로 사용된다.!!
 */

//해당 클래스를 Exception으로 만드려면 어떻게 선언해야 할까요?!

class ZeroDevide extends Exception{
	ZeroDevide(){
		this("This is ZeroDevide Exception...");
	}
	ZeroDevide(String message){
		super(message);
	}
}


class User{
	//
	public void go() throws ZeroDevide {
		//스캐너로 i, j 값을 실행시점에서 입력받는 상황...
		int i =10; int j =0;
		System.out.println("1. i, j에 입력된 값으로 연산을 진행합니다...");
		if(j==0) {
			//ArismeticException...을 발발 시켜야한다.
			throw new ZeroDevide("분모가 0이면 안되요!!");
			//throw new ZeroDevide();
		}
		//이 부분에서  i/j (10/0)..ArimeticException.. 이런 연산이 진행되는 상황이라고 가정하자...
	}
}

public class UserExceptionTest1 {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("2. go() calling...");
		try {
		user.go();
		}catch(ZeroDevide e){
			//System.out.println("날라온 폭탄을 처리했습니다...");
			//System.out.println(e.getMessage());
			//이 기능을 안쓰는 추세이다.
			//e.getStackTrace();
		}
		System.out.println("3. 프로그램을 종료합니다..");
	}
}
