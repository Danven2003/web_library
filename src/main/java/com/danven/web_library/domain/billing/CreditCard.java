package com.danven.web_library.domain.billing;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class CreditCard extends BillingDetails {

    private String cardNumber;

    private int expMonth;

    private int expYear;

    @Builder
    public CreditCard(String owner, String cardNumber, int expMonth, int expYear) {
        super(owner);
        this.cardNumber = cardNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
    }
}
