package com.zaga.PaymentService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CreditCardDTO {
    private String name;
    private String card_number;
    private String expiry_date;
    private String cvv;
}
