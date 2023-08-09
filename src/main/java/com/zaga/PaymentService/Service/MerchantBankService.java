package com.zaga.PaymentService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaga.PaymentService.Entity.MerchantBankAccount;
import com.zaga.PaymentService.Repo.MerchantBankRepo;

@Service
public class MerchantBankService {
    
    @Autowired
    MerchantBankRepo repo;

    private Double purchaseAmount;
    private Double newBalance;

    public Double viewMerchantBalance(String merchant_account_number, String account_holder_name) 
{
     MerchantBankAccount MerchantBalance = repo.getMerchantBankBalance(account_holder_name, account_holder_name);
       Double bankBalance = MerchantBalance.getBank_balance();
       System.out.println(bankBalance);
       return bankBalance;

}

   public MerchantBankAccount  createMerchantAccount(MerchantBankAccount account){
      return repo.save(account);
   }

   public void creditAmount(Double accountBalance){
      newBalance = accountBalance + purchaseAmount;
      MerchantBankAccount merchantAccount = new MerchantBankAccount();
      merchantAccount.setBank_balance(newBalance);
      System.out.println("Amount of" +purchaseAmount +"is credited to your account. New balance is "+newBalance);
   }

   public void orderAmount(Double customerOrderAmount){
      purchaseAmount = customerOrderAmount;      
   }

   public List<MerchantBankAccount> getAllDetails(){
     return repo.findAll();
   }

}

