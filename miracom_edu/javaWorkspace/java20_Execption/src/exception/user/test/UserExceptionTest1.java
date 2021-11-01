package exception.user.test;
/*
 * ����� ���� ����
 * 
 * 1. ���� ���� Exception Ŭ������ �����ؼ� ���.
 * 2. � Ư���� ������ �Ǿ�����, ���� ���������� ���ܸ� �߻���Ű�°�.
 * --> ����� ���� Exception�� �ϳ��� ������ ������� ���ȴ�.!!
 */

//�ش� Ŭ������ Exception���� ������� ��� �����ؾ� �ұ��?!

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
		//��ĳ�ʷ� i, j ���� ����������� �Է¹޴� ��Ȳ...
		int i =10; int j =0;
		System.out.println("1. i, j�� �Էµ� ������ ������ �����մϴ�...");
		if(j==0) {
			//ArismeticException...�� �߹� ���Ѿ��Ѵ�.
			throw new ZeroDevide("�и� 0�̸� �ȵǿ�!!");
			//throw new ZeroDevide();
		}
		//�� �κп���  i/j (10/0)..ArimeticException.. �̷� ������ ����Ǵ� ��Ȳ�̶�� ��������...
	}
}

public class UserExceptionTest1 {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("2. go() calling...");
		try {
		user.go();
		}catch(ZeroDevide e){
			//System.out.println("����� ��ź�� ó���߽��ϴ�...");
			//System.out.println(e.getMessage());
			//�� ����� �Ⱦ��� �߼��̴�.
			//e.getStackTrace();
		}
		System.out.println("3. ���α׷��� �����մϴ�..");
	}
}
