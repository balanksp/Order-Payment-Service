package com.zaga.PaymentService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaga.PaymentService.Entity.MerchantBankAccount;
import com.zaga.PaymentService.Repo.MerchantBankRepo;

@Service
public class MerchantBankService {
    
    @Autowired
    MerchantBankRepo repo;

    public MerchantBankAccount viewMerchantBalance(String merchantAccount)
{
     MerchantBankAccount MerchantBalance = repo.getMerchantBankBalance(merchantAccount);
       Double bankBalance = MerchantBalance.getBank_balance();
       System.out.println(bankBalance);
       return MerchantBalance;

}
   public MerchantBankAccount  createMerchantAccount(MerchantBankAccount account){
      return  repo.save(account);
   }


}
