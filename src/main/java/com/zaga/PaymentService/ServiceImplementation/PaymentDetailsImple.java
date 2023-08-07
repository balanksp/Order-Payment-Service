package com.zaga.PaymentService.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaga.PaymentService.DTO.CreditCardDTO;
import com.zaga.PaymentService.DTO.UPIDto;
import com.zaga.PaymentService.Entity.PaymentDetails;
import com.zaga.PaymentService.Kafka.Producer;
import com.zaga.PaymentService.Repo.PaymentDetailsRepo;
import com.zaga.PaymentService.Service.PaymentDetailService;

@Service
public class PaymentDetailsImple implements PaymentDetailService {

    // @Autowired
    // CreditCardDTO dto;

    // @Autowired
    // Producer producer;

    // @Autowired
    // Producer producer1;


    @Autowired
    PaymentDetailsRepo repo;

    @Override
    public PaymentDetails createPaymentDetails(PaymentDetails details) {

        if (details.getPayment_type().equalsIgnoreCase("CreditCard Payment")) {
            System.out.println("------------------------------>");
            System.out.println("Payment Type    " + details.getPayment_type());
            CreditCardDTO dto = new CreditCardDTO();
            dto.setCard_number(details.getCard_number());
            dto.setName(details.getName());
            dto.setCvv(details.getCvv());
            dto.setExpiry_date(details.getExpiry_date());
            System.out.println(dto);
            // producer.sendMsgTocreditCard(dto);
        }

        if (details.getPayment_type().equalsIgnoreCase("UPI Payment")) {
            System.out.println("-------------------------------->");
            System.out.println("Payment Type     " + details.getPayment_type());
            UPIDto dto2 = new UPIDto();
            dto2.setName(details.getName());
            dto2.setUpi_id(details.getUpi_id());
            System.out.println(dto2);
            // producer.sendMsgToUPI(dto2);
        }

        Double orderAmount = details.getAmount();
        System.out.println(orderAmount);
        // producer1.sendAmount(orderAmount);

        String merchant_account_number = details.getMerchant_account_number();
        System.out.println(merchant_account_number);
        // producer.sendMerchant_account_number(merchant_account_number);

        PaymentDetails paymentDetail = repo.save(details);
        return paymentDetail;
    }

}
