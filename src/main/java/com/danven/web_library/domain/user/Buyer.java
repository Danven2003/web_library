package com.danven.web_library.domain.user;

import com.danven.web_library.domain.operation.Buy;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@EqualsAndHashCode
public class Buyer extends User{

    Set<Buy> buys;

    @Builder
    public Buyer(Set<Buy> buys, String name, String username, String email, LocalDate dateOfBirth, UserAccount userAccount) {
        super(name, username, email, dateOfBirth, userAccount);
        this.buys = buys;
    }

    public Buyer(String name, String username, String email, LocalDate dateOfBirth, UserAccount userAccount) {
        super(name, username, email, dateOfBirth, userAccount);
    }
}
