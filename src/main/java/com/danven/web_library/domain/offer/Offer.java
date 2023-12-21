package com.danven.web_library.domain.offer;

import com.danven.web_library.domain.book.Book;
import com.danven.web_library.domain.operation.*;
import com.danven.web_library.domain.report.Report;
import lombok.*;

import java.time.LocalDateTime;
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

    private Set<SendReport> sendReports;

    private ContactInfo contactInfo;

    private Borrow borrow;

    private Buy buy;

    private Selling selling;


    @Builder
    public Offer(LocalDateTime publishingTime, double price, int numberOfCopies, Book book, ContactInfo contactInfo) {
        this.publishingTime = publishingTime;
        this.price = price;
        this.numberOfCopies = numberOfCopies;
        this.book = book;
        this.contactInfo = contactInfo;
    }

}
