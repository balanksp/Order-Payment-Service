package com.zaga.PaymentService.Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import com.zaga.PaymentService.DTO.CreditCardDTO;
import com.zaga.PaymentService.DTO.UPIDto;
import com.zaga.PaymentService.Entity.CustomerBankAccount;
import com.zaga.PaymentService.Entity.PaymentDetails;
@Service
public class Producer {
    
// @Autowired
// PaymentDetails details;

// @Autowired
//  CreditCardDTO dto;

//      @Autowired
//     UPIDto dto2;

// public static final String topic = "balance";
//  private static final String topic = "payment-service";
 private static final String topic1 = "payment-service2";

 @Autowired
private KafkaTemplate <String,CreditCardDTO> template ;

private KafkaTemplate <String,UPIDto> template1 ;

@Autowired
private KafkaTemplate <String,Double> templete2 ;

@Autowired
private KafkaTemplate <String,String> templete3 ;

// private KafkaTemplate <String,CustomerBankAccount> templete4 ;

public void sendMsgTocreditCard(CreditCardDTO dto) {
    System.out.println("------------->     "+dto);
    System.out.println("---------------testing");
  this.template.send("payment-service", dto);

}

public void sendMsgToUPI(UPIDto dto2) {
    System.out.println("------------->"+dto2);
  this.template1.send(topic1, dto2);

}

public void sendAmount(Double amount) {
    this.templete2.send("sendAmount", amount);
}

public void sendMerchant_account_number(String merchant_account_number){
    this.templete3.send("merchantAccount", merchant_account_number);
}
    
// public void balance_amount(CustomerBankAccount balance){
//  this.templete4.send("balance", balance);

// }
}