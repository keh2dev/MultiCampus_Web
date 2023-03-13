package project01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class 결제완료UI {
	public void 결제완료(int 예매번호) {

		예매정보DAO dao = new 예매정보DAO();
		예매정보VO bag = dao.예매번호로예매조회(예매번호);//MemberVO
		String 공연ID = bag.get공연ID();
		String 전화번호 = bag.get예매전화번호();
		Date 예매일자 = bag.get예매일자();
		String 좌석 = bag.get좌석();
		int 결제금액 = bag.get결제금액();
		
		공연DAO dao2 = new 공연DAO();
		공연VO bag2 = dao2.공연제목위치조회(공연ID);
		String 공연제목 = bag2.get제목();
		String 공연장소 = bag2.get위치();
		
		예매자DAO dao3 = new 예매자DAO();
		예매자VO bag3 = dao3.예매자조회(전화번호);
		String 이름 = bag3.get이름();
		String 이메일 = bag3.get이메일();
		
		JFrame f = new JFrame();
		f.setTitle("결제완료");
		f.setSize(615, 810);
		f.getContentPane().setBackground(Color.lightGray);
		GridLayout grid = new GridLayout(20,1);
		f.setLayout(grid);

		JLabel l1 = new JLabel("<<<<<<결제완료>>>>>>");
		JLabel l2 = new JLabel("예매번호 : " + 예매번호);
		JLabel l3 = new JLabel("예매공연제목 : " + 공연제목);
		JLabel l4 = new JLabel("공연장소 : " + 공연장소);
		JLabel l5 = new JLabel("예매일자 : " + 예매일자);
		JLabel l6 = new JLabel("예매좌석 : " + 좌석);
		JLabel l7 = new JLabel("예매자이름 : " + 이름);
		JLabel l8 = new JLabel("예매자전화번호 : " + 전화번호);
		JLabel l9 = new JLabel("예매자이메일 : " + 이메일);
		JLabel l10 = new JLabel("총 결제금액 : " + 결제금액 + "원");
		

		
//		String 공연ID = bag.get공연ID();
//		String 전화번호 = bag.get예매전화번호();
//		Date 예매일자 = bag.get예매일자();
//		String 좌석 = bag.get좌석();
//		int 결제금액 = bag.get결제금액();
//		String 공연제목 = bag2.get제목();
//		String 공연장소 = bag2.get위치();
//		String 이름 = bag3.get이름();
//		String 이메일 = bag3.get이메일();
		
		JButton b1 = new JButton("창닫기");

		Font font = new Font("gungseo", Font.BOLD, 50);
		Font font2 = new Font("gungseo", Font.BOLD, 25);
		l1.setFont(font);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		l7.setFont(font2);
		l8.setFont(font2);
		l9.setFont(font2);
		l10.setFont(font2);
		b1.setFont(font2);

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(b1);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		맨 끝에 있어야함!
		f.setVisible(true);
	}
}
