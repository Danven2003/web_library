package com.danven.web_library.domain.book;

import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.operation.LikeProduct;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class FavouriteBooks {

    private Set<Offer> offers;

    private LikeProduct likeProduct;

}
