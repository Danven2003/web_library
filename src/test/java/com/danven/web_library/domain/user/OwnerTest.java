package com.danven.web_library.domain.user;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.user.Owner;
import com.danven.web_library.domain.user.UserAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OwnerTest {

    @Test
    public void createOwnerTest() {
        UserAccount userAccount = Factory.getUserAccount(LocalDateTime.of(2021, 9, 12, 5, 6, 7));
        LocalDate dateOfBirth = LocalDate.of(2003, 9, 24);
        String name = "Danila Venski";
        String email = "danven@gmail.com";
        String username = "danven2003";

        Owner owner = Owner.builder()
                .userAccount(userAccount)
                .dateOfBirth(dateOfBirth)
                .name(name)
                .email(email)
                .username(username)
                .build();

        Assertions.assertEquals(userAccount, owner.getUserAccount());
        Assertions.assertEquals(dateOfBirth, owner.getDateOfBirth());
        Assertions.assertEquals(name, owner.getName());
        Assertions.assertEquals(email, owner.getEmail());
        Assertions.assertEquals(username, owner.getUsername());
    }
}
