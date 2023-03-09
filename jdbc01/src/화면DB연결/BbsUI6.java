package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

import 자바DB연결.BBSDAO;
import 자바DB연결.BbsVO;
import 자바DB연결.MemberDAO3;

public class BbsUI6 {

	public static void open() {
		JFrame f = new JFrame();
		f.setTitle("나의 게시판 화면");
		f.setSize(430, 520);
		
		JLabel l1 = new JLabel("<<<<<게시판화면>>>>>");
		JLabel l2 = new JLabel("NO");
		JLabel l3 = new JLabel("제목");
		JLabel l4 = new JLabel("내용");
		JLabel l5 = new JLabel("작성자");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물작성");
		JButton b2 = new JButton("게시물삭제");
		JButton b3 = new JButton("게시물수정");
		JButton b4 = new JButton("게시물검색");
		
		FlowLayout flow = new FlowLayout();
		Font font = new Font("gungseo", Font.BOLD, 40);
		
		////필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 /////
		
		//게시물작성
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물작성처리");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();
				
				if (no.equals("")) { // 기본형 4가지만 ==로 값 비교 가능!
					JOptionPane.showMessageDialog(f, "NO는 필수입력항목입니다.");
				}
				
				BBSDAO dao = new BBSDAO();
				//1.가방을 만들어주세요.
				BbsVO bag = new BbsVO();
				//2.가방에 값들을 넣어주세요.
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);;
				bag.setWriter(writer);;
				//3.값들이 들어있는 가방을 전달하자.
				int result = dao.insert(bag);// 1 or 0
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "게시물작성 성공");
				} else {
					JOptionPane.showMessageDialog(f, "게시물작성 실패, 재입력해주세요.");
				}
			}// action
		});// b1
		
		//게시물삭제
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물삭제처리");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);
				
				if (no.equals("")) { // 기본형 4가지만 ==로 값 비교 가능!
					JOptionPane.showMessageDialog(f, "NO는 필수입력항목입니다.");
				}
				
				BBSDAO dao = new BBSDAO();
				int result = dao.delete(no2);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "게시물삭제 성공");
				} else {
					JOptionPane.showMessageDialog(f, "게시물삭제 실패, 재입력해주세요.");
				}
			}// action
		});// b1
		
		//게시물수정
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물수정처리");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);
				String content = t3.getText();
				
				if (no.equals("")) { // 기본형 4가지만 ==로 값 비교 가능!
					JOptionPane.showMessageDialog(f, "NO는 필수입력항목입니다.");
				}
				
				BBSDAO dao = new BBSDAO();
				//1.가방을 만들어주세요.
				BbsVO bag = new BbsVO();
				//2.가방에 값들을 넣어주세요.
				bag.setNo(no2);
				bag.setContent(content);
				//3.값들이 들어있는 가방을 전달하자.
				int result = dao.update(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "게시물수정 성공");
				} else {
					JOptionPane.showMessageDialog(f, "게시물수정 실패, 재입력해주세요.");
				}
			}// action
		});// b3
		
		// 검색기능
		b4.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물검색처리");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);
				BBSDAO dao = new BBSDAO();
				BbsVO bag = dao.one(no2);//MemberVO
				if(bag != null) {
				t2.setText(bag.getTitle());
				t3.setText(bag.getContent());
				t4.setText(bag.getWriter());
				t2.setBackground(Color.gray);
				t3.setBackground(Color.gray);
				t4.setBackground(Color.gray);
				} else {
					JOptionPane.showMessageDialog(f, "검색결과 없음");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				}
				
			}// action
		}); // b4
		
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2);	f.add(t1);
		f.add(l3);	f.add(t2);
		f.add(l4);	f.add(t3);
		f.add(l5);	f.add(t4);
		f.add(b1);	f.add(b2);
		f.add(b3);	f.add(b4);
		
		l1.setFont(font);
		l2.setFont(font);	t1.setFont(font);
		l3.setFont(font);	t2.setFont(font);
		l4.setFont(font);	t3.setFont(font);
		l5.setFont(font);	t4.setFont(font);
		b1.setFont(font);	b2.setFont(font);
		b3.setFont(font);	b4.setFont(font);
		
		t1.setBackground(Color.yellow);
		t2.setBackground(Color.yellow);
		t3.setBackground(Color.yellow);
		t4.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		b2.setForeground(Color.blue);
		b3.setForeground(Color.blue);
		b4.setForeground(Color.blue);
		
		f.getContentPane().setBackground(Color.pink);
		
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
