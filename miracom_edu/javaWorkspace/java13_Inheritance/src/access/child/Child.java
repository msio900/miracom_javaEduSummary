package access.child;

import access.parent.Parent;

/*
 * Parent�� �ڽ� Ŭ����...
 */
public class Child extends Parent{
	@Override
	public void access() {
		System.out.println(publicTest);		//�������
		System.out.println(protectedTest);	//�������
		//System.out.println(defaultTest);	//���ٺҰ�
		//System.out.println(privateTest);	//���ٺҰ�
		
		System.out.println("��Ӱ���� public, protected �����ڸ� ���� ����!!");
		
	}
}
