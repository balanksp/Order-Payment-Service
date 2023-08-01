package com.zaga.PaymentService.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zaga.PaymentService.Entity.CustomerBankAccount;

public interface CustomerBankRepo extends MongoRepository<CustomerBankAccount,String>{

    // CustomerBankAccount findByCustomerAccountNumberAndAccountHolderName(String customerAccountNumber, String accountHolderName);

    
}
