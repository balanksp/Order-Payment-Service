package com.zaga.PaymentService.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zaga.PaymentService.DTO.EventDto;
import com.zaga.PaymentService.Entity.CostumerBankAccount;
import com.zaga.PaymentService.Entity.PaymentDetails;

public interface CustomerBankRepo extends MongoRepository<PaymentDetails,String>{

    // public void balanceFetchUsingcard(EventDto dto){

            
    // }


    
}
