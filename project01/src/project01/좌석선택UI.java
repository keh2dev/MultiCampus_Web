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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class 좌석선택UI {
	private int count = 0;
	private int total = 0;
	
	public void 좌석선택하기(String 공연ID, Date 예매일자2) {
		System.out.println("예매공연ID : "+공연ID + ", 예매일자 : " + 예매일자2);
		JFrame f = new JFrame();
		f.setTitle("좌석선택");
		f.setSize(615, 810);
		f.getContentPane().setBackground(Color.lightGray);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton[][] btn = new JButton[10][7];
		JLabel l1 = new JLabel("<<<<<<좌석선택>>>>>>");
		JButton b1 = new JButton("        Stage        ");
		JLabel l2 = new JLabel("1인 가격 : ");
		
		공연DAO dao = new 공연DAO();
		공연VO bag = dao.가격조회(공연ID);
		System.out.println(bag.get가격());
		int price = bag.get가격();
		
		JLabel l3 = new JLabel(bag.get가격() + "원");
		JLabel l4 = new JLabel("선택좌석 수 : ");
		JLabel l5 = new JLabel("0석");
		JLabel l6 = new JLabel("총 가격 : ");
		JLabel l7 = new JLabel("0원");
		JTextArea t1 = new JTextArea(5, 20);
		JScrollPane scroll = new JScrollPane(t1);
		
		t1.setSize(500, 500);
		t1.setEnabled(false);

		JButton b2 = new JButton("결제하기");

		Font font = new Font("gungseo", Font.BOLD, 50);
		Font font2 = new Font("gungseo", Font.BOLD, 25);
		l1.setFont(font);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		l7.setFont(font2);
		b1.setFont(font);
		b2.setFont(font);
		t1.setFont(font2);

		f.add(l1);
		f.add(b1);
		
		int[][] seat = new int[btn.length][btn[0].length];
		
		
		for (int i = 0; i < btn.length; i++) {
			for (int j = 0; j < btn[i].length; j++) {
				seat[i][j] = 0;
				char row = (char) (i + 65);
				int column = j + 1;
				btn[i][j] = new JButton(row + "" + column);
				btn[i][j].setForeground(Color.blue);
				
				final int i2 = i;
				final int j2 = j;
				
				btn[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 이미 해당 좌석 번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약 가능!
						if (seat[i2][j2] == 0) { // 선택하기
							t1.append(row + "" + column + "\n");
							btn[i2][j2].setForeground(Color.red);
							seat[i2][j2] = 1;
							count++;
							l5.setText(count+"석");
							total = price * count;
							l7.setText(total+"원");
						} else { // 선택취소
							String list = t1.getText();
				            list = list.replace(row + "" + column + "\n", "");
				            t1.setText(list);
							btn[i2][j2].setForeground(Color.blue);
							seat[i2][j2] = 0;
							count--;
							l5.setText(count+"석");
							total = price * count;
							l7.setText(total+"원");
						}
						
					}
				});// 버튼 액션 기능
				f.add(btn[i][j]);
			}
		}

		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(scroll);
		f.add(l6);
		f.add(l7);
		f.add(b2);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String seat = t1.getText().replaceAll("\n", "/");
				String seatResult = seat.substring(0, seat.length()-1);
				System.out.println(공연ID +" "+ 예매일자2 +" "+ seatResult +" "+ total);
				결제UI 결제 = new 결제UI();
				결제.결제하기(공연ID, 예매일자2, seatResult, total);
			}
		});

//		맨 끝에 있어야함!
		f.setVisible(true);
	}

}
