package pl.sdacademy.db.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Test;

import java.util.Arrays;

public class UserTestAddProduct {

  @Test
  void collection() {
    MongoClient mongoClient = MongoClients.create();
    MongoDatabase database = mongoClient.getDatabase("order");

    MongoCollection<Document> collection = database.getCollection("order");
    Document product = new Document("name", "vodka").append("count", "1").append("price", 20);
    Document ordersDoc = new Document("user", "jeremy").append("products", Arrays.asList(product));

    Document product0 = new Document("name", "gin").append("count", "1").append("price", 15);
    Document ordersDoc0 = new Document("user", "joe").append("products", Arrays.asList(product0));

    collection.insertOne(ordersDoc);
    collection.insertOne(ordersDoc0);

    mongoClient.close();


  }
}
