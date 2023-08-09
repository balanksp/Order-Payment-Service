package com.zaga.PaymentService.Entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.context.annotation.ApplicationScope;

import com.zaga.PaymentService.serializerDeserializer.ObjectSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApplicationScope
@Document(collection = "PaymentDetails")
public class PaymentDetails extends ObjectSerializer  {
    // private String orderId;
    private String upi_id;
    private String cvv;
    private String expiry_date;
    private String card_number;
    private Double amount;
    private String payment_type; 
    private String merchant_account_number ;
    private Long customer_id;
    private String  name;
}