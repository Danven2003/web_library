package com.danven.web_library.domain.operation;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.book.FavouriteBooks;
import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.operation.LikeProduct;
import com.danven.web_library.domain.operation.Selling;
import com.danven.web_library.domain.user.Owner;
import com.danven.web_library.domain.user.UserAccount;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class SellingTest {

    @Test
    public void createSellingTest(){
        Owner userAccount = Factory.getOwner("Danila Venski");
        Offer offer = Factory.getOffer(2);
        LocalDateTime time = LocalDateTime.of(2022, 9, 11, 11, 34, 5);

        Selling selling = Selling.builder()
                .owner(userAccount)
                .offer(offer)
                .date(time)
                .build();

        Assertions.assertEquals(userAccount, selling.getOwner());
        Assertions.assertEquals(offer, selling.getOffer());
        Assertions.assertEquals(time, selling.getDate());
    }
}
