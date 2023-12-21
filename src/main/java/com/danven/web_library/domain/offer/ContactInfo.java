package com.danven.web_library.domain.offer;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class ContactInfo {

    private String email;

    private String telephoneNumber;

    private String socialMediaLink;

}
