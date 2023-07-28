package com.zaga.PaymentService.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MerchantBankAccount {
    private String account_holder_name;
    private String customer_account_number;
    private String bank_name;
    private String bank_branch;
    private String ifsc_code;
    private Double bank_balance;

}
