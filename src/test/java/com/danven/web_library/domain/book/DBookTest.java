package com.danven.web_library.domain.book;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.book.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class DBookTest {

    private Set<Image> images;

    private Set<Category> categories;

    private Language language;


    @BeforeEach
    public void initialize(){
        images = Set.of(
                Factory.getImage("src/test/testData/capybara.jpeg", "jpeg"),
                Factory.getImage("src/test/testData/capybara2.jpeg", "jpeg")
        );
        categories = Set.of(
                Factory.getCategory("Drama"),
                Factory.getCategory("History")
        );
        language = Factory.getLanguage("English");
    }

    @Test
    public void testCreateBook(){
        String author = "Bykaw";
        String name = "Malody soldat";
        String description = "good book";
        DiskFormat diskFormat = DiskFormat.CD;
        int durationInHours = 5;
        int yearOfPublishing = 1978;

        DBook book = DBook.builder()
                .categories(categories)
                .images(images)
                .language(language)
                .author(author)
                .name(name)
                .description(description)
                .diskFormat(diskFormat)
                .durationInHours(durationInHours)
                .yearOfPublishing(yearOfPublishing)
                .build();

        assertIterableEquals(categories, book.getCategories());
        assertIterableEquals(images, book.getImages());
        assertEquals(language, book.getLanguage());
        assertEquals(author, book.getAuthor());
        assertEquals(name, book.getName());
        assertEquals(description, book.getDescription());
        assertEquals(yearOfPublishing, book.getYearOfPublishing());
        assertEquals(durationInHours, book.getDurationInHours());
        assertEquals(diskFormat, book.getDiskFormat());
    }

}
