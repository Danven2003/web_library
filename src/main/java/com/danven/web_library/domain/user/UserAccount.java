package com.danven.web_library.domain.user;

import com.danven.web_library.domain.billing.BillingDetails;
import com.danven.web_library.domain.book.FavouriteBooks;
import com.danven.web_library.domain.offer.Offer;
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

}
