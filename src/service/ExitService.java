package service;

public class ExitService implements MenuService {
    @Override
    public void process() {
        System.exit(0);
    }
}