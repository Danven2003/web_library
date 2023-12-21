package com.danven.web_library.domain.offer;

import com.danven.web_library.domain.book.Book;
import com.danven.web_library.domain.report.Report;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class Offer {

    private LocalDateTime publishingTime;

    private double price;

    private int numberOfCopies;

    private Book book;

    private Set<Report> reports;

    private ContactInfo contactInfo;

}
