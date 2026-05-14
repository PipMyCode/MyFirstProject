public class UserTest {
    public static void main(String[] args) {

        User user1 = new User("Marcus");
        User user2 = new User("Ben", "ben@gmail.com");
        User user3 = new User("Scoded", "scoded@gmail.com", 3);
        User user4 = new User();

        System.out.println(user4.username);
        System.out.println(user4.age);
        System.out.println(user4.email);
    }
}
