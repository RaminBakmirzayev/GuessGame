package bean;

public class Config {
    private User[] users = null;

    private static final Config instance = new Config();
    private static Boolean loogedIn = false;

    public static Boolean getLoogedIn() {
        return loogedIn;
    }

    public static void setLoogedIn(Boolean loogedIn) {
        Config.loogedIn = loogedIn;
    }

    private Config() {

    }

    public static Config getInstance() {
        return instance;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }


    public void showAllUsers() {
        User[] users1 = Config.getInstance().getUsers();

        for (int i = 0; i < users1.length; i++) {

            System.out.println("User" + (i + 1) + ":" + users1[i]);
        }

    }
}
