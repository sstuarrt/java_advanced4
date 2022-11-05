package com.company.java_advanced.homework3;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private List<Magazine> magazines = new ArrayList<Magazine>();
    private static User user;

    public Catalogue() {}

    public boolean addMagazine(Magazine magazine) {
        return magazines.add(magazine);
    }
}
