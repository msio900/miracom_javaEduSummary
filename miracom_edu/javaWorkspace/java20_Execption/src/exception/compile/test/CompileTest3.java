package exception.compile.test;
/*
 * ���ܸ� ó���ϴ� ���
 * 1. ��������� �� �ڸ����� �ﰢ������ ó��
 * 	try~catch
 * 2. �ﰢ������ ó������ �ʰ� �߻��� ���ܸ� ������ ���
 * 	throws !
 * ::
 * 3.��� ������� ���ܸ� ó���Ұ��ΰ�? 
 * 1, 2�� �Ѵ� ����.
 * ���� ó���ϴ� ������ ������.
 * throws / catch~tryó��
 * 	finally�� �Բ� ����� �Ѵ�.
 * 	catch�������� ���ܸ޽����� ��� ���?
 * 
 * 				IOException
 * 					|
 * 				FileNotFounds
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading3{
							//readFile method�� ȣ���� ������ ���ܰ� ��������!!!
							//IOException�ϳ��� ������ ��.
	public void readFile(String filename) throws FileNotFoundException, IOException {
		//�߻��� ���ܰ�ü�� ������...
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
										//main method�� ȣ���� ��(JVM)���� ���ܰ� ��������!!
	public static void main(String[] args)  {
		FileReading3 fr = new FileReading3();
		String path = "C:\\Users\\kimminsung\\OneDrive\\miracom_institute\\miracom_javaEduSummary\\miracom_edu\\util\\message.txt";
		try {
			fr.readFile(path);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		System.out.println("������ �� �о�鿴���ϴ�..");
	}
}
