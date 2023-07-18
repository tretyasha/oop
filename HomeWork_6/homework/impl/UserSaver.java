package homework.impl;

import homework.User;

public class UserSaver{
    
    public static void save(User user) {
        System.out.println("Save for user: " + user.getName());
    }
}