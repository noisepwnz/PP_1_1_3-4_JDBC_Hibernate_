package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Nikolay", "Belov", (byte) 23);
        userService.saveUser("Kirill", "Razboykin", (byte) 24);
        userService.saveUser("Roman", "Romanov", (byte) 24);
        userService.saveUser("Andrey", "Golubev", (byte) 50);
        userService.removeUserById(4);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}



