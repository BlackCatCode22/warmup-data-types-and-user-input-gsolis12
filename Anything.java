import java.util.Scanner;

public class Anything {
    public static void main(String[] args){

        System.out.println("\n\n Welcome to finding te largest number program!\n\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("\nyou entered: " + num1);

        System.out.println("\nEnter the second number:\n");
        int num2 = scanner.nextInt();
        System.out.println("\nyou entered: " + num2);

        System.out.println("\nEnter the third number:\n");
        int num3 = scanner.nextInt();
        System.out.println("\nyou entered: " + num3);

        System.out.println("\n The numbers are: " + num1 + " and " + num2 + " and " + num3);


        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("\n\nThe largest number is:" + largest);

        scanner.close();




    }
}
