
       import java.util.Scanner;  // this lets us take input from the keyboard

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);  // create a Scanner object

                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double sum = num1 + num2;

                System.out.println("The sum is: " + sum);

                scanner.close();  // close the scanner
            }
        }
