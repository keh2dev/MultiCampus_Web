//package project01;
//
//import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Date;
//import java.text.SimpleDateFormat;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//
//public class 예매정보테스트UI {
//
//	public static void main(String[] args) {
//		JFrame f = new JFrame();
//		f.setTitle("나의 예매정보 화면");
//		f.setSize(550, 520);
//
//		JLabel l1 = new JLabel("<<<<예매정보테스트>>>>>");
//		JLabel l2 = new JLabel("예매번호");
//		JLabel l3 = new JLabel("공연ID");
//		JLabel l4 = new JLabel("예매전화번호");
//		JLabel l5 = new JLabel("예매일자");
//		JLabel l6 = new JLabel("예매좌석");
//
//		JTextField t1 = new JTextField(10);
//		JTextField t2 = new JTextField(10);
//		JTextField t3 = new JTextField(10);
//		JTextField t4 = new JTextField(10);
//		JTextField t5 = new JTextField(10);
//
//		JButton b1 = new JButton("예매하기");
//		JButton b2 = new JButton("예매취소");
//		JButton b3 = new JButton("예매일자수정");
//		JButton b4 = new JButton("예매조회");
//
//		FlowLayout flow = new FlowLayout();
//		Font font = new Font("gungseo", Font.BOLD, 40);
//
//		//// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 /////
//
//		// 예매하기
//		b1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("예매하기");
//				String 예매번호 = t1.getText();
//				int 예매번호2 = Integer.parseInt(예매번호);
//				String 공연ID = t2.getText();
//				String 예매전화번호 = t3.getText();
//				String 예매일자 = t4.getText();
//				Date 예매일자2 = Date.valueOf(예매일자);
//				String 좌석 = t5.getText();
//
//				if (예매번호.equals("")) { // 기본형 4가지만 ==로 값 비교 가능!
//					JOptionPane.showMessageDialog(f, "필수입력항목입니다.");
//				}
//
//				예매정보DAO dao = new 예매정보DAO();
//				// 1.가방을 만들어주세요.
//				예매정보VO bag = new 예매정보VO();
//				// 2.가방에 값들을 넣어주세요.
//				bag.set예매번호(예매번호2);
//				bag.set공연ID(공연ID);
//				bag.set예매전화번호(예매전화번호);
//				bag.set예매일자(예매일자2);
//				bag.set좌석(좌석);
//
//				System.out.println("예매일자 : " + 예매일자2);
//
//				// 3.값들이 들어있는 가방을 전달하자.
//				int result = dao.예매하기(bag);// 1 or 0
//				if (result == 1) {
//					JOptionPane.showMessageDialog(f, "예매 성공");
//				} else {
//					JOptionPane.showMessageDialog(f, "예매 실패, 재입력해주세요.");
//				}
//			}// action
//		});// b1
//
//		// 예매취소
//		b2.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("게시물삭제처리");
//				String 예매번호 = t1.getText();
//				int 예매번호2 = Integer.parseInt(예매번호);
//				String 예매전화번호 = t3.getText();
//
//				if (예매번호.equals("")) { // 기본형 4가지만 ==로 값 비교 가능!
//					JOptionPane.showMessageDialog(f, "NO는 필수입력항목입니다.");
//				}
//
//				예매정보DAO dao = new 예매정보DAO();
//				예매정보VO bag = new 예매정보VO();
//
//				bag.set예매번호(예매번호2);
//				bag.set예매전화번호(예매전화번호);
//
//				int result = dao.예매취소(bag);
//				if (result == 1) {
//					JOptionPane.showMessageDialog(f, "예매취소 성공");
//				} else {
//					JOptionPane.showMessageDialog(f, "예매취소 실패, 재입력해주세요.");
//				}
//			}// action
//		});// b1
//
//		// 예매일자수정
//		b3.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("예매일자수정");
//				String 예매번호 = t1.getText();
//				int 예매번호2 = Integer.parseInt(예매번호);
//				String 예매전화번호 = t3.getText();
//				String 예매일자 = t4.getText();
//				Date 예매일자2 = Date.valueOf(예매일자);
//
//				if (예매번호.equals("")) { // 기본형 4가지만 ==로 값 비교 가능!
//					JOptionPane.showMessageDialog(f, "예매번호는 필수입력항목입니다.");
//				}
//
//				예매정보DAO dao = new 예매정보DAO();
//				예매정보VO bag = new 예매정보VO();
//				bag.set예매번호(예매번호2);
//				bag.set예매전화번호(예매전화번호);
//				bag.set예매일자(예매일자2);
//				// 3.값들이 들어있는 가방을 전달하자.
//				int result = dao.예매일자수정(bag);
//				if (result == 1) {
//					JOptionPane.showMessageDialog(f, "예매일자수정 성공");
//				} else {
//					JOptionPane.showMessageDialog(f, "예매일자수정 실패, 재입력해주세요.");
//				}
//			}// action
//		});// b3
//
//		// 예매조회기능
//		b4.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("예매조회");
//				String 예매번호 = t1.getText();
//				int 예매번호2 = Integer.parseInt(예매번호);
//				String 예매전화번호 = t3.getText();
//				
//				System.out.println("예매번호 : " + 예매번호2);
//				System.out.println("예매전화번호 : " + 예매전화번호);
//				//String 예매일자 = t4.getText();
//				//Date 예매일자2 = Date.valueOf(예매일자);
//				예매정보DAO dao = new 예매정보DAO();
//				예매정보VO bag2 = new 예매정보VO();
//				bag2.set예매번호(예매번호2);
//				bag2.set예매전화번호(예매전화번호);
//				예매정보VO bag = dao.예매조회(bag2);
//				
//				
//				if (bag != null) {
//					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//					String 날짜문자변환 = format.format(bag.get예매일자());
//					t2.setText(bag.get공연ID());
//					t3.setText(bag.get예매전화번호());
//					t4.setText(날짜문자변환);
//					t5.setText(bag.get좌석());
//					t2.setBackground(Color.gray);
//					t3.setBackground(Color.gray);
//					t4.setBackground(Color.gray);
//					t5.setBackground(Color.gray);
//				} else {
//					JOptionPane.showMessageDialog(f, "검색결과 없음");
//					t2.setText("");
//					t3.setText("");
//					t4.setText("");
//					t5.setText("");
//				}
//
//			}// action
//		}); // b4
//
//		f.setLayout(flow);
//
//		f.add(l1);
//		f.add(l2);
//		f.add(t1);
//		f.add(l3);
//		f.add(t2);
//		f.add(l4);
//		f.add(t3);
//		f.add(l5);
//		f.add(t4);
//		f.add(l6);
//		f.add(t5);
//		f.add(b1);
//		f.add(b2);
//		f.add(b3);
//		f.add(b4);
//
//		l1.setFont(font);
//		l2.setFont(font);
//		t1.setFont(font);
//		l3.setFont(font);
//		t2.setFont(font);
//		l4.setFont(font);
//		t3.setFont(font);
//		l5.setFont(font);
//		t4.setFont(font);
//		l6.setFont(font);
//		t5.setFont(font);
//		b1.setFont(font);
//		b2.setFont(font);
//		b3.setFont(font);
//		b4.setFont(font);
//
//		t1.setBackground(Color.yellow);
//		t2.setBackground(Color.yellow);
//		t3.setBackground(Color.yellow);
//		t4.setBackground(Color.yellow);
//		t5.setBackground(Color.yellow);
//		b1.setForeground(Color.blue);
//		b2.setForeground(Color.blue);
//		b3.setForeground(Color.blue);
//		b4.setForeground(Color.blue);
//
//		f.getContentPane().setBackground(Color.pink);
//
//		f.setVisible(true);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//	}
//}
