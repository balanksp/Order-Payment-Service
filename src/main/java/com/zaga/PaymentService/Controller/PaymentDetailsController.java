package com.zaga.PaymentService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.PaymentService.Entity.PaymentDetails;
import com.zaga.PaymentService.Service.PaymentDetailService;

@RestController
@RequestMapping("/PaymentDetails")
public class PaymentDetailsController {

    @Autowired
    PaymentDetailService service;

    @PostMapping("/CreatePaymentDetails")
    public ResponseEntity<PaymentDetails> paymentCreation(@RequestBody PaymentDetails paymentDetails) {
        PaymentDetails details = service.createPaymentDetails(paymentDetails);
        return ResponseEntity.ok(details);
    }

}