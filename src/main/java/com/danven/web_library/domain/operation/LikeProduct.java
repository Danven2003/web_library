package com.danven.web_library.domain.operation;

import com.danven.web_library.domain.book.FavouriteBooks;
import com.danven.web_library.domain.user.UserAccount;
import lombok.*;


@Getter
@Setter
@EqualsAndHashCode

public class LikeProduct {

    private UserAccount userAccount;

    private FavouriteBooks favouriteBooks;

    @Builder
    public LikeProduct(UserAccount userAccount, FavouriteBooks favouriteBooks) {
        this.userAccount = userAccount;
        this.favouriteBooks = favouriteBooks;
    }
}
