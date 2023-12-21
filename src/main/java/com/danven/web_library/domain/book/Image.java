package com.danven.web_library.domain.book;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class Image {

    private byte[] image;

    private String format;

}
