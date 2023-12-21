package com.danven.web_library.domain.user;

import com.danven.web_library.domain.operation.Selling;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Owner extends User{
    Set<Selling> sellings;

    @Builder
    public Owner(Set<Selling> sellings, String name, String username, String email, LocalDate dateOfBirth, UserAccount userAccount) {
        super(name, username, email, dateOfBirth, userAccount);
        this.sellings = sellings;
    }

    public Owner(String name, String username, String email, LocalDate dateOfBirth, UserAccount userAccount) {
        super(name, username, email, dateOfBirth, userAccount);
    }
}
