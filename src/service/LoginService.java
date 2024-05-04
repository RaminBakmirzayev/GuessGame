package service;

import bean.Config;

import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginService implements MenuService {

    private static final String USERNAME = "ramin";
    private static final String PASSWORD = "2222";

    @Override
    public void process() {
        int loginAttempts = 0;
        Scanner scanner = new Scanner(System.in);

        while (loginAttempts < 3) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                System.out.println("Successful login!");
                break;
            }

            System.out.println("Incorrect username or password. Try again.");
            loginAttempts++;
        }

        if (loginAttempts == 3) {
            System.out.println("You banned");
            System.exit(0);
        }

        Config.setLoogedIn(true);
    }

}
