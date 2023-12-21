package com.danven.web_library.domain.book;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class EBook extends Book {

    private double fileWeightInMb;

    private byte[] book;

    private String format;

    private int numberOfPages;

    @Builder
    public EBook(String name, int yearOfPublishing, String description, String author, Set<Category> categories, Language language, Set<Image> images, double fileWeightInMb, byte[] book, String format, int numberOfPages) {
        super(name, yearOfPublishing, description, author, categories, language, images);
        this.fileWeightInMb = fileWeightInMb;
        this.book = book;
        this.format = format;
        this.numberOfPages = numberOfPages;
    }

}
