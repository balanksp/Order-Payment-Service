package com.zaga.PaymentService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.PaymentService.Entity.MerchantBankAccount;
import com.zaga.PaymentService.Service.MerchantBankService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/MerchantBankDetails")
public class MerchantBankAccountController {
    
    @Autowired
    MerchantBankService service;

    @PostMapping("/createMerchantBankDetails")
    public ResponseEntity<MerchantBankAccount> createMerchantBankDetails(@RequestBody MerchantBankAccount merchantAccount){
        
        return ResponseEntity.ok(service.createMerchantAccount(merchantAccount)) ;                 
    }
     
    // @GetMapping("/fetchMerchantBankBalance")



}
