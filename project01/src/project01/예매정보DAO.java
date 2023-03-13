package project01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class 예매정보DAO {

	public int 예매후예매번호반환(예매정보VO bag) {
		int result = 0;
		ResultSet rs = null;
		int 예매번호 = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US);

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			String sql = "insert into HR.예매정보 values (HR.TICKET_SEQ.NEXTVAL, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.get공연ID());
			ps.setString(2, bag.get예매전화번호());
			ps.setDate(3, bag.get예매일자());
			ps.setString(4, bag.get좌석());
			ps.setInt(5, bag.get결제금액());

			String sql2 = "SELECT HR.TICKET_SEQ.currval FROM dual";
			PreparedStatement ps2 = con.prepareStatement(sql2);

			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();
			rs = ps2.executeQuery();// select문 전송시 결과가 테이블형태라서 변경.
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (rs.next()) {
				System.out.println("검색결과있음. 성공.");
				예매번호 = Integer.parseInt(rs.getString(1)); //
				System.out.println("예매번호 : " + 예매번호);
			} else {
				System.out.println("검색결과없음. 성공.");
			}

			if (result == 1) {
				System.out.println("예매 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(예매번호);
		return 예매번호;

	}

	public int 예매취소(예매정보VO bag) {
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.KOREA); // 맥 locale에러나신 분들만!!!

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			String sql = "delete from hr.예매정보 where 예매번호 = ? and 예매전화번호 = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, bag.get예매번호());
			ps.setString(2, bag.get예매전화번호());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (result == 1) {
				System.out.println("예매취소 성공");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	// 예매일자 수정
	public int 예매일자수정(예매정보VO bag) {
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

			String sql = "update hr.예매정보 set 예매일자 = ? where 예매번호 = ? AND 예매전화번호 = ?"; // id가 ?인(조건) tel을 ?로 바꾸어라.
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setDate(1, bag.get예매일자());
			ps.setInt(2, bag.get예매번호());
			ps.setString(3, bag.get예매전화번호());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			// int 일때는 ps.setInt(2, NO);

			result = ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (result == 1) {
				System.out.println("예매일자수정 성공!");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(result);
		return result;
	}

	public 예매정보VO 예매번호로예매조회(int 예매번호) {
		ResultSet rs = null;
		예매정보VO bag1 = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection

			System.out.println("2. 오라클 연결 성공.");

//			String sql = "SELECT a.예매번호, b.제목, a.예매일자, a.좌석, c.이름, c.전화번호, c.이메일, a.결제금액 "
//					+ "FROM HR.예매정보 a, HR.공연 b, HR.예매자 " + "WHERE b.공연ID = a.공연ID" + "AND a.예매전화번호 = c.전화번호"
//					+ "AND	a.예매번호 = ?";
			
			String sql = "SELECT * FROM HR.예매정보 WHERE 예매번호 = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, 예매번호);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();// select문 전송시 결과가 테이블형태라서 변경.
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (rs.next()) {
				System.out.println("검색결과있음. 성공.");
				int 예매번호2 = Integer.parseInt(rs.getString(1)); //
				String 공연ID = rs.getString(2); //
				String 전화번호 = rs.getString(3);
				Date 예매일자 = rs.getDate(4); //
				String 좌석 = rs.getString(5);
				int 결제금액 = Integer.parseInt(rs.getString(6)); //
				System.out.println(예매번호2 +" "+ 공연ID +" "+ 예매일자 +" "+ 좌석 +" "+ 전화번호 +" "+ 결제금액);
				bag1 = new 예매정보VO();
				bag1.set예매번호(예매번호2);
				bag1.set공연ID(공연ID);
				bag1.set예매전화번호(전화번호);
				bag1.set예매일자(예매일자);
				bag1.set좌석(좌석);
				bag1.set결제금액(결제금액);
			} else {
				System.out.println("검색결과없음. 성공.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag1;

	}

}
