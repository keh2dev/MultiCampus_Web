package 배열심화;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 100);
		String header[] = { "컴퓨터", "영어", "수학", "체육" };
		Random r = new Random();
		String contents[][] = new String[20][header.length];

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < header.length; j++) {
				contents[i][j] = Integer.toString(r.nextInt(21) + 80);
			}
		}

		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
	}

}
