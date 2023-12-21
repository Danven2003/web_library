package com.danven.web_library.domain.offer;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.offer.Offer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class OfferTest {


    @Test
    public void testCreateOffer() {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 9, 21, 6, 5, 47);
        Offer offer = Offer.builder()
                .contactInfo(Factory.getContactInfo("danven2003@gmail.com"))
                .book(Factory.getBook("Bykaw", "MaladySaldatic"))
                .numberOfCopies(1)
                .price(35)
                .publishingTime(localDateTime)
                .build();
        Assertions.assertEquals(1, offer.getNumberOfCopies());
        Assertions.assertEquals(35, offer.getPrice());
        Assertions.assertEquals(localDateTime, offer.getPublishingTime());
        Assertions.assertEquals(Factory.getContactInfo("danven2003@gmail.com"), offer.getContactInfo());
        Assertions.assertEquals(Factory.getBook("Bykaw", "MaladySaldatic"), offer.getBook());
    }


}
