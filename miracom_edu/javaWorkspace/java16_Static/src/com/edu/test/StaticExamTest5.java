package com.edu.test;
/*
 * Singletone Pattern �ڵ� �ۼ���� �ܰ�
 * ::
 * �ϳ��� Ŭ�����κ��� ���� �ϳ��� ��ü���� �����ϴ� ����
 * ::
 * 1. private static���� �ش� Ŭ�������� ��ü�� �ϴ� �ϳ��� ����
 * 2. �ٸ� ������ ��ü������ ���ϵ��� ������ �տ� private
 * 3. �ϳ� �������� ��ü�� �������⼭ ������ ���� �ֵ��� public static���� �����ϴ� ����� �����
 */
class Factory{
	private static Factory factory = new Factory();//1
	private Factory(){ //2.
		System.out.println("Factory Only One Creating...");
	}
	public static Factory getInstance() { //3
		return factory;
	}
}
public class StaticExamTest5 {
	public static void main(String[] args) {
		System.out.println("Singtone Pattern.....");
		
		//Factory factory1 = new Factory();
		
		//getInstance()�� ������ ȣ���ؼ� Factory��ü�� ������ ���Ϲ޾Ҵ�
		//�̶� factory1, factory2, factory3�� ���� �ٸ� ��ü�� �ƴ��� ��� Ȯ��?
		Factory factory1=Factory.getInstance();
		Factory factory2=Factory.getInstance();
		Factory factory3=Factory.getInstance();
		
		System.out.println(factory1);
		System.out.println(factory2);
		System.out.println(factory3);
	}
}








