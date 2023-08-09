package com.zaga.PaymentService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.PaymentService.DTO.EventDto;
import com.zaga.PaymentService.Entity.CustomerBankAccount;
import com.zaga.PaymentService.Service.CustomerBankService;

@RestController
@RequestMapping("/customerBankDetails")
public class CustomerBankAccountController {

@Autowired
CustomerBankService service;

@PostMapping("/createCustomerDetails")
public ResponseEntity<CustomerBankAccount> createCustomerBankAccount(@RequestBody CustomerBankAccount customerBankAccount) {
    return ResponseEntity.ok(service.createBankAccount(customerBankAccount)); 
}

// verify balance 
@GetMapping("/getBalance")
public void getBalance(EventDto dto){
    service.viewCustomerBankBalance(dto);
}

@GetMapping("/list-all-details")
public List<CustomerBankAccount> getAllCustomerBankAccountDetails(){
    return service.getAllDetails();
}

   }
