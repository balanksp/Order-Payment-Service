package com.zaga.PaymentService.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.zaga.PaymentService.Entity.MerchantBankAccount;

public interface MerchantBankRepo extends MongoRepository<MerchantBankAccount,String>{

    @Query("'merchant_account_number': ?0,'account_holder_name': ?1")
    public MerchantBankAccount getMerchantBankBalance(String merchant_account_number , String account_holder_name);
    
}
