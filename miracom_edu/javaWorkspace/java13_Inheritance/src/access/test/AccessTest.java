package access.test;

import access.child.Child;

public class AccessTest {

	public static void main(String[] args) {
		//1. �ڽ��� �����Ǹ� �θ� ���������Ѵ�.(�θ� �������� ������ �ڽ��� �������� �ʴ´�.) O
		//2. �ڽ��� �����Ǹ� �θ� ��������� �ʾƵ� �ȴ�. X
		// �θ������ ���� ������ ����ȴ�...
		Child c = new Child();
	
		c.access();
	}
}
