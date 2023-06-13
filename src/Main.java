
public class Main {
    public static void main(String[] args) {
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("Welcome admin");
                break;
            case "user":
                System.out.println("Welcome user");
                break;
            default:
                System.out.println("You are using as Guest");
        }
    }
}