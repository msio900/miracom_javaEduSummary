package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading{
	public void readFile(String filename) {
		// File�� �б� ���� ����� ������ �ִ� Ŭ������ ����...FileReader����
		// FileReader ��ü�� �����ϸ� ������ ���ܰ� �������� �������.
		// ��ü�� �����ϸ� ������ ������!!
		try {
		FileReader fr = new FileReader(filename);
		System.out.println("FileReader Creating...");
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
			/*
			 * 1. ����ΰų�...
			 * 2. e.printStackTrace(), e.getMessage()
			 * 3. System.out.println("������ ã�� ���߽��ϴ�.");
			 */
		}
		System.out.println("file...end...");
	}//readFile
}//class

public class CompileTest1 {

	public static void main(String[] args) {
		FileReading fr = new FileReading();
		String path = "C:\\Users\\kimminsung\\OneDrive\\miracom_institute\\miracom_javaEduSummary\\miracom_edu\\util\\message.txt";
		
		fr.readFile(path);
		
		System.out.println("������ �� �о�鿴���ϴ�..");
	}

}
