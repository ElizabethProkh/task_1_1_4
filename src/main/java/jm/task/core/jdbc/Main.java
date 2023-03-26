package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Mary", "Petrova", (byte) 22);
        userService.saveUser("Ivan", "Sviridov", (byte) 30);
        userService.saveUser("Petr", "Morkovin", (byte) 28);
        userService.saveUser("Tanya", "Volkova", (byte) 24);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
