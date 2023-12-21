package com.danven.web_library.domain.operation;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.book.FavouriteBooks;
import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.operation.Buy;
import com.danven.web_library.domain.operation.LikeProduct;
import com.danven.web_library.domain.user.Buyer;
import com.danven.web_library.domain.user.UserAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class LikeProductTest {

    @Test
    public void createLikeProductTest(){
        UserAccount userAccount = Factory.getUserAccount(LocalDateTime.of(2022, 10, 24, 3, 6, 56));
        FavouriteBooks favouriteBooks = Factory.getFavouriteBooks();

        LikeProduct likeProduct = LikeProduct.builder()
                .userAccount(userAccount)
                .favouriteBooks(favouriteBooks)
                .build();

        Assertions.assertEquals(userAccount, likeProduct.getUserAccount());
        Assertions.assertEquals(favouriteBooks, likeProduct.getFavouriteBooks());
    }
}
