package exception.compile.test;
/*
 * 예외를 명시적으로 처리하는 방법
 * try{
 * 
 * }catch(예외 객체) {
 * 
 * }finally{
 * 		//예외 발생과 상관없이...무조건 수행되어져야 하는 구분
 * }
 * ::
 * finally 구문이 실행되지 않는 경우
 * 1. 원인 모를 이유에 의해서 컴퓨터의 파워가 꺼진 경우
 * 2. finally 블락 안에서 또다른 예외가 발생한 경우 -- 지금 이경우
 *   --> 예외를 다시 처리하고 finally를 수행
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading2{
	public void readFile(String filename) {
		// File을 읽기 위한 기능을 가지고 있는 클래스를 제공...FileReader생성
		// FileReader 객체를 생성하면 무조건 예외가 터지도록 만들었다.
		// 객체를 생성하면 무조건 생성자!!
		FileReader fr = null;// try안에의 local변수의 문제를 해결하기위해 한 단계 위에서 선언함.
		try {
			//Stream자원을 열어서 사용하겠다. == 객체 생성의 의미
		fr = new FileReader(filename);
		//
		System.out.println("FileReader Creating...");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}finally {
			//위에서 열어서 사용한 자원은 finally블럭 안에서 닫아준다.
			try {
				fr.close();
				System.out.println("자원을 닫습니다..");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("file...end...");
	}//readFile
}//class

public class CompileTest2 {

	public static void main(String[] args) {
		FileReading2 fr = new FileReading2();
		String path = "C:\\Users\\kimminsung\\OneDrive\\miracom_institute\\miracom_javaEduSummary\\miracom_edu\\util\\message.txt";
		
		fr.readFile(path);
		
		System.out.println("파일을 잘 읽어들였습니다..");
	}

}
