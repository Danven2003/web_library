package com.danven.web_library.domain.book;

import com.danven.web_library.domain.offer.Offer;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class FavouriteBooks {

    Set<Offer> offers;

}
