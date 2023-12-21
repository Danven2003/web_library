package com.danven.web_library.domain.operation;

import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.user.Borrower;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@Builder
public class Borrow {

    private LocalDateTime date;

    private LocalDateTime period;

    private String description;

    private Offer offer;

    private Borrower borrower;

    @Builder
    public Borrow(LocalDateTime date, LocalDateTime period, String description, Offer offer, Borrower borrower) {
        this.date = date;
        this.period = period;
        this.description = description;
        this.offer = offer;
        this.borrower = borrower;
    }
}
