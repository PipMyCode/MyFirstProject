public class StringMethodsPrac {
    public static void main(String[] args) {

        String name = "Marcus";
        String password = "oyindamola";
        String email = "ADIGUNMARCUS@gmail.com";
        String file = "report.pdf";

        System.out.println(name.length());

        if (password.length() < 8) {
            System.out.println("Password too short");
        }
        else {
            System.out.println("Excellent password");
        }

        if (name.equals("Marcus")) {
            System.out.println("Allow login");
        }
        else {
            System.out.println("Invalid username");
        }

        System.out.println(name.trim());
        System.out.println(email.toLowerCase());

        if (email.equals("adigunmarcus@gmail.com")) {
            System.out.println("Valid email");
        }
        else {
            System.out.println("Invalid email");
        }

        System.out.println(email.equalsIgnoreCase("adigunmarcus@gmail.com"));
        System.out.println(email.contains("@gmail.com"));

        if (email.contains("@")) {
            System.out.println("Valid email");
        }
        else {
            System.out.println("Invalid email");
        }

        System.out.println(file.endsWith(".pdf"));
        System.out.println(email.endsWith("@gmail.com"));

        System.out.println(name.replace("u", "z"));

        if (name.isEmpty()) {
            System.out.println("Please enter your name");
        }
        else {
            System.out.println("Hello " + name);
        }

    }
}
