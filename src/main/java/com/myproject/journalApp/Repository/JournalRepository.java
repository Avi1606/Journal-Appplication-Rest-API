package com.myproject.journalApp.Repository;

import com.myproject.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<JournalEntry , ObjectId> {
}
