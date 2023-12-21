package com.danven.web_library.domain.user;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.user.Administrator;
import com.danven.web_library.domain.user.UserAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AdministratorTest {

    @Test
    public void createBuyerTest() {
        UserAccount userAccount = Factory.getUserAccount(LocalDateTime.of(2021, 9, 12, 5, 6, 7));
        LocalDate dateOfBirth = LocalDate.of(2003, 9, 24);
        String name = "Danila Venski";
        String email = "danven@gmail.com";
        String username = "danven2003";

        Administrator admin = Administrator.builder()
                .userAccount(userAccount)
                .dateOfBirth(dateOfBirth)
                .name(name)
                .email(email)
                .username(username)
                .build();

        Assertions.assertEquals(userAccount, admin.getUserAccount());
        Assertions.assertEquals(dateOfBirth, admin.getDateOfBirth());
        Assertions.assertEquals(name, admin.getName());
        Assertions.assertEquals(email, admin.getEmail());
        Assertions.assertEquals(username, admin.getUsername());

    }
}
