package com.zaga.PaymentService.Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.zaga.PaymentService.DTO.CreditCardDTO;
import com.zaga.PaymentService.DTO.UPIDto;
import com.zaga.PaymentService.Entity.PaymentDetails;

public class Producer {
    
@Autowired
PaymentDetails details;

@Autowired
 CreditCardDTO dto;

     @Autowired
    UPIDto dto2;

private KafkaTemplate <String,CreditCardDTO> template ;
private KafkaTemplate <String,UPIDto> template1 ;
private KafkaTemplate <String,Double> templete2 ;
private KafkaTemplate <String,String> templete3 ;

public void sendMsgTocreditCard(CreditCardDTO dto) {
    System.out.println("------------->"+dto);
  this.template.send("payment-service", dto);

}

public void sendMsgToUPI(UPIDto dto2) {
    System.out.println("------------->"+dto2);
  this.template1.send("payment-service", dto2);

}

public void sendAmount(Double amount) {
    this.templete2.send("payment-service", amount);
}

public void sendMerchant_account_number(String merchant_account_number){
    this.templete3.send("payment-service", merchant_account_number);
}
    
}
