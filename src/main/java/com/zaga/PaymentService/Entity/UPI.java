package com.zaga.PaymentService.Entity;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="UPI")
public class UPI {
    // private ObjectId id;
    private String upi_id;    
    private String customer_account_number;
    private String name;

}
