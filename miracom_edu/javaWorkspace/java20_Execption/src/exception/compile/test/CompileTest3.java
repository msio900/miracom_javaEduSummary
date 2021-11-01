package exception.compile.test;
/*
 * 예외를 처리하는 방법
 * 1. 명시적으로 그 자리에서 즉각적으로 처리
 * 	try~catch
 * 2. 즉각적으로 처리하지 않고 발생한 예외를 던지는 방법
 * 	throws !
 * ::
 * 3.어느 방법으로 예외를 처리할것인가? 
 * 1, 2번 둘다 쓰임.
 * 예외 처리하는 패턴이 존재함.
 * throws / catch~try처리
 * 	finally를 함께 써줘야 한다.
 * 	catch구문에서 예외메시지를 어떻게 출력?
 * 
 * 				IOException
 * 					|
 * 				FileNotFounds
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading3{
							//readFile method를 호출한 곳으로 예외가 던져진다!!!
							//IOException하나만 던져도 됨.
	public void readFile(String filename) throws FileNotFoundException, IOException {
		//발생한 예외객체를 던진다...
		FileReader fr = null;
		try {
		fr = new FileReader(filename); // FileNotFoundException
		
		System.out.println("FileReader Creating...");
		System.out.println("file...end...");
		}finally{
			fr.close();
		}
	}//readFile
}//class

public class CompileTest3 {
										//main method를 호출한 곳(JVM)으로 예외가 던져진다!!
	public static void main(String[] args)  {
		FileReading3 fr = new FileReading3();
		String path = "C:\\Users\\kimminsung\\OneDrive\\miracom_institute\\miracom_javaEduSummary\\miracom_edu\\util\\messa.txt";
		try {
			fr.readFile(path);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage()); //sysout안에서 출력
		} catch (IOException e) {
			System.out.println(e.getMessage()); //sysout안에서 출력
			System.out.println("그런 파일은 없습니다.");
		}
		System.out.println("파일을 잘 읽어들였습니다..");
	}
}
/*
printStackTrace()
getMessage()
둘 다 예외가 발생한 원인에 대해서 메세지를 출력하는 기능을 한다.

 둘 다 일반적으로
 catch문 안에서 사용되어지는 기능이다.
 */