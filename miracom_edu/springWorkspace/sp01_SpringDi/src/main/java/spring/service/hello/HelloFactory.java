package spring.service.hello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * FileName : HelloFactory.java
 * ㅇ hello.properties file(부가정보,Meta-Data) 의 내용을 읽어 Hello instance 를 생성 return.
 */
public class HelloFactory {
	///Field
	private Hello hello;
	private Properties properties;
	private static HelloFactory helloFactory;
	
	///Constructor Method
	private HelloFactory(){
	}
	
	///Method
	//==> HelloFactory instance 를  return 하는 static method(SingleTon) 
	public synchronized static  HelloFactory getInstance() {
		if( helloFactory == null){
			helloFactory = new HelloFactory();
		}
		return helloFactory;
	}
	
	//==> properties file 을 추상화,캡슐화한  java.util.Properties instance 생성 
	public void setConfigResource(String configResource) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(configResource);
			properties = new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("1. hello.proerties 파일을 찾을수 없음.");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("2. hello.proerties 파일 초기화 시 오류 발생.");
		}finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();	
				}
			}
		}
	}	

  	//==> name 에 해당하는 instance 생성:: default constructor  
	private void newInstanceHello(String name){
		
		String className = properties.getProperty(name).trim();  //==> trim() 앞뒤 공백 trim
		System.out.println("!! debug=>hello.properties 에서 추출한 className : "+className);

		try {
			Class  cls = Class.forName(className);
			Object obj = cls.newInstance();
			//==> Hello Instance 확인
			if( obj instanceof Hello){
				this.hello = (Hello)obj;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("1. "+className +"의 이름을 갖는 class가 없음.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("2. "+className +"의 instance 생성시 문제 발생.");
		}
	}
	
  	//==> Hello instance 생성하는 newInstanceHello() 호출 및 Hello instance 를 return
	public Hello getBean(String name){
		this.newInstanceHello(name);
		return hello;
	}
	
}//end of class