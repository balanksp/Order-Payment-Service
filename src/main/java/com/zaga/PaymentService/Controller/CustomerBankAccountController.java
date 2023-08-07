package com.zaga.PaymentService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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


   
}
