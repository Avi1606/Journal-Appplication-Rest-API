package com.myproject.journalApp.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
//@Getter
//@Setter

@Data
@Document(collection = "journalEntry")
public class JournalEntry {

    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime Date;

}
