package com.danven.web_library.domain.book;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;


@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DBook extends Book {

    private double durationInHours;

    private DiskFormat diskFormat;
    @Builder
    public DBook(String name, int yearOfPublishing, String description, String author, Set<Category> categories, Language language, Set<Image> images, double durationInHours, DiskFormat diskFormat) {
        super(name, yearOfPublishing, description, author, categories, language, images);
        this.durationInHours = durationInHours;
        this.diskFormat = diskFormat;
    }

}
