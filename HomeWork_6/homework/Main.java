package homework;

import homework.impl.UserReporter;
import homework.impl.UserSaver;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Jon");
        UserReporter.report(user1);
        UserSaver.save(user1);
        UserReporter.report(user2);
        UserSaver.save(user2);
    }

}