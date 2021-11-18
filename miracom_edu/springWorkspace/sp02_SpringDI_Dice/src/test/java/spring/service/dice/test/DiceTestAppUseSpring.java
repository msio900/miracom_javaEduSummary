package spring.service.dice.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import spring.service.dice.play.Player02;

/*
 * 					BeanFactory
 * 						|
 * 					XmlBeanFactory
 * 
 * DIContainer(Bean Container, Core Container) 클래스 객체
 * DIContainer 하는 일
 * 1. 주문서를 읽어들인다.(~.xml Bean Configuration File) --> 개발자 역할
 * 														-->  컨테이너 역할
 * 2. Bean을 생성 함.
 * 3. Bean을 저장함.
 */
public class DiceTestAppUseSpring {
	public static void main(String[] args) {
		BeanFactory factory = 
				new XmlBeanFactory(new FileSystemResource("./src/main/resources/config/diceservice.xml"));
		//xml 하나씩 하면서 이곳에서 하나씩 테스트한다...
		Player02 player01 = (Player02)factory.getBean("player01");
		player01.playDice(3);
		System.out.println("======================");
		System.out.println("선택된 주사위 수의 통합은 :"+ player01.getTotalValue());
		System.out.println("=============\n\n");
		
		Player02 player02 = (Player02)factory.getBean("player02");
		player02.playDice(3);
		System.out.println("======================");
		System.out.println("선택된 주사위 수의 통합은 :"+ player02.getTotalValue());
		System.out.println("=============\n\n");
		
		
		Player02 player03 = (Player02)factory.getBean("player03");
		player03.playDice(3);
		System.out.println("======================");
		System.out.println("선택된 주사위 수의 통합은 :"+ player03.getTotalValue());
		System.out.println("=============\n\n");
		
		Player02 player04 = (Player02)factory.getBean("player04");
		player04.playDice(3);
		System.out.println("======================");
		System.out.println("선택된 주사위 수의 통합은 :"+ player04.getTotalValue());
		System.out.println("=============\n\n");
		
		//여러분이 직접 구현하시길 바랍니다.
		Player02 player = (Player02)factory.getBean("player");
		player.playDice(3);
		System.out.println("======================");
		System.out.println("선택된 주사위 수의 통합은 :"+ player.getTotalValue());
		System.out.println("=============\n\n");

		
	}
	
}//end of class