package com.danven.web_library.domain.operation;

import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.user.Owner;
import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class Selling {

    private LocalDateTime date;

    private Owner owner;

    private Offer offer;
}
