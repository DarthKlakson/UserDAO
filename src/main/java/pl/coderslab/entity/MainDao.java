package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Marek");
        user.setEmail("mbek@gmail.com");
        user.setPassword("marek2137");

        UserDao usr = new UserDao();
        usr.create(user);

    }
}
