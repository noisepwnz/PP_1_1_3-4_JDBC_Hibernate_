package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

    //    userDaoJDBC.saveUser("Masha", "Belov", (byte) 25);
//        userDaoJDBC.saveUser("Kirill", "Razboykin", (byte) 24);
           //userDaoJDBC.removeUserById(3);
  System.out.println(userDaoJDBC.getAllUsers());
       // userDaoJDBC.cleanUsersTable();

    }
}
