package com.zaga.PaymentService.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "CreditCard")
public class CreditCard {

    @Id
    private String id;
    private String card_number;
    private String name;
    private String expiry_date; 
    private String cvv;
    private String customer_account_number;
     
}
