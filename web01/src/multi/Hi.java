package multi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Hi extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("service()메서드가 호출됨.. 여기 있는 내용이 실행될 예정입니다!");
	String id = request.getParameter("id");
	System.out.println("서버에서 받은 id 데이터는 " + id);
	String pw = request.getParameter("pw");
	System.out.println("서버에서 받은 pw 데이터는 " + pw);
	}

}
