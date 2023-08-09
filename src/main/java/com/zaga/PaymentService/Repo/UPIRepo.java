package com.zaga.PaymentService.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.zaga.PaymentService.Entity.UPI;

public interface UPIRepo extends MongoRepository<UPI ,String>{

    @Query("'upi_id': ?1, 'name': ?2")
    public UPI findByIdAndName(String upi_id, String name);
    
}
