package com.danven.web_library.domain.billing;

import com.danven.web_library.domain.billing.CreditCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCardTest {


    @Test
    public void createCreateCreditCardTest(){
        String owner = "Danila Venski";
        String cardNumber = "456 467 689";
        int expMonth = 11;
        int expYear = 2025;
        CreditCard billingDetails = CreditCard.builder()
                .owner(owner)
                .cardNumber(cardNumber)
                .expMonth(expMonth)
                .expYear(expYear)
                .build();

        Assertions.assertEquals(owner, billingDetails.getOwner());
        Assertions.assertEquals(cardNumber, billingDetails.getCardNumber());
        Assertions.assertEquals(expMonth, billingDetails.getExpMonth());
        Assertions.assertEquals(expYear, billingDetails.getExpYear());
    }


}

