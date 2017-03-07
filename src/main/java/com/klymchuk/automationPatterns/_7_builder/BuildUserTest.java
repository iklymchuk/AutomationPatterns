package com.klymchuk.automationPatterns._7_builder;

import org.junit.Test;

/**
 * Created by iklymchuk on 3/7/17.
 */
public class BuildUserTest {

    User user;

    @Test
    public void buildUser() {
        user = new User.UserBuilder("Ivan", "Klymchuk")
                .age(27)
                .phone("555-695")
                .address("Kiev, Ukraine")
                .build();

    }
}
