package project01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;



public class 공연DAO {
	public ArrayList<공연VO> list()  {
		
		ResultSet rs = null;
		ArrayList<공연VO> list = new ArrayList<>();
		공연VO bag = null;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. 오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from hr.공연";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			//ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();// select문 전송시 결과가 테이블형태라서 변경.
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) {//1.rs.next가 참이면
				//System.out.println("검색결과있음. 성공.");
				//2. 각 컬럼에서 값들을 꺼내오자
				String 공연ID = rs.getString(1); // id
				String 제목 = rs.getString(2); // pw
				String 위치 = rs.getString(3); // name
				Date 공연시작일 = rs.getDate(4); // tel
				Date 공연종료일 = rs.getDate(5); // tel				
				int 가격 = rs.getInt(6); // tel
				String 이미지파일 = rs.getString(7); // pw
				//System.out.println(id2 + " " + pw + " " + name + " " + tel);
				//3. 가방을 만들자.
				bag = new 공연VO();
				bag.set공연ID(공연ID);
				bag.set제목(제목);
				bag.set위치(위치);
				bag.set공연시작일(공연시작일);
				bag.set공연종료일(공연종료일);
				bag.set가격(가격);
				bag.set이미지파일(이미지파일);
				//4. list에 bag을 추가해주자.
				list.add(bag);
			} 

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return id, pw, name, tel은 XXXXX!
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		return list;

	}
	
	public 공연VO 가격조회(String 공연ID) {
		ResultSet rs = null; 
		공연VO bag = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에ㄱ러나신 분들만!!!

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select 가격 from hr.공연 where 공연ID = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, 공연ID);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();// select문 전송시 결과가 테이블형태라서 변경.
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			if (rs.next()) {
				System.out.println("검색결과있음. 성공.");
				int 가격 = Integer.parseInt(rs.getString(1)); // 
				
				System.out.println("가격 확인 완료 " +가격+ "원");
				bag = new 공연VO();
				bag.set가격(가격);
			} else {
				System.out.println("검색결과없음. 성공.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;

	}
	
	public 공연VO 공연제목위치조회(String 공연ID) {
		ResultSet rs = null; 
		공연VO bag = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에ㄱ러나신 분들만!!!

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select 제목, 위치 from hr.공연 where 공연ID = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, 공연ID);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();// select문 전송시 결과가 테이블형태라서 변경.
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			if (rs.next()) {
				System.out.println("검색결과있음. 성공.");
//				int 가격 = Integer.parseInt(rs.getString(1)); // 
				String 제목 = rs.getString(1);
				String 위치 = rs.getString(2);
				
				System.out.println(제목 + " " + 위치);
				bag = new 공연VO();
				bag.set제목(제목);
				bag.set위치(위치);
			} else {
				System.out.println("검색결과없음. 성공.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;

	}
	
}