package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(400, 1000);
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton[] btn = new JButton[100];

		Font font = new Font("gungseo", Font.BOLD, 50);

		JLabel result = new JLabel("결과창");
		result.setForeground(Color.red);
		result.setFont(font);

		int[] seat = new int[btn.length];

		JButton total = new JButton("계산");

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
//			btn[i].setFont(font); 
			f.add(btn[i]);
//			버튼 액션 기능!
			btn[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand(); // 클릭한 버튼의 글자를 가지고 옴.
					System.out.println(text);
					int no = Integer.parseInt(text);
					btn[no].setForeground(Color.red);
//					이미 해당 좌석 번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약 가능!
					if (seat[no] == 1) { // 이미 예약되어 1이 들어있음. 예약불가
						result.setText("예약불가");
						result.setForeground(Color.blue);
					} else { // 아직 예약이 안되어서 0이 들어있음. 예약가능
						seat[no] = 1; // 예약좌석은 1로 변경!
						result.setText(text + "번 예약완료.");
						btn[no].setOpaque(true);
						btn[no].setBorderPainted(false);
						btn[no].setBackground(Color.red);
						btn[no].setEnabled(false);
					}

				}
			});
		}

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열안에 저장된 수 몇개가 1인지 체크해서 카운트
				// 영화예매비 1장당 1만원, 결제금액 출력
				int totalCount = 0;
				for (int i : seat) {

					if (i == 1) {
						totalCount++;
					}
				}
				JOptionPane.showMessageDialog(f, ((totalCount * 10000) + "원 결제!"));
			}
		});

		f.add(result);

		f.add(total);

//		맨 끝에 있어야함!
		f.setVisible(true);

	}

}
