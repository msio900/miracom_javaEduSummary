package spring.service.dice.test;

import spring.service.dice.impl.DiceAImpl;
import spring.service.dice.impl.DiceBImpl;
import spring.service.dice.play.Player02;

/*
 * FileName : DiceTestApp01.java
 * ㅇ DiceA / Player01 Test 하는 Application 
 */
public class DiceTestApp02 {
	///Main Method
	//곤솔창 반드시 확인!!!
	public static void main(String[] args){
		//생성자를 이용 사용할 Dice인 DiceImpl 객체를 생성자를 통해서 주입..
			Player02 player01 = new Player02(new DiceAImpl());
			player01.playDice(3);
			System.out.println("=======================");
			System.out.println("선택된 주사위 수의 통합은 : "+player01.getTotalValue());
			System.out.println("=======================\n\n");
				
			
			//setter 메소드를 이용해서 사용할 DiceImpl 객체를 주입함..
			Player02 player02 = new Player02();
			player02.setDice(new DiceBImpl());
			player02.playDice(3);
			System.out.println("=======================");
			System.out.println("선택된 주사위 수의 통합은 : "+player02.getTotalValue());
			System.out.println("=======================\n\n");
	
			//setter 메소드를 이용해서 사용할 DiceImpl 객체를 주입함..
			Player02 player03 = new Player02();
			player03.setDice(new DiceBImpl());
			player03.playDice(3);
			System.out.println("=======================");
			System.out.println("선택된 주사위 수의 통합은 : "+player03.getTotalValue());
			System.out.println("=======================\n\n");
			/*
			 * 코드에 new 키워드가 존재하는 한,
			 * 객체 생성을 직접해야하는 한,
			 * 결합도를 완벽하게 없앨 수 없다...(아무리 인터페이스를 사용하더라도...)
			 * ::
			 * DI Container(Core Container, Bean Container)
			 * 코드에서 new를 사용하지 않는 방법은, 즉 객체 생성을 직접하지 않는 방법은
			 * 자바 클래스를 (컴포넌트를) 생성하는 컨테이너를 사용하는 것이다.
			 * 이것이 바로 DI이다.
			 */
			Player02 player04 = new Player02();
			player04.setDice(new DiceBImpl());
			player04.playDice(3);
			System.out.println("=======================");
			System.out.println("선택된 주사위 수의 통합은 : "+player03.getTotalValue());
			System.out.println("=======================\n\n");
			}
		}//end of class
 
