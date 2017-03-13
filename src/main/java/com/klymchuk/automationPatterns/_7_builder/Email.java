package com.klymchuk.automationPatterns._7_builder;

/**
 * Created by iklymchuk on 3/13/17.
 */
public class Email {

    private String typeEmail;
    private String email;
    private String subject;

    public Email (String email) {
        this.email = email;
    }

    public Email addSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Email addTypeEmail(String typeEmail) {
        this.typeEmail = typeEmail;
        return this;
    }

    public Email addEmail(String email) {
        this.email = email;
        return this;
    }

    public Email buildDefault() {
        addTypeEmail("private");
        addSubject("test subject");
        return this;
    }

}
