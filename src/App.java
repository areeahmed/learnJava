import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner cin = new Scanner(System.in)) {
            int number = 12;
            int number2 = 14;
            boolean pizza = true;
            boolean humberger = false;
            boolean food = pizza;
            System.out.print("Hello my name is Ari Ahmed"); // output the string
            System.out.println("Hello my name is Ari Ahmed"); // output the string and going to next line
            System.out.println("My number is:" + number + " " + number2); // the INT is acting like STRING
            if (food == humberger) {
                System.out.println("The food is HUMBERGER");
            } else if (food == pizza) {
                System.out.println("The food is PIZZA");
            }

            System.out.print("Please, Enter your name: ");
            String name = cin.nextLine();
            System.out.print("Please, Enter your age: ");
            int age = cin.nextInt();
            /*
             * We added this line ( cin.nextLine() ) becasue the cin.nextInt used so the
             * next line will be ignored *
             * so for fixing this issus we
             * added the cin.nextLine() after the cin.nextInt *
             */
            cin.nextLine();
            System.out.print("Please, Enter your Email: ");
            String email = cin.nextLine();
            System.out.print("Please, Enter your password: ");
            String password = cin.nextLine();
            System.out.println(
                    "your name is {" + name + "} and, You are {" + age + "} years old " + "your email address is {"
                            + email
                            + "} and, Your password is: {" + password + "}");
        }

    }
}
