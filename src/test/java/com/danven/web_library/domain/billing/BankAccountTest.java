package com.danven.web_library.domain.billing;

import com.danven.web_library.domain.billing.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void createBillingDetailsTest(){
        String owner = "Danila Venski";
        String bankName = "CreditAgricole";
        String account = "4526 2346 3426";
        String swift = "346 437 435";
        BankAccount billingDetails = BankAccount.builder()
                .owner(owner)
                .bankName(bankName)
                .account(account)
                .swift(swift)
                .build();

        Assertions.assertEquals(owner, billingDetails.getOwner());
        Assertions.assertEquals(bankName, billingDetails.getBankName());
        Assertions.assertEquals(account, billingDetails.getAccount());
        Assertions.assertEquals(swift, billingDetails.getSwift());
    }
}
