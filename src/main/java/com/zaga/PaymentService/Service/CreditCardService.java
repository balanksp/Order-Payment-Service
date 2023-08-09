package com.zaga.PaymentService.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zaga.PaymentService.DTO.CreditCardDTO;
import com.zaga.PaymentService.Entity.CreditCard;

@Service
public interface CreditCardService {

    public void verifyAccount(CreditCardDTO dto);

    public CreditCard createCreditCardDetails(CreditCard card);

    public CreditCard viewDetailsByCardNumber(String card_number);

    public CreditCard getCustomerAccountNumber(String card_number, String name);

public List<CreditCard> findAllDetails();
}
