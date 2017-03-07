package com.klymchuk.automationPatterns._8_dataProvider;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

/**
 * Created by iklymchuk on 3/7/17.
 */
@RunWith(Parameterized.class)
public class JUnitParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "abc", "abc" },
                { "cba", "abc" },
        });
    }

    private final String input;
    private final String expected;

    public JUnitParameterizedTest(final String input, final String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testSort() {
    }
}
