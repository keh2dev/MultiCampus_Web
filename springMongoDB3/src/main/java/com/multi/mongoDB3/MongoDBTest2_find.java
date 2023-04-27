package com.multi.mongoDB3;



import java.util.ArrayList;
import java.util.List;

import org.bson.BSON;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest2_find {

	public static void main(String[] args) {
		// 1. 몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고db 프로그램에 연결 성공.");
		// 2. shop2 db로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공.");

		// 3. memeber 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3. memeber 컬렉션에 연결 성공.");

		FindIterable<Document> list = collection.find();//전체검색
		ArrayList<MemberVO> result = new ArrayList<MemberVO>();
		for (Document document : list) {
			//System.out.println(document);
			MemberVO bag = new MemberVO();
			bag.setId(document.getString("id"));
			bag.setPw(document.getString("pw"));
			bag.setName(document.getString("name"));
			bag.setTel(document.getString("tel"));
			result.add(bag);
		}
		System.out.println(result);
		System.out.println("4. memeber 컬렉션에 find 성공.");
	}

}