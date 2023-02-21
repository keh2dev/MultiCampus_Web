package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

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
			
			//html에서 sptxt sp_txt9 ==> [ tag, tag, tag, ....]
			//자바에선 sptxt.sp_txt9으로 표기
			//sptxt sp_txt9로 표기 시 sp_txt9를 클래스가 아니라 태그로 인식함!!
			Elements textList = doc.select(".sptxt.sp_txt9");
			System.out.println(textList.size());
			
			Element tag2 = textList.get(0);
			String text1 = tag2.text();
			System.out.println("text1 " + text1);
			
			Elements text2List = doc.select(".sptxt.sp_txt10");
			System.out.println(text2List.size());
			
			Element tag3 = text2List.get(0);
			String text2 = tag3.text();
			System.out.println("text2 " + text2);
			
		} catch (IOException e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}