package com.zaga.PaymentService.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.zaga.PaymentService.DTO.EventDto;
import com.zaga.PaymentService.Entity.CustomerBankAccount;

public interface CustomerBankRepo extends MongoRepository<CustomerBankAccount,String>{

@Query("'customer_bank_account': ?0,'account_holder_name': ?1")
public CustomerBankAccount getBankBalance(EventDto dto);

@Query("'customer_bank_account': ?0,'account_holder_name': ?1")
public CustomerBankAccount getBankBalance(String account_number, String name);



}
