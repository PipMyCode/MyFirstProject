public class StaticPrac {
    public static void main(String[] args) {


        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Marcus");
        Friend friend2 = new Friend("Jane");
        Friend friend3 = new Friend("Bob");
        Friend friend4 = new Friend("Sally");
        Friend friend5 = new Friend("John");


        Friend.showFriends();

    }

}

