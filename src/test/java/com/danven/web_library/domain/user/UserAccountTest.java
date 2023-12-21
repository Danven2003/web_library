package com.danven.web_library.domain.user;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.billing.BillingDetails;
import com.danven.web_library.domain.book.FavouriteBooks;
import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.user.UserAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Set;

public class UserAccountTest {

    @Test
    public void createUserAccountTest(){
        LocalDateTime dateOfRegistration = LocalDateTime.of(2021, 9, 12, 5, 6, 7);
        boolean enabled = true;
        Set<Offer> offers = Set.of(Factory.getOffer(6), Factory.getOffer(7));
        BillingDetails billingDetails = Factory.getBillingDetailsCreditCard("Danila", "577 347 347");
        FavouriteBooks favouriteBooks = Factory.getFavouriteBooks();

        UserAccount userAccount = UserAccount.builder()
                .dateOfRegistration(dateOfRegistration)
                .enabled(true)
                .billingDetails(billingDetails)
                .favouriteBooks(favouriteBooks)
                .offers(offers)
                .build();

        Assertions.assertEquals(dateOfRegistration, userAccount.getDateOfRegistration());
        Assertions.assertEquals(enabled, userAccount.isEnabled());
        Assertions.assertEquals(billingDetails, userAccount.getBillingDetails());
        Assertions.assertEquals(favouriteBooks, userAccount.getFavouriteBooks());
    }
}
