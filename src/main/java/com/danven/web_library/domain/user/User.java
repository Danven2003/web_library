package com.danven.web_library.domain.user;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public abstract class User {

    private String name;

    private String username;

    private String email;

    private LocalDate dateOfBirth;

    private UserAccount userAccount;

}
