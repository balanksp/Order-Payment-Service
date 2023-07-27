package com.zaga.PaymentService.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.ApplicationScope;

import com.zaga.PaymentService.DTO.CreditCardDTO;
import com.zaga.PaymentService.DTO.UPIDto;
import com.zaga.PaymentService.Entity.PaymentDetails;
import com.zaga.PaymentService.Kafka.Producer;
import com.zaga.PaymentService.Repo.PaymentDetailsRepo;
import com.zaga.PaymentService.Service.PaymentDetailService;
@ApplicationScope
public class PaymentDetailsImple implements PaymentDetailService {

    @Autowired
    CreditCardDTO dto;

    @Autowired
    UPIDto dto2;

    @Autowired
    Producer producer;

    @Autowired
    PaymentDetailsRepo repo;

    @Override
    public PaymentDetails createPaymentDetails(PaymentDetails details) {

        if (details.getPayment_type().equalsIgnoreCase("CreditCard Payment")) {
            System.out.println("------------------------------>");
            System.out.println("Payment Type" + details.getPayment_type());
            dto.setCard_number(details.getCard_number());
            dto.setName(details.getName());
            dto.setCvv(details.getCvv());
            dto.setExpiry_date(details.getExpiry_date());
            producer.sendMsgTocreditCard(dto);
        }

        if (details.getPayment_type().equalsIgnoreCase("UPI Payment")) {
            System.out.println("-------------------------------->");
            System.out.println("Payment Type" + details.getPayment_type());
            dto2.setName(details.getName());
            dto2.setUpi_id(details.getUpi_id());
            producer.sendMsgToUPI(dto2);
        }

        Double orderAmount = details.getAmount();
        producer.sendAmount(orderAmount);

        String merchant_Account_number = details.getMerchant_account_number();
        producer.sendMerchant_account_number(merchant_Account_number);

        PaymentDetails paymentDetail = repo.save(details);
        return paymentDetail;
    }

}
