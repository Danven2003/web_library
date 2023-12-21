package com.danven.web_library.domain.book;

import com.danven.web_library.Factory;
import com.danven.web_library.domain.book.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class EBookTest {

    private Set<Image> images;

    private Set<Category> categories;

    private Language language;

    private byte[] bookFile;


    @BeforeEach
    public void initialize() throws IOException {
        images = Set.of(
                Factory.getImage("src/test/testData/capybara.jpeg", "jpeg"),
                Factory.getImage("src/test/testData/capybara2.jpeg", "jpeg")
        );
        categories = Set.of(
                Factory.getCategory("Drama"),
                Factory.getCategory("History")
        );
        language = Factory.getLanguage("English");

        bookFile = Files.readAllBytes(Path.of("src/test/testData/MAS-05-en.pdf"));
    }

    @Test
    public void testCreateBook() throws IOException {
        String author = "Mariusz Trzaska";
        String name = "Design and Analysis of \n" +
                "Information Systems\n" +
                "(MAS)";
        String description = "associations";
        String format = "pdf";
        double fileSizeInMb = Files.size(Path.of("src/test/testData/MAS-05-en.pdf"))/Math.pow(1024, 2);
        int yearOfPublishing = 1978;
        int numberOfPages = 50;

        EBook book = EBook.builder()
                .categories(categories)
                .images(images)
                .language(language)
                .author(author)
                .name(name)
                .description(description)
                .yearOfPublishing(yearOfPublishing)
                .fileWeightInMb(fileSizeInMb)
                .book(bookFile)
                .format(format)
                .numberOfPages(numberOfPages)
                .build();

        assertIterableEquals(categories, book.getCategories());
        assertIterableEquals(images, book.getImages());
        assertEquals(language, book.getLanguage());
        assertEquals(author, book.getAuthor());
        assertEquals(name, book.getName());
        assertEquals(description, book.getDescription());
        assertEquals(yearOfPublishing, book.getYearOfPublishing());
        assertEquals(bookFile, book.getBook());
        assertEquals(format, book.getFormat());
        assertEquals(numberOfPages, book.getNumberOfPages());
    }

}