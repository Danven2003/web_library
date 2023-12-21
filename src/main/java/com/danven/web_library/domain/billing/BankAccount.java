package com.danven.web_library.domain.billing;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class BankAccount extends BillingDetails {

    private String account;

    private String bankName;

    private String swift;

    @Builder
    public BankAccount(String owner, String account, String bankName, String swift) {
        super(owner);
        this.account = account;
        this.bankName = bankName;
        this.swift = swift;
    }
}
