package service;

import util.MenuUtil;

public class LogOutService implements MenuService{
    @Override
    public void process() {
        MenuUtil.showMenu();
    }
}
