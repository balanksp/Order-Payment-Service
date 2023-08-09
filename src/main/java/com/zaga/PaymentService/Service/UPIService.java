package com.zaga.PaymentService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaga.PaymentService.DTO.UPIDto;
import com.zaga.PaymentService.Entity.UPI;

@Service
public interface UPIService {
    

    public void verifyAccount(UPIDto dto);

    public UPI createUpiDetails(UPI upiDetails);

    public UPI getUpiAccountNumber(String upi_id,String name);

    

    
}
