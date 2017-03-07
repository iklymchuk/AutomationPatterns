package com.klymchuk.automationPatterns._5_chainOfInvocations;

import com.klymchuk.automationPatterns._1_pageObject.TestPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by iklymchuk on 3/7/17.
 */
public class ChainOfInvocationsTest {

    TestPage testPage;

    @Test
    public void testWITHOUTChainOfInvocations() {
        testPage.login("test", "test");
        testPage.typeUserName("userName");

        assertEquals("userName", testPage.getUserName());

    }

    @Test
    public void testWITHChainOfInvocations() {
        testPage.login("test", "test")
                .typeUserName("userName");

        assertEquals("userName", testPage.getUserName());

    }
}
