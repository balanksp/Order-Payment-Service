package com.zaga.PaymentService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.PaymentService.DTO.UPIDto;
import com.zaga.PaymentService.Entity.UPI;
import com.zaga.PaymentService.Service.UPIService;

@RestController
@RequestMapping("/upi")
public class UPIController {
    
    @Autowired
    UPIService service;

    @PostMapping("/create-upi-details")
    public UPI createUpiDetails(@RequestBody UPI upi){
        return service.createUpiDetails(upi);
    }
    
    @GetMapping("/verify-upi-account")
    public void getUpiDetails(@RequestParam UPIDto dto){
         service.verifyAccount(dto);
    }

    @GetMapping("/get-upi-account")
    public String getAccountDetails(@RequestParam String upi_id,@RequestParam String name){
        UPI accountNumber = service.getUpiAccountNumber(upi_id, name);
        return accountNumber.getCustomer_account_number();
    }



}
