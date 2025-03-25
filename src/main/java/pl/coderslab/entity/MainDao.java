package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Marek");
        user.setEmail("mbek@gmail.com");
        user.setPassword("marek2137");

        UserDao usr = new UserDao();

        User read = usr.read(1);
        System.out.println(read);

        User readNotExist = usr.read(2);
        System.out.println(readNotExist);

        User userToUpdate = usr.read(1);
        userToUpdate.setUserName("adi");
        userToUpdate.setEmail("nowak@bmw.com");
        userToUpdate.setPassword("alamakota");
        usr.update(userToUpdate);


    }
}
