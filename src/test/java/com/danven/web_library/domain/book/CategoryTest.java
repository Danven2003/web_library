package com.danven.web_library.domain.book;

import com.danven.web_library.domain.book.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryTest {
    private String categoryNameDocumentary = "Documentary";

    private String categoryNameScience = "Science";

    @Test
    public void testCreateCategory(){
        Category category = new Category(categoryNameDocumentary);
        Assertions.assertEquals(categoryNameDocumentary, category.getName());
    }

    @Test
    public void testSetParameterCategory(){
        Category category = new Category(categoryNameDocumentary);
        category.setName(categoryNameScience);
        Assertions.assertEquals(categoryNameScience, category.getName());
    }

}
