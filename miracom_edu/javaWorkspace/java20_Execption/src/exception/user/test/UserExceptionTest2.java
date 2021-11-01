package exception.user.test;

import java.util.Scanner;

class UnderAgeException extends Exception{
	UnderAgeException(){
		this("This is UnderAgeException ..");
	}
	UnderAgeException(String message){
		super(message);
	}
}
class AdultMovieService{
	public void entrance(int age) throws UnderAgeException {
		if(age>=19) {
			//19세 이상만 성인영화 입장 가능하고/그렇지 않은 경우에 빠꾸
			System.out.println("Ticketing...OK...Entrance!!");
		}else {
			throw new UnderAgeException("아직 미성년자 이십니다...ㅜ..ㅜ");
		}
	}
}
public class UserExceptionTest2 {
	public static void main(String[] args) {
		AdultMovieService service = new AdultMovieService();
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력>>>");
		int age = sc.nextInt();
		try {
			service.entrance(age);
		}catch(UnderAgeException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("10시가 되어서 마지막 영화를 상영합니다..");
		}
		
		System.out.println("극장문을 닫습니다...손님들께서는 다 나가주시기 바랍니다.");
	}
}






