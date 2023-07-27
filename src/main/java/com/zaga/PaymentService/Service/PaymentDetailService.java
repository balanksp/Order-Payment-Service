package com.zaga.PaymentService.Service;

import org.springframework.stereotype.Service;

import com.zaga.PaymentService.Entity.PaymentDetails;
@Service
public interface PaymentDetailService {
    public PaymentDetails createPaymentDetails (PaymentDetails PaymentDetails);
}
