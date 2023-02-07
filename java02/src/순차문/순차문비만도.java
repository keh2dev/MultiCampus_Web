package 순차문;

// 부품이 있는 위치를 알려주는 역
import javax.swing.JOptionPane;

public class 순차문비만도 {

	public static void main(String[] args) {
		// BMI : 체질량 지수 = 체중/(키*키)
		String height1 = JOptionPane.showInputDialog("키를 입력하시오");
		String weight1 = JOptionPane.showInputDialog("체중을 입력하시오");
		// 처리 -> 글자연결

		double height2 = Double.parseDouble(height1); // "200" --> 200
		double weight2 = Double.parseDouble(weight1); // "200" --> 200
		double result1 = weight2 / (height2 * height2) * 10000;
		// 출력 -> 모니터 화면에 보이고 싶음.
		
		//System.out.println("BMI : " + result1);
		JOptionPane.showMessageDialog(null, result1);
	}

}
