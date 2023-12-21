package com.danven.web_library;

import com.danven.web_library.domain.billing.BillingDetails;
import com.danven.web_library.domain.billing.CreditCard;
import com.danven.web_library.domain.book.*;
import com.danven.web_library.domain.offer.ContactInfo;
import com.danven.web_library.domain.offer.Offer;
import com.danven.web_library.domain.operation.SendReport;
import com.danven.web_library.domain.report.Report;
import com.danven.web_library.domain.user.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

public class Factory {

    public static Image getImage(String path, String format) {
        Image image = null;
        try {
            image = new Image(Files.readAllBytes(Path.of(path)), format);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    public static Category getCategory(String name) {
        return new Category(name);
    }

    public static Language getLanguage(String name) {
        return new Language(name);
    }

    public static Book getBook(String author, String name) {

        return PBook.builder()
                .categories(Set.of(
                        Factory.getCategory("Drama"),
                        Factory.getCategory("History"))
                )
                .images(Set.of(
                        getImage("src/test/testData/capybara.jpeg", "jpeg"),
                        getImage("src/test/testData/capybara2.jpeg", "jpeg"))
                )
                .language(getLanguage("English"))
                .author(author)
                .name(name)
                .description("good book")
                .yearOfPublishing(1978)
                .numberOfPages(50)
                .build();

    }

    public static ContactInfo getContactInfo(String email) {
        return new ContactInfo(
                email,
                "887 87 64",
                "https://instagram.com/page/sdafsadfsdaf");
    }

    public static Offer getOffer(int numberOfCopies) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 9, 21, 6, 5, 47);
        return Offer.builder()
                .contactInfo(getContactInfo("danven2003@gmail.com"))
                .book(getBook("Bykaw", "MaladySaldatic"))
                .numberOfCopies(numberOfCopies)
                .price(35)
                .publishingTime(localDateTime)
                .build();
    }

    public static BillingDetails getBillingDetailsCreditCard(String owner, String cardNumber) {
        int expMonth = 11;
        int expYear = 2025;
        return CreditCard.builder()
                .owner(owner)
                .cardNumber(cardNumber)
                .expMonth(expMonth)
                .expYear(expYear)
                .build();

    }


    public static FavouriteBooks getFavouriteBooks() {
        Set<Offer> offers = Set.of(Factory.getOffer(6), Factory.getOffer(7));
        return FavouriteBooks.builder()
                .offers(offers)
                .build();
    }

    public static UserAccount getUserAccount(LocalDateTime dateOfRegistration) {
        boolean enabled = true;
        Set<Offer> offers = Set.of(Factory.getOffer(6), Factory.getOffer(7));
        BillingDetails billingDetails = Factory.getBillingDetailsCreditCard("Danila", "577 347 347");
        FavouriteBooks favouriteBooks = Factory.getFavouriteBooks();

        return UserAccount.builder()
                .dateOfRegistration(dateOfRegistration)
                .enabled(enabled)
                .billingDetails(billingDetails)
                .favouriteBooks(favouriteBooks)
                .offers(offers)
                .build();
    }


    public static Borrower getBorrower(String name){
        UserAccount userAccount = Factory.getUserAccount(LocalDateTime.of(2021, 9, 12, 5, 6, 7));
        LocalDate dateOfBirth = LocalDate.of(2003, 9, 24);
        String email = "danven@gmail.com";
        String username = "danven2003";
        return Borrower.builder()
                .userAccount(userAccount)
                .dateOfBirth(dateOfBirth)
                .name(name)
                .email(email)
                .username(username)
                .build();
    }

    public static Administrator getAdministrator(String name){
        UserAccount userAccount = Factory.getUserAccount(LocalDateTime.of(2021, 9, 12, 5, 6, 7));
        LocalDate dateOfBirth = LocalDate.of(2003, 9, 24);
        String email = "danven@gmail.com";
        String username = "danven2003";
        return Administrator.builder()
                .userAccount(userAccount)
                .dateOfBirth(dateOfBirth)
                .name(name)
                .email(email)
                .username(username)
                .build();
    }

    public static Owner getOwner(String name){
        UserAccount userAccount = Factory.getUserAccount(LocalDateTime.of(2021, 9, 12, 5, 6, 7));
        LocalDate dateOfBirth = LocalDate.of(2003, 9, 24);
        String email = "danven@gmail.com";
        String username = "danven2003";
        return Owner.builder()
                .userAccount(userAccount)
                .dateOfBirth(dateOfBirth)
                .name(name)
                .email(email)
                .username(username)
                .build();
    }

    public static Buyer getBuyer(String name){
        UserAccount userAccount = Factory.getUserAccount(LocalDateTime.of(2021, 9, 12, 5, 6, 7));
        LocalDate dateOfBirth = LocalDate.of(2003, 9, 24);
        String email = "danven@gmail.com";
        String username = "danven2003";
        return Buyer.builder()
                .userAccount(userAccount)
                .dateOfBirth(dateOfBirth)
                .name(name)
                .email(email)
                .username(username)
                .build();
    }

    public static Report getReport(String description){
        return new Report(description);
    }

}
