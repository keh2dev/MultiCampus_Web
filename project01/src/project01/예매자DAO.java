package project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;

public class 예매자DAO {

	public int 예매자추가(예매자VO bag) {
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US);

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			String sql = "insert into HR.예매자 values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.get전화번호());
			ps.setString(2, bag.get이메일());
			ps.setString(3, bag.get이름());
			
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");

			if (result == 1) {
				System.out.println("예매자추가 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(result);
		return result;

	}
	
	public 예매자VO 예매자조회(String 전화번호) {
		ResultSet rs = null; 
		예매자VO bag = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에ㄱ러나신 분들만!!!

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select * from hr.예매자 where 전화번호 = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, 전화번호);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();// select문 전송시 결과가 테이블형태라서 변경.
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			if (rs.next()) {
				System.out.println("검색결과있음. 성공.");
//				int 가격 = Integer.parseInt(rs.getString(1)); // 
				String 이메일 = rs.getString(2);
				String 이름 = rs.getString(3);
				
				System.out.println(이메일 + " " + 이름);
				bag = new 예매자VO();
				bag.set이메일(이메일);
				bag.set이름(이름);
			} else {
				System.out.println("검색결과없음. 성공.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;

	}
	
	public int 예매자정보수정(예매자VO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.KOREA); // 맥 locale에러나신 분들만!!!
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			String sql = "update hr.예매자 set 이메일 = ?, 이름 =? where 전화번호 = ?"; // id가 ?인(조건) tel을 ?로 바꾸어라.
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.get이메일());
			ps.setString(2, bag.get이메일());
			ps.setString(3, bag.get전화번호());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			// int 일때는 ps.setInt(2, NO);

			result = ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (result == 1) {
				System.out.println("예매자 기존 정보 수정 성공!");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(result);
		return result;
	}

	
}
