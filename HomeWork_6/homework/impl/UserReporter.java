package homework.impl;

import homework.User;

public class UserReporter {

    public static void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}