package com.zaga.PaymentService.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaga.PaymentService.DTO.UPIDto;
import com.zaga.PaymentService.Entity.UPI;
import com.zaga.PaymentService.Repo.UPIRepo;
import com.zaga.PaymentService.Service.UPIService;

@Service
public class UPIImplementation implements UPIService {


@Autowired
UPIRepo repo;


    @Override
    public void verifyAccount(UPIDto dto) {
       UPI upiDetails = repo.findByIdAndName(dto.getUpi_id(), dto.getName());
       System.out.println(upiDetails);
       UPIDto upidto = new UPIDto();
       upidto.setUpi_id(upiDetails.getUpi_id());
       upidto.setName(upiDetails.getName());
       System.out.println(upidto+"\n------------------>");

    }

    @Override
    public UPI createUpiDetails(UPI upiDetails) {
        return repo.save(upiDetails);

    }

    @Override
    public UPI getUpiAccountNumber(String upi_id, String name) {
        
                UPI upi = repo.findByIdAndName(upi_id, name);
                return upi;
    }
    
}
