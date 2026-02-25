package ProblemStatements;

import java.util.*;
public class DigitalcomProcess {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        GameService service = new GameService();

        boolean running = true;
        boolean isLoggedIn = false;

        while (running) {

            System.out.println("\n===== DigitalCom Customer Portal =====");
            System.out.println("1) RegisterUser");
            System.out.println("2) Login");
            System.out.println("3) ViewGames");
            System.out.println("4) SearchByAuthor");
            System.out.println("5) Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter UserId: ");
                    String uid = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String pwd = sc.nextLine();

                    user.addUser(uid, pwd);
                    break;

                case 2:
                    System.out.print("Enter UserId: ");
                    String loginId = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPwd = sc.nextLine();

                    if (user.isAuthenticated(loginId, loginPwd)) {
                        isLoggedIn = true;
                        System.out.println("Login Successful!");
                    } else {
                        System.out.println("Invalid Credentials!");
                    }
                    break;

                case 3:
                    if (isLoggedIn) {
                        List<Game> games = service.viewAll();
                        games.forEach(System.out::println);
                    } else {
                        System.out.println("Please Login First!");
                    }
                    break;

                case 4:
                    if (isLoggedIn) {
                        System.out.print("Enter Author Name: ");
                        String author = sc.nextLine();
                        String result = service.authorSearch(author);
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Please Login First!");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting... Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
