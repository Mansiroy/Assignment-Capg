package day3;

public class LambdaLogin {

    public static void main(String[] args) {

        Login login = (user, pass) -> 
            user.equals("admin") && pass.equals("1234");

        System.out.println(login.validate("admin", "1234")); // true
        System.out.println(login.validate("admin", "1111")); // false
    }
}