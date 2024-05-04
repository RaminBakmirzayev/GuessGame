package service;

import bean.Config;
import bean.User;

import java.util.Scanner;

public class RegisterService implements MenuService {
    @Override
    public void process() {
        System.out.println("Enter  the number of Users");

        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        User[] users = new User[numb];

        for (int i = 0; i < numb; i++) {
            System.out.println("Enter" + (i + 1) + ".User name;");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.nextLine();

            System.out.println("Enter " + (i + 1) + ".User Surname:");
            Scanner sc2 = new Scanner(System.in);
            String surname = sc2.nextLine();

            System.out.println("Enter " + (i + 1) + ".User age:");
            Scanner sc3 = new Scanner(System.in);
            int age = sc3.nextInt();

            User u = new User();
            u.setName(name);
            u.setSurname(surname);
            u.setAge(age);

            users[i] = u;
        }

        Config.getInstance().setUsers(users);

        System.out.println("Info:");
        Config.getInstance().showAllUsers();
    }


}
