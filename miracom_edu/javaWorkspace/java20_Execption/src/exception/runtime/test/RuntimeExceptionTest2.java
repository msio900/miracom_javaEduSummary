package exception.runtime.test;
/*
 * catch�� ������ �� �� �ִ�.
 * ������ �� �߿��� �ϳ��� catch�� ����ȴ�.
 * 
 */

import java.awt.image.AreaAveragingScaleFilter;

import javax.management.openmbean.ArrayType;

public class RuntimeExceptionTest2 {

   public static void main(String[] args) {
      String[ ] str = {
            "Hello JAVA",
            "No, I Mean it",
            "Nice to meet you"
      };
      int i =0;
      while(i<=3) {
         try {
            System.out.println(str[i]);
         }catch(NullPointerException e) {
            System.out.println("Nice Catch1~~~!!");
         }catch(ArithmeticException e) {
            System.out.println("Nice Catch2~~~!!");
         }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Nice Catch3~~~!!");
         }
			i++;
		}//
		System.out.println("while loop the end...");
	}//
}//