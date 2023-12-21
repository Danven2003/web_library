package com.danven.web_library.domain.user;

import com.danven.web_library.domain.billing.BillingDetails;
import com.danven.web_library.domain.book.FavouriteBooks;
import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.operation.LikeProduct;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;


@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class UserAccount {

    private LocalDateTime dateOfRegistration;

    private boolean enabled;

    private FavouriteBooks favouriteBooks;

    private BillingDetails billingDetails;

    private Set<Offer> offers;

    private LikeProduct likeProduct;

    public UserAccount(LocalDateTime dateOfRegistration, boolean enabled, FavouriteBooks favouriteBooks, BillingDetails billingDetails, Set<Offer> offers) {
        this.dateOfRegistration = dateOfRegistration;
        this.enabled = enabled;
        this.favouriteBooks = favouriteBooks;
        this.billingDetails = billingDetails;
        this.offers = offers;
    }
}
