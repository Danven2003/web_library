package com.danven.web_library.domain.operation;

import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.user.Borrower;
import com.danven.web_library.domain.user.Buyer;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@EqualsAndHashCode
@Builder
public class Buy {

    private LocalDateTime date;

    private Buyer buyer;

    private Offer offer;

    @Builder
    public Buy(LocalDateTime date, Buyer buyer, Offer offer) {
        this.date = date;
        this.buyer = buyer;
        this.offer = offer;
    }
}
