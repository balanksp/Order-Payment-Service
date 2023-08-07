package com.zaga.PaymentService.Entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "CustomerBankAccount")
public class CustomerBankAccount {
    private String account_holder_name;
    private String customer_account_number;
    private String bank_name;
    private String bank_branch;
    private String ifsc_code;
     @Field("bank_balance")
    private Double bank_balance;

}
