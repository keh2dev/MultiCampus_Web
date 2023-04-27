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

public class MongoDBTest2_find2 {

	public static void main(String[] args) {
		// 1. 몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고db 프로그램에 연결 성공.");
		// 2. shop2 db로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공.");

		// 3. memeber 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. memo 컬렉션에 연결 성공.");

		FindIterable<Document> list = collection.find();//전체검색
		ArrayList<MemoVO> result = new ArrayList<MemoVO>();
		for (Document document : list) {
			//System.out.println(document);
			MemoVO bag = new MemoVO();
			bag.setName(document.getString("name"));
			bag.setAge(document.getInteger("age"));
			bag.setOffice(document.getString("office"));
			bag.setPhone(document.getString("phone"));
			result.add(bag);
		}
		System.out.println(result);
		System.out.println("4. memeber 컬렉션에 find 성공.");
	}

}