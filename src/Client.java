import adapter.UserAdapter;
import database.Database;
import model.User;

import java.sql.Connection;
import java.sql.SQLException;

public class Client {
    public static void main(String[] args) {

        Connection db = Database.getConnection();
        User user = new User(1, "André Gonçalves Vidal", "vidalsuporte@gmail.com");
        UserAdapter userAdapter = new UserAdapter(user);

        System.out.println("User ID: " + userAdapter.getUserId());
        System.out.println("User Name: " + userAdapter.getUserName());
        System.out.println("User Email: " + userAdapter.getUserEmail());
    }



    }


