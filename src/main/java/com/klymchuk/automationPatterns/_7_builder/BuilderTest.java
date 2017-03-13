package com.klymchuk.automationPatterns._7_builder;

import org.junit.Test;

/**
 * Created by iklymchuk on 3/7/17.
 */
public class BuilderTest {

    @Test
    public void buildUserTest() {
        User user = new User.UserBuilder("Ivan", "Klymchuk")
                .age(27)
                .phone("555-695")
                .address("Kiev, Ukraine")
                .build();

    }

    @Test
    public void buildEmailTest() {
        Email email = new Email("klymhuk.ivan@gmail.com")
                .addTypeEmail("private")
                .addSubject("test subject");
    }

    @Test
    public void buildDefaultEmailTest() {
        Email email = new Email("klymhuk.ivan@gmail.com")
                .buildDefault();
    }

    @Test
    public void lombokBuilderTest() {
        LombokEntity.builder()
                .age("28")
                .name("Ivan")
                .build();
    }
}
