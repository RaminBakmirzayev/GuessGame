package util;

import service.*;

public enum Menu {
    LOGIN(1, "Login", new LoginService()),
    REGISTER(2, "Register", new RegisterService()),
    START(3, "Start", new StartService()),
    LOGOUT(4, "LogoOut", new LogOutService()),
    EXIT(5, "Exit", new ExitService()),
    UNKNOWN;


    private int number;
    private String label;
    private MenuService menuService;

    Menu() {

    }

    Menu(int number, String label, MenuService menuService) {
        this.number = number;
        this.menuService = menuService;
        this.label = label;
    }

    @Override
    public String toString() {
        return number + "." + label;


    }


    public void process() {
        menuService.process();
        MenuUtil.showMenu();
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MenuService getMenuService() {
        return menuService;
    }

    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }

    public static Menu selectNumber(int num) {
        Menu[] m = Menu.values();

        for (int i = 0; i < m.length; i++) {
            if (m[i].number == num) {
                return m[i];
            } else if (num > m.length) {
                throw new IllegalArgumentException();
            }
        }


        return UNKNOWN;
    }

}
