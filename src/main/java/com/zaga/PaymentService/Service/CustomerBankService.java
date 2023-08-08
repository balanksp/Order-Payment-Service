package com.zaga.PaymentService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaga.PaymentService.DTO.EventDto;
import com.zaga.PaymentService.Entity.CustomerBankAccount;
import com.zaga.PaymentService.Repo.CustomerBankRepo;

@Service
public class CustomerBankService {

    @Autowired
    CustomerBankRepo repo;

    private Double customerOrderAmount;

    public void viewCustomerBankBalance(EventDto dto) {
        CustomerBankAccount accountDetails = repo.getBankBalance(dto.getAccount_number(), dto.getName());
        Double balance = accountDetails.getBank_balance();
        System.out.println(balance + "\n------------------->");

    }

    public void orderAmount(Double orderAmount) {
        customerOrderAmount = orderAmount;
    }

    public void deductAmount(Double accountBalance){
        double newBalance = accountBalance - customerOrderAmount;
        CustomerBankAccount customerAccount = new CustomerBankAccount();
        customerAccount.setBank_balance(newBalance);
        System.out.println("Amount of "+customerOrderAmount+" is debited from your account. New balance is " + newBalance);

}

  public CustomerBankAccount createBankAccount(CustomerBankAccount customer){
     
    return repo.save(customer);
  }


}