package exception.compile.test;
/*
 * ���ܸ� ��������� ó���ϴ� ���
 * try{
 * 
 * }catch(���� ��ü) {
 * 
 * }finally{
 * 		//���� �߻��� �������...������ ����Ǿ����� �ϴ� ����
 * }
 * ::
 * finally ������ ������� �ʴ� ���
 * 1. ���� �� ������ ���ؼ� ��ǻ���� �Ŀ��� ���� ���
 * 2. finally ��� �ȿ��� �Ǵٸ� ���ܰ� �߻��� ��� -- ���� �̰��
 *   --> ���ܸ� �ٽ� ó���ϰ� finally�� ����
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading2{
	public void readFile(String filename) {
		// File�� �б� ���� ����� ������ �ִ� Ŭ������ ����...FileReader����
		// FileReader ��ü�� �����ϸ� ������ ���ܰ� �������� �������.
		// ��ü�� �����ϸ� ������ ������!!
		FileReader fr = null;// try�ȿ��� local������ ������ �ذ��ϱ����� �� �ܰ� ������ ������.
		try {
			//Stream�ڿ��� ��� ����ϰڴ�. == ��ü ������ �ǹ�
		fr = new FileReader(filename);
		//
		System.out.println("FileReader Creating...");
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}finally {
			//������ ��� ����� �ڿ��� finally�� �ȿ��� �ݾ��ش�.
			try {
				fr.close();
				System.out.println("�ڿ��� �ݽ��ϴ�..");
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
		
		System.out.println("������ �� �о�鿴���ϴ�..");
	}

}
