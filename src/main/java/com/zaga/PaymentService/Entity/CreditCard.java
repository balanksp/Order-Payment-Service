package com.zaga.PaymentService.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "CreditCard")
public class CreditCard {
    
    private String name;
    private String card_number;
    private String expiry_date;
    private String cvv;
    private String customer_account_number;
     
}
