package com.zaga.PaymentService.DTO;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CreditCardDTO implements Serializable{
    private String name;
    private String card_number;
    private String expiry_date;
    private String cvv;
}
