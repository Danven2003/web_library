package com.danven.web_library.domain.offer;

import com.danven.web_library.domain.offer.ContactInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ContactInfoTest {

    private String emailFirst = "danven@gmail.com";

    private String emailSecond = "s2870821@pjwtk.edu.pl";

    private String telephoneNumber = "987 37 34";

    private String socialMediaLink = "https://instagram.com/page/sdafsadfsdaf";

    @Test
    public void testCreateContactInfo(){
        ContactInfo contactInfo = ContactInfo.builder()
                .email(emailFirst)
                .telephoneNumber(telephoneNumber)
                .socialMediaLink(socialMediaLink)
                .build();

        assertEquals(emailFirst, contactInfo.getEmail());
        assertEquals(telephoneNumber, contactInfo.getTelephoneNumber());
        assertEquals(socialMediaLink, contactInfo.getSocialMediaLink());
    }

    @Test
    public void testSetParameterCategory(){
        ContactInfo contactInfo = ContactInfo.builder()
                .email(emailFirst)
                .telephoneNumber(telephoneNumber)
                .socialMediaLink(socialMediaLink)
                .build();

        contactInfo.setEmail(emailSecond);
        Assertions.assertEquals(emailSecond, contactInfo.getEmail());
    }
}
