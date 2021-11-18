package spring.service.dice.impl;

import java.util.Random;

import spring.service.dice.Dice;

public class DiceDImpl implements Dice{
	private int value;
	
	public DiceDImpl() {
		System.out.println("::"+getClass().getName()+"() 호출...");
	}
	
	@Override
	public int getValue() {		
		return value;
	}

	@Override
	public void selectedNumber() {
		value = new Random().nextInt(6) + 1;		
	}
}
