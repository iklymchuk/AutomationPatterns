package com.klymchuk.automationPatterns._10_dataRegistry;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by iklymchuk on 3/9/17.
 *
 * If we need each time use the unique users we can use userRegistry pattern or create a pull of users and reserve/unreserve/delete it from pull
 */
public class UserRegistry {

    private static AtomicInteger COUNTER = new AtomicInteger(0);

    public static User getUser() {
        int index = COUNTER.incrementAndGet();

        return new User("User_" + index, index);
    }
}
