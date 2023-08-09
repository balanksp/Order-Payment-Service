package com.zaga.PaymentService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.PaymentService.DTO.CreditCardDTO;
import com.zaga.PaymentService.Entity.CreditCard;
import com.zaga.PaymentService.Service.CreditCardService;

@RestController
public class CreditcardController {

    @Autowired
    private CreditCardService service;

    @GetMapping("/verify")
    public void verifyAccountDetails(CreditCardDTO dto) {
        service.verifyAccount(dto);
    }

    @PostMapping("/CreateCard")
    public CreditCard createCards(@RequestBody CreditCard card) {
        return service.createCreditCardDetails(card);
    }

    @GetMapping("/viewCardDetails")
    public ResponseEntity<CreditCard> viewDetailsCard(@RequestParam String card_number) {
        CreditCard details = service.viewDetailsByCardNumber(card_number);
        return ResponseEntity.ok(details);
    }
   
    // verify that CustomerAccountNo
    @GetMapping("/customerAccountNumber")
    public String getCustomerAccountNumberByCardNumberAndName(@RequestParam String card_number,
            @RequestParam String name) {
        CreditCard details = service.getCustomerAccountNumber(card_number, name);
       return  details.getCustomer_account_number();

    }




}
