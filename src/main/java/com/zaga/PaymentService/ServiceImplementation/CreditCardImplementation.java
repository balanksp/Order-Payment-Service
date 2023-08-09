package com.zaga.PaymentService.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaga.PaymentService.DTO.CreditCardDTO;
import com.zaga.PaymentService.DTO.EventDto;
import com.zaga.PaymentService.Entity.CreditCard;
import com.zaga.PaymentService.Repo.CreditCardRepo;
import com.zaga.PaymentService.Service.CreditCardService;

@Service
public class CreditCardImplementation implements CreditCardService {

    @Autowired
    CreditCardRepo repo;

    // @Autowired(required=false)
    // EventDto event;

    @Override
    public void verifyAccount(CreditCardDTO dto) {
        CreditCard cardDetails = repo.findByCard_numberAndCvvAndExpiry_dateAndName(
                dto.getCard_number(), dto.getCvv(), dto.getExpiry_date(), dto.getName());
              System.out.println(cardDetails+"\n>>----------------------->");
        EventDto event = new EventDto();
        System.out.println(event+"\n>>----------------------->");
        event.setAccount_number(cardDetails.getCustomer_account_number());
        event.setName(cardDetails.getName());
        System.out.println(  ">>>------------verify Account------------>"+ event);
    }

    @Override
    public CreditCard createCreditCardDetails(CreditCard card) {
       return repo.save(card);
    }

    @Override
    public CreditCard viewDetailsByCardNumber(String card_number) {
        CreditCard DetailsByCardNumber = repo.findByCardNumber(card_number);
        System.out.println(DetailsByCardNumber.getCustomer_account_number());
        return DetailsByCardNumber;
    }
   
    // verify that CustomerAccountNo
    public CreditCard getCustomerAccountNumber(String card_number, String name){
        CreditCard creditCard = repo.findByCardNumberAndName(card_number, name);
          return creditCard;
    }

    }
    
    

   

