package project01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class 결제UI {
	public void 결제하기(String 공연ID, Date 예매일자2, String 좌석, int 결제금액) {

		System.out.println(공연ID + " " + 예매일자2 + " " + 좌석 + " " + 결제금액);

		JFrame f = new JFrame();
		f.setTitle("결제하기");
		f.setSize(615, 810);
		f.getContentPane().setBackground(Color.lightGray);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel l1 = new JLabel("<<<<<<결제화면>>>>>>");
		JLabel l2 = new JLabel("       개인정보 입력       ");
		JLabel l3 = new JLabel("       이름");
		JLabel l4 = new JLabel("       이메일");
		JLabel l5 = new JLabel("       전화번호");
		JLabel l6 = new JLabel("총 결제금액 " + 결제금액 + "원");
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);

		JButton b1 = new JButton("결제확인");

		Font font = new Font("gungseo", Font.BOLD, 50);
		Font font2 = new Font("gungseo", Font.BOLD, 25);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		b1.setFont(font);

		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(l4);
		f.add(t2);
		f.add(l5);
		f.add(t3);
		f.add(l6);
		f.add(b1);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();
				String email = t2.getText();
				String phone = t3.getText();

				if (name.equals("") || email.equals("") || phone.equals("")) {
					JOptionPane.showMessageDialog(f, "개인정보를 다시 입력해주세요.");
				}

				예매자DAO dao1 = new 예매자DAO();
				예매자VO bag1 = new 예매자VO();
				bag1.set이름(name);
				bag1.set전화번호(phone);
				bag1.set이메일(email);
				System.out.println(bag1.toString());

				int result1 = dao1.예매자추가(bag1);// 1 or 0
				
				if (result1 == 1) {
					
					예매정보DAO dao2 = new 예매정보DAO();
					예매정보VO bag2 = new 예매정보VO();
					
					
					
					bag2.set공연ID(공연ID);
					bag2.set예매전화번호(phone);
					bag2.set예매일자(예매일자2);
					bag2.set좌석(좌석);
					bag2.set결제금액(결제금액);
					
					System.out.println(bag2.toString());

					
					int 예매번호반환 = dao2.예매후예매번호반환(bag2);// 1 or 0
					if (예매번호반환 != 0) {
						JOptionPane.showMessageDialog(f, "예매성공.");
						
						결제완료UI 결제완료 = new 결제완료UI();
						결제완료.결제완료(예매번호반환);
					} else {
						JOptionPane.showMessageDialog(f, "오류발생. 재시작해주세요.");
					}
					
				} else {
					JOptionPane.showMessageDialog(f, "기존 전화번호 이력이 존재합니다. 전화번호를 제외한 정보를 올바르게 재기입해주세요.");
				}

			}
		});

//		맨 끝에 있어야함!
		f.setVisible(true);
	}
}
