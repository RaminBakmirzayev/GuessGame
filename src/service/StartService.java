package service;

import Game.Game;
import bean.Config;
import util.MenuUtil;

import java.util.Scanner;

public class StartService implements MenuService {
    private final String yes = "yes";
    private final String no = "no";

    @Override
    public void process() {
        if (Config.getInstance().getUsers() != null) {
            game();
            return;
        }

        System.out.println("There is no any gamer.Please register before start the game");
        MenuUtil.showMenu();
    }

    public void game() {

        System.out.println("The Game's rules:");

        System.out.println("Select any number between 1-5: ");
        Scanner sc = new Scanner(System.in);
        int selectedNumber = sc.nextInt();
        int numberSelectedbySystem = Game.getInstance().startGame(1, 5);

        if (selectedNumber == numberSelectedbySystem) {
            System.out.println("you won!");
            System.out.println("New game? Yes or no?");
            Scanner sw=new Scanner(System.in);
            String answer = sc.nextLine();
            if (answer.equals(yes)) {
                game();
            } else if (answer.equals(no)) {
                ExitService e = new ExitService();
                e.process();
            }

        } else {
            System.out.println("you failed");
            System.out.println("New game? Yes or no?");
            Scanner sc1 = new Scanner(System.in);
            String answer = sc1.nextLine();
            if (answer.equals(yes)) {
                process();
            } else if (answer.equals(no)) {
                LogOutService l = new LogOutService();
                l.process();
            }
        }

    }
}
