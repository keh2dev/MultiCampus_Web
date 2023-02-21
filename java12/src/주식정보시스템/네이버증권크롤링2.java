package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get(); //html코드를 다 가지고온다!
			
			//sptxt sp_txt9 ==> [ tag, tag, tag, ....]
			//select("a") : tag <a>
			//select(".code") : <a class="code">
			//select("#userId") : <a id="userId">
			
			Elements codeList = doc.select(".code"); //클래스 코드
			System.out.println(codeList.size());
			
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("종목코드는 " + code);
			
			//<span class="blind">
			Elements list = doc.select("span.blind");
			System.out.println(list.size());
			System.out.println(list);
			System.out.println();
			System.out.println(list.get(12));
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가 " + today);
			
			System.out.println(list.get(16));
			Element tag3 = list.get(16);
			String high = tag3.text();
			System.out.println("최고가 " + high);
			
			System.out.println(list.get(20));
			Element tag4 = list.get(20);
			String low = tag4.text();
			System.out.println("최저가 " + low);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}