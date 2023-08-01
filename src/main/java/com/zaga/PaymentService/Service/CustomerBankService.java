// package com.zaga.PaymentService.Service;

// import org.springframework.beans.factory.annotation.Autowired;

// import com.zaga.PaymentService.DTO.EventDto;
// import com.zaga.PaymentService.Entity.CustomerBankAccount;
// import com.zaga.PaymentService.Kafka.Producer;
// import com.zaga.PaymentService.Repo.CustomerBankRepo;

// public class CustomerBankService {

//     @Autowired
//     private CustomerBankRepo customerBankAccountRepo;


//     private Double balance;

//     public void  getAccountBalance(EventDto dto) {
//         System.out.println("------------------->");
//         CustomerBankAccount customerAccount = customerBankAccountRepo
//                 .findByCustomerAccountNumberAndAccountHolderName(dto.getAccount_number(), dto.getName());

//             System.out.println("Customer Account Details " + customerAccount);
//            balance = customerAccount.getBank_balance();
//            Double accountBalance = balance;
//         //    Producer.balance_amount();
// }
//     }
