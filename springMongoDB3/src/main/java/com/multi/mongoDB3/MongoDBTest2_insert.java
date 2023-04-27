package com.multi.mongoDB3;



import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_insert {

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

		// java코드에서 자동import
		// ctrl + shift + o
		// 자바프로그램 <--연결설정(강물, 스트림)----- 콘솔
		
		Document doc = new Document();
		doc.append("id", "apple1");
		doc.append("pw", "1234");
		doc.append("name", "apple1");
		doc.append("tel", "apple1");
		
		collection.insertOne(doc);
		System.out.println("4. memeber 컬렉션에 insertOne 성공.");
	}

}