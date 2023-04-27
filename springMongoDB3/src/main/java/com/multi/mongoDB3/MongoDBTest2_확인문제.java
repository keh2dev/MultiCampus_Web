package com.multi.mongoDB3;



import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest2_확인문제 {

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

//		shop2.memo에 연결하여 insertOne/insertMany
//		insertOne	→age:500 name:song, office:busan, phone:011

		Document doc = new Document();
		doc.append("age", "500");
		doc.append("name", "song");
		doc.append("office", "busan");
		doc.append("phone", "011");
		
		collection.insertOne(doc);
		System.out.println("4. memo 컬렉션에 insertOne 성공.");
		
//		insertMany	→age:501, name:song2, office:busan, phone:011
//					→age:502, name:song3, office:seoul, phone:011
//					→age:503, name:song4, office:busan, phone:011
		
		Document doc1 = new Document();
		doc1.append("age", "501");
		doc1.append("name", "song2");
		doc1.append("office", "busan");
		doc1.append("phone", "011");
		
		Document doc2 = new Document();
		doc2.append("age", "502");
		doc2.append("name", "song3");
		doc2.append("office", "seoul");
		doc2.append("phone", "011");
		
		Document doc3 = new Document();
		doc3.append("age", "503");
		doc3.append("name", "song4");
		doc3.append("office", "busan");
		doc3.append("phone", "011");
		
		List<Document> list = new ArrayList<Document>();
		list.add(doc1);
		list.add(doc2);
		list.add(doc3);
		
		collection.insertMany(list);
		System.out.println("4. memeber 컬렉션에 insertMany 성공.");
		
//		shop2.memo에 연결하여 deleteOne
//		age가 500인 document를 삭제
		
		Document filter = new Document();
		filter.append("age", "500");
		
		collection.deleteOne(filter);
//		
//		System.out.println("4. memeber 컬렉션에 deleteOne 성공.");
		
//		shop2.memo에 연결하여 updateOne/updateMany
//		updateOne	→age가 501인 document의 name:songsong으로 변경
		
		//update할 조건은 json(document)로 만들어주세요~
		Document filter2 = new Document();
		filter2.append("age", "501");
				
		//update할 내용은 Bson(json)를 만들어주세요.
		Bson set = Updates.set("name", "songsong");
				
		collection.updateOne(filter2, set);
		System.out.println("4. memeber 컬렉션에 updateOne 성공.");
		
//		updateMany	→office가  busan인 document의 phone:9999, name: songsong2, age:555로 변경

		//update할 조건은 json(document)로 만들어주세요~
		Document filter3 = new Document();
		filter3.append("office", "busan");
		
		//update할 내용은 Bson(json)를 만들어주세요.
		Bson set1 = Updates.set("phone", "9999");
		Bson set2 = Updates.set("name", "songsong2");
		Bson set3 = Updates.set("age", "555");
		
		List<Bson> list2 = new ArrayList<Bson>();
		list2.add(set1);
		list2.add(set2);
		list2.add(set3);
		
		Bson sets = Updates.combine(list2);
		
		collection.updateMany(filter3, sets);
		System.out.println("4. memeber 컬렉션에 updateMany 성공.");		
		
		
		
	}

}