package fly.parent;
/*
 * �������̽���
 * �����ΰ� ����
 * ����� Template(�߻����� ���)�� ������ �����ȴ�.
 * ::
 * �������̽��� �������
 * 1)Template���(�߻�޼ҵ�)
 * 2)public static final ��� -- �ʵ尡 �ƴ�..
 */
public interface Flyer {
	int SPEED = 100; //�������̽��ȿ����� ������ ���� �տ� public static final�� �ٴ´�
	
	//�����ΰ� ���� �޼ҵ� �����϶��� abstractŰ���带 �ٿ��� �Ѵ�.
	public abstract void fly();//fly()...��� ��ü������fly�ϴ����� ��õǾ����� ����
	void land(); //�������̽��ȿ����� ������ �տ� public abstract�� �ٴ´�.
	void take_off();
}
