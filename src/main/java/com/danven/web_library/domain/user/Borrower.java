package com.danven.web_library.domain.user;

import com.danven.web_library.domain.operation.Borrow;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Borrower extends User{

    private Set<Borrow> borrows;

    @Builder
    public Borrower(Set<Borrow> borrows, String name, String username, String email, LocalDate dateOfBirth, UserAccount userAccount) {
        super(name, username, email, dateOfBirth, userAccount);
        this.borrows = borrows;
    }

    @Builder
    public Borrower(String name, String username, String email, LocalDate dateOfBirth, UserAccount userAccount) {
        super(name, username, email, dateOfBirth, userAccount);
    }
}
