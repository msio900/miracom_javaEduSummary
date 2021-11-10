package web.servlet.life;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * LIFE2의 문제점
 * 1.서버가 꺼지게되면 필드값을 영구적으로 잃어버리게 된다.
 * 		서블릿 인스턴스가 Death되기 때문에 그안에 저장된 필드값도 함께 사라진다.
 *
 * 		--> 해결책?
 * 		데이터를 어딘가에 저장하는 메커니즘...라이프사이클 method를 연계해서 
 * 		DB, 파일로...
 * 
 * 		destroy() : 꼴까닥 하기 직전...저장....16...200												--> Setter(Writer)
 * 		init()	 : 새롭게 Ready On할때...어딘가에 저장된 이전의 값을 다시 찾아옴(getting)..17...200-201		--> Getter(Reading)
 * 
 */

@WebServlet("/LIFE3")
public class LifeCycleTest3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count = 0;   
	private String path = "C:\\Users\\kimminsung\\OneDrive\\miracom_institute\\miracom_javaEduSummary\\miracom_edu\\util\\count.txt";
		

	   
    public LifeCycleTest3() {
    	System.out.println("1. Servlet 생성됨......by container");
    }
	

    public void init() throws ServletException {
    	System.out.println("2. init() call...by container");
		 //파일에 저장된 내용을 불러온다..
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(path));
			 String str = br.readLine();
			 
			 count = Integer.parseInt(str);
			 System.out.println("count.txt값을 읽어서 필드에 다시 할당했습니다..");
		 }catch(Exception e) {
			 System.out.println("파일을 읽어들이는데 실패했습니다.");
		 }

	}

	
	public void destroy() {
		 System.out.println("4. destroy() call...by container");
		 
		 //서블릿 인스턴스가 메모리에서 영구적으로 삭제 되기 직전의 값을 파일에 저장...
		 File f = new File(path);
		 try {
			PrintWriter pw = new PrintWriter(new FileWriter(f));
			pw.println(count);
			pw.close();
			System.out.println(path+" COUNT값 : "+count+", 파일 저장 성공!!");
		} catch (Exception e) {
			System.out.println("파일 출력 실패...");
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("3. service()...doGet() call...by container");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		//client가 요청을 할때마다 몇번 요청을 했는지...알수 있도록 count를 증가
		out.println("<html><body bgcolor='yellow'>");
		out.println("<h3>Life Cycle CallBack Method ...</h3>");
		out.println("<b>COUNT :: "+ ++count +"</b>");			//33
		out.println("</body></html>");

	}
}
