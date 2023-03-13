package project01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class 공연정보UI {

	static int index = 0;
	
	static 예매정보VO 예매정보;
	
	public static void main(String[] args) {
		
		공연DAO dao = new 공연DAO();
		ArrayList<공연VO> list = dao.list();
		
		String[] header = {"공연ID", "제목", "위치", "공연시작일", "공연종료일", "가격", "이미지파일"};
		String[][] all = new String[list.size()][7];
		
//		for (공연VO bag : list) {
//			System.out.println(bag.get공연ID());
//			System.out.println(bag.get제목());
//			System.out.println(bag.get위치());
//			System.out.println(bag.get공연시작일());
//			System.out.println(bag.get공연종료일());
//			System.out.println(bag.get가격());
//			System.out.println(bag.get이미지파일());
//			System.out.println("---------------");
//		}
		
		if(list.size() == 0) {
			System.out.println("검색결과 없음.");
		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");
			for (int i = 0; i < all.length; i++) { // 
				all[i][0] = list.get(i).get공연ID();
				all[i][1] = list.get(i).get제목();
				all[i][2] = list.get(i).get위치();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				all[i][3] = format.format(list.get(i).get공연시작일());
				all[i][4] = format.format(list.get(i).get공연종료일());
				all[i][5] = Integer.toString(list.get(i).get가격());
				all[i][6] = list.get(i).get이미지파일();
			}
		}
		
		JFrame f = new JFrame();
		f.setTitle("공연정보");
		f.setSize(615, 810);
		f.getContentPane().setBackground(Color.lightGray);

		Font font = new Font("gungseo", Font.BOLD, 40);
		Font font2 = new Font("gungseo", Font.BOLD, 25);

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 세팅되어있다.
		// BorderLayout
		JLabel top = new JLabel("<html><body><center>예매하기<br>"+all[index][1]+"</center></body></html>");//0번 공연 제목
		top.setFont(font);
		top.setHorizontalAlignment(0);
		f.add(top, BorderLayout.NORTH);

		JButton center = new JButton();
		ImageIcon icon = new ImageIcon(all[0][6]); // 0번 공연 이미지
		center.setIcon(icon);
		center.setFont(font);
		center.setHorizontalAlignment(0);
		f.add(center, BorderLayout.CENTER);

		JLabel under = new JLabel("<html><body><center>공연시작일 : " +all[0][3] + " 공연종료일 : " + all[0][4] + "<br>가격 : " + all[0][5]+"<br>위치 : " + all[0][2]+"</center></body></html>");
		
		under.setForeground(Color.blue);
		under.setFont(font2);
		under.setHorizontalAlignment(0);
		f.add(under, BorderLayout.SOUTH);
		
		
		
		JButton left = new JButton("<<");
		left.setFont(font);
		f.add(left, BorderLayout.WEST);
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					index--;
				} else {
					index = (list.size() - 1 );
				}
				top.setText("<html><body><center>예매하기<br>"+all[index][1]+"</center></body></html>");//0번 공연 제목
				under.setText("<html><body><center>공연시작일 : "  +all[index][3] + " 공연종료일 : " + all[index][4] + "<br>가격 : " + all[index][5]+"<br>위치 : " + all[index][2]+"</center></body></html>");
				ImageIcon icon = new ImageIcon(all[index][6]);
				center.setIcon(icon);
			}
		});

		JButton right = new JButton(">>");
		right.setFont(font);
		f.add(right, BorderLayout.EAST);
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index < (list.size() - 1 )) {
					index++;
				} else {
					index =0;
				}
				top.setText("<html><body><center>예매하기<br>"+all[index][1]+"</center></body></html>");//0번 공연 제목
				under.setText("<html><body><center>공연시작일 : "  +all[index][3] + " 공연종료일 : " + all[index][4] + "<br>가격 : " + all[index][5]+"<br>위치 : " + all[index][2]+"</center></body></html>");
				ImageIcon icon = new ImageIcon(all[index][6]);
				center.setIcon(icon);
			}
		});
		// 프로그램 끝나면 자동으로 exit!!!
		
		center.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("공연선택");
				String 공연ID = all[index][0];
				String 공연시작일 = all[index][3];
				String 공연종료일 = all[index][4];
				날짜선택UI 날짜선택 = new 날짜선택UI();
				날짜선택.예매일자선택하기(공연ID, 공연시작일, 공연종료일);
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
