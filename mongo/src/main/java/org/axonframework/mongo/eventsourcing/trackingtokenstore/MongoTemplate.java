package org.axonframework.mongo.eventsourcing.trackingtokenstore;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public interface MongoTemplate {

    MongoCollection<Document> trackingTokensCollection();
}
