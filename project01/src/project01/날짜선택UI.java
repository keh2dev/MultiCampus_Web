package project01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;



public class 날짜선택UI {
	
		public void 예매일자선택하기(String 공연ID, String 공연시작일, String 공연종료일) {
			System.out.println("예매공연ID : "+공연ID);
			
			JFrame f = new JFrame();
			f.setTitle("예매일선택");
			f.setSize(615, 810);
			f.getContentPane().setBackground(Color.lightGray);
			
			UtilDateModel model = new UtilDateModel();
			JDatePanelImpl datePanel = new JDatePanelImpl(model);
			JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

			
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			
			JLabel l1 = new JLabel("<<<<<예매일 선택>>>>>");
		    JLabel l2 = new JLabel("공연기간: " + 공연시작일 + " ~ " + 공연종료일);
			JLabel l3 = new JLabel("예매일자를 선택해주세요.");
			JButton b1 = new JButton("좌석선택");
			
			Font font = new Font("gungseo", Font.BOLD, 40);
			Font font2 = new Font("gungseo", Font.BOLD, 25);
			l1.setFont(font);
			l2.setFont(font2);
			l3.setFont(font2);
			b1.setFont(font2);
			f.add(l1);
			f.add(l2);
			f.add(l3);
			f.add(datePicker);
			f.add(b1);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    Calendar 시작일자 = Calendar.getInstance();
		    Calendar 종료일자 = Calendar.getInstance();
		    try {
		        시작일자.setTime(sdf.parse(공연시작일));
		        종료일자.setTime(sdf.parse(공연종료일));
		    } catch (ParseException e1) {
		        e1.printStackTrace();
		    }
		    
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String 예매일자 = model.getYear() + "-" + (model.getMonth() + 1) + "-" + model.getDay();
					Date 예매일자2 = Date.valueOf(예매일자);
					
					if (예매일자2.after(종료일자.getTime()) || 예매일자2.before(시작일자.getTime())) {
		                JOptionPane.showMessageDialog(f, "공연기간에 맞는 날짜를 선택해주세요.");
		            } else {
		                좌석선택UI 좌석선택 = new 좌석선택UI();
		                좌석선택.좌석선택하기(공연ID, 예매일자2);
		            }

					
					
				}
			});
			
			
			
			f.setVisible(true);
			
		}
		

}
