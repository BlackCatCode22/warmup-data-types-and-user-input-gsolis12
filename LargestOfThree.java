import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){

        //Greet the user to the program.
        System.out.println("\n\n Welcome to finding the largest number program!\n\n");

        //Create the scanner object.
        Scanner scanner = new Scanner(System.in);


        //Prompt user to input first integer
        System.out.println("\nPlease enter the first number:");

        //Get user first integer.
        int num1 = scanner.nextInt();

        //Show user the first integer they entered.
        System.out.println("\nThe number you entered is: " + num1);


        //Prompt user to input second integer.
        System.out.println("\nEnter the second number:\n");

        //Get user second integer.
        int num2 = scanner.nextInt();

        //Show user the second integer they entered.
        System.out.println("\nyou entered: " + num2);


        //Prompt the user to enter the third integer.
        System.out.println("\nEnter the third number:\n");


        int num3 = scanner.nextInt();

        //Tell the user what integer tht they entered.
        System.out.println("\nyou entered: " + num3);


        //Tell the user all three integers that they have entered.
        System.out.println("\n The numbers you have entered are: " + num1 + " and " + num2 + " and " + num3);


        // Statement to find the largest number.
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        //Tell the user what the largest number out of the three were.
        System.out.println("\n\nThe largest number is: " + largest);

        //CLose the scanner.
        scanner.close();




    }
}
