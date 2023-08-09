package com.zaga.PaymentService.Repo;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.zaga.PaymentService.Entity.CreditCard;

public interface CreditCardRepo extends MongoRepository<CreditCard,String> {
    
  @Query("{'card_number': ?0, 'cvv': ?1, 'expiry_date': ?2, 'name': ?3}")
  public CreditCard findByCard_numberAndCvvAndExpiry_dateAndName(String card_number,String cvv, String expiry_date, String name);
   
   @Query("{'card_number': ?0 }")
  public CreditCard findByCardNumber(String card_number);

  // verfiy that CustomerAccountNo
  @Query("{'card_number': ?0, 'name': ?1}")
  public CreditCard findByCardNumberAndName(String card_number, String name);

   
   

  }