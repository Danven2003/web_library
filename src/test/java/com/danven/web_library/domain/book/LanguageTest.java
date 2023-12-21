package com.danven.web_library.domain.book;

import com.danven.web_library.domain.book.Language;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LanguageTest {
    private String languageNameEnglish = "English";
    private String languageNamePolish = "Polish";

    @Test
    public void testCreateCategory(){
        Language language = new Language(languageNameEnglish);
        Assertions.assertEquals(languageNameEnglish, language.getName());
    }

    @Test
    public void testSetParameterCategory(){
        Language language = new Language(languageNameEnglish);
        language.setName(languageNamePolish);
        Assertions.assertEquals(languageNamePolish, language.getName());
    }
}
