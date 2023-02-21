package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {

	public void naver(String code) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code);

		Document doc = null;
		try {
			doc = con.get();
			Elements nameList = doc.select(".wrap_company a");

			Element tagName = nameList.get(0);
			String nameString = tagName.text();
			System.out.println("종목명은 " + nameString);

			Elements codeList = doc.select(".code"); 

			Element tag = codeList.get(0);
			String codeString = tag.text();
			System.out.println("종목코드는 " + codeString);

			Elements list = doc.select("span.blind");
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가 " + today);

			Element tag3 = list.get(16);
			String high = tag3.text();
			System.out.println("최고가 " + high);

			Element tag4 = list.get(20);
			String low = tag4.text();
			System.out.println("최저가 " + low);
			System.out.println("==========================");

			//심화)) 파일에 저장(파일명: 005930.txt)
			FileWriter file = new FileWriter(codeString +".txt");
			file.write("==========================");
			file.write("종목명은 " + nameString + "\n");
			file.write("종목코드는 " + codeString + "\n");
			file.write("현재가 " + today + "\n");
			file.write("최고가 " + high + "\n");
			file.write("최저가 " + low + "\n");
			file.write("==========================");
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		} // html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}