package util;

import bean.Config;

import java.util.Scanner;

import static util.Menu.LOGIN;

public class MenuUtilv2 {
    public static void showMenu() {
        System.out.println("Select one :");
        Menu[] menus = Menu.values();

        for (int i = 0; i < menus.length; i++) {
            if (menus[i] == Menu.UNKNOWN) {
                break;
            }

            if (menus[i] == LOGIN) {
                if (!Config.getLoogedIn()) {
                    System.out.println(menus[i]);
                }
            } else if (Config.getLoogedIn()) {
                System.out.println(menus[i]);
            }
        }

        Scanner sc = new Scanner(System.in);
        int selcetedNumber = sc.nextInt();
        Menu mm = Menu.selectNumber(selcetedNumber);
        mm.process();
    }
}
