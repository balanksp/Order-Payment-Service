package com.zaga.PaymentService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.PaymentService.Entity.MerchantBankAccount;
import com.zaga.PaymentService.Service.MerchantBankService;

@RestController
@RequestMapping("/merchantBankDetails")
public class MerchantBankAccountController {

    @Autowired
    MerchantBankService service;

    @PostMapping("/createMerchantBankDetails")
    public ResponseEntity<MerchantBankAccount> createMerchantBankDetails(
            @RequestBody MerchantBankAccount merchantAccount) {

        return ResponseEntity.ok(service.createMerchantAccount(merchantAccount));
    }

    @GetMapping("/fetchMerchantBankBalance")
    public ResponseEntity<Double> getMerchantBankBalance(@RequestParam String merchant_account_number,
            @RequestParam String account_holder_name) {
        return ResponseEntity.ok(service.viewMerchantBalance(merchant_account_number, account_holder_name));
    }

    @GetMapping("/list-all-details")
    public List<MerchantBankAccount> getAllMerchantBankAccountDetails() {
        return service.getAllDetails();
    }
    

}
