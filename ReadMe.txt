Entity
------
creditcard ,upi,customerBankAccount , merchantBankAccount, PaymentDetails

CreditCardRepository 
--------------------
verify creditcard Account 

UPIRepository
-------------
verify UPI Account

MerchantBankRepository
----------------------
 Fetch balance Using AccountNumber & then credit that amount 

 get that order amount 

 credit the amount to Merchant.

CustomerBankRepository
----------------------
 Fetch the balance Using UPI or credit card & then deduct Amount from customer account

PaymentDetailsServiceImpl
--------------------------
we have choose that creditcard or UPI payment type.

sending that orderAmmount. 
sending merchantAccountNumber.

persist that paymentDetails 

PaymentDetailsController
------------------------
post API's


 










