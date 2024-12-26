
package com.cafe.transaction;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private List<String> productIds;
    private double totalAmount;
    private String date;

    // Getters and setters
}
