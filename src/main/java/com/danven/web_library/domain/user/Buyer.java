package com.danven.web_library.domain.user;

import lombok.Builder;

import java.time.LocalDate;

public class Buyer extends User{

    @Builder
    public Buyer(String name, String username, String email, LocalDate dateOfBirth, UserAccount userAccount) {
        super(name, username, email, dateOfBirth, userAccount);
    }
}
