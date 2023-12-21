package com.danven.web_library.domain.book;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.book.FavouriteBooks;
import com.danven.web_library.domain.offer.Offer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class FavouriteBooksTest {

    @Test
    public void createFavouriteBooksTest(){
        Set<Offer> offers = Set.of(Factory.getOffer(6), Factory.getOffer(7));
        FavouriteBooks favouriteBooks = FavouriteBooks.builder()
                .offers(offers)
                .build();

        Assertions.assertEquals(offers, favouriteBooks.getOffers());
    }

}
