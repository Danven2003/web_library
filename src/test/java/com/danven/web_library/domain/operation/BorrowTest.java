package com.danven.web_library.domain.operation;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.operation.Borrow;
import com.danven.web_library.domain.user.Borrower;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class BorrowTest {

    @Test
    public void createBorrowTest(){
        Borrower borrower = Factory.getBorrower("Danila Venski");
        Offer offer = Factory.getOffer(2);
        LocalDateTime startTime = LocalDateTime.of(2023, 10, 24, 3, 6, 56);
        LocalDateTime finishTime = LocalDateTime.of(2023, 11, 24, 3, 6, 56);

        Borrow borrow = Borrow.builder()
                .borrower(borrower)
                .offer(offer)
                .date(startTime)
                .period(finishTime)
                .build();

        Assertions.assertEquals(borrower, borrow.getBorrower());
        Assertions.assertEquals(offer, borrow.getOffer());
        Assertions.assertEquals(startTime, borrow.getDate());
        Assertions.assertEquals(finishTime, borrow.getPeriod());

    }
}
