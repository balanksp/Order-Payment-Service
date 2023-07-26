package com.zaga.PaymentService.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.context.annotation.ApplicationScope;

import com.zaga.PaymentService.Entity.PaymentDetails;


@ApplicationScope
public interface PaymentDetailsRepo extends MongoRepository<PaymentDetails,String> {
    
}
