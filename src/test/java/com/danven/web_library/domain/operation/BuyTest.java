package com.danven.web_library.domain.operation;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.operation.Borrow;
import com.danven.web_library.domain.operation.Buy;
import com.danven.web_library.domain.user.Borrower;
import com.danven.web_library.domain.user.Buyer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class BuyTest {

    @Test
    public void createBuyMethod(){
        Buyer buyer = Factory.getBuyer("Danila Venski");
        Offer offer = Factory.getOffer(2);
        LocalDateTime time = LocalDateTime.of(2023, 10, 24, 3, 6, 56);

        Buy buy = Buy.builder()
                .buyer(buyer)
                .offer(offer)
                .date(time)
                .build();

        Assertions.assertEquals(buyer, buy.getBuyer());
        Assertions.assertEquals(offer, buy.getOffer());
        Assertions.assertEquals(time, buy.getDate());
    }

}
