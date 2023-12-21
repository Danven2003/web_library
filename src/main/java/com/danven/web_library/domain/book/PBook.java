package com.danven.web_library.domain.book;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class PBook extends Book {

    private int numberOfPages;

    @Builder
    public PBook(String name, int yearOfPublishing, String description, String author, Set<Category> categories, Language language, Set<Image> images, int numberOfPages) {
        super(name, yearOfPublishing, description, author, categories, language, images);
        this.numberOfPages = numberOfPages;
    }


}
