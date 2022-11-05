package com.company.java_advanced.homework3;

import java.util.ArrayList;
import java.util.List;

public class Subscription {
    private static Subscription userSubscription;
    private List<User> listOfUsers = new ArrayList<>();
    private List<Magazine> magazines = new ArrayList<Magazine>();

    public static Subscription getUserSubscription() {
        if(userSubscription == null) {
            userSubscription = new Subscription();
        }
        return userSubscription;
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }

    public void saveUserSubscription(User user) {
        listOfUsers.add(user);
    }

    public User getUser(String email) {
        return listOfUsers.stream().filter(user -> user.getEmail().equals(email)).findAny().orElse(null);
    }

    public void addPrepayment(User user, Magazine magazine, int month) {
        if(magazines.equals(magazine)) {
            user.addPrepayment(magazine);
            double price = magazine.getPrice() * month;
        }
    }

    public void cancelPrepayment(User user, Subscription subscription) {
        listOfUsers.remove(subscription);
    }
}
