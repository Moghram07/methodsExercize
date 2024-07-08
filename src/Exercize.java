import java.util.Scanner;
public class Exercize {
    //Q1. Write a java method to find the smallest number among three numbers.
    public static int smallest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q.1 Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Q.1 Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Q.1 Enter third number: ");
        int num3 = scanner.nextInt();
        int smallest = 0;
        if(num1<num2 && num1<num3){
            smallest = num1;
        }else if(num2<num1 && num2<num3){
            smallest = num2;
        }else{
            smallest = num3;
        }
        System.out.println("the smallest number is : "+ smallest);
        return smallest;
    }
    //Q2. write a java method that check if the entered number is negative or positive or zero
    public static void checkValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q.2 Enter a number to check it's value: ");
        int num = scanner.nextInt();
        if (num <= 0){
            System.out.println(num == 0? "number is zero!":"number is negative");
        }else{
            System.out.println("number is positive ");
        }
    }
    //Q3. Write a java method to check if a string is valid password
    public static boolean passWord() {
        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        int x = 0;
        while (x < 3) {
            System.out.println("Q.3 Please Enter password: ");
            String password = scanner.nextLine();
            if (password.length() < 8) {
                System.out.println("Password must have 8 characters at least");
                System.out.println("Try again");
                valid = false;
            } else if (!password.matches("[a-zA-Z0-9]+")) {
                System.out.println("Password must not have any symbols only letters and numbers");
                System.out.println("Try again");
                valid = false;
            } else if (password.replaceAll("[^0-9]", "").length() < 2) {
                System.out.println("Password must have at least two digits");
                System.out.println("Try again");
                valid = false;
            } else {
                valid = true;
                System.out.println("valid password " + valid);
                break;
            }
            x++;
        }
        return valid;
    }
}

