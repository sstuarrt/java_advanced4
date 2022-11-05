package com.company.java_advanced.homework3;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<User> listOfUsers = new ArrayList<>();
    private static Service userService;

    private Service() {}

    public static Service getUserService() {
        if(userService == null) {
            userService = new Service();
        }
        return userService;
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }

    public void saveUser(User user) {
        listOfUsers.add(user);
    }

    public User getUser(String email) {
        return listOfUsers.stream().filter(user -> user.getEmail().equals(email)).findAny().orElse(null);
    }

}
