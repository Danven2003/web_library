package com.danven.web_library.domain.book;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;



@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class Book {

    private String name;

    private int yearOfPublishing;

    private String description;

    private String author;

    private Set<Category> categories;

    private Language language;

    private Set<Image> images;

    public Book(String name, int yearOfPublishing, String description, String author, Set<Category> categories, Language language, Set<Image> images) {
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
        this.description = description;
        this.author = author;
        this.categories = categories;
        this.language = language;
        this.images = images;
    }
}
