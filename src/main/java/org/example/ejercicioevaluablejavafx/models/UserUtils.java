package org.example.ejercicioevaluablejavafx.models;

import java.util.ArrayList;

public class UserUtils {

    public static ArrayList<User> userList = new ArrayList<>();

    static {
        userList.add(new User("antonio@gmail.com", "Windows", true, 2, "5 Marzo 2024"));
        userList.add(new User("alejandro@gmail.com", "macOS", false, 1, "6 Febrero 2023"));
        userList.add(new User("carlos@gmail.com", "Linux", false, 4, "24 Octubre 2022"));
    }
}
