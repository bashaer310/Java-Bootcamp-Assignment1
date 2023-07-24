import java.util.Scanner;

// Bashaer Alhuthali
// Java Bootcamp
public class Main {
    public static void main(String[] args) {
        // Q1: Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers
        /*Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int firstNumber=input.nextInt();
        input.nextLine();

        System.out.println("please enter the second number");
        int secondNumber=input.nextInt();

        int sum = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("The result of sum is "+ sum + "\n The result of subtract is " + subtract + "\n The result of multiply is " + multiply + "\n The result of divide is " + divide +"\n The result of remainder is " + remainder);*/

        //Q2: Write a Java program to convert a given string into lowercase.

       /*Scanner input = new Scanner(System.in);
        System.out.println("please enter a text");

        String text = input.nextLine();
        String newText = text.toLowerCase();
        System.out.println("The result of text is " + newText);*/

        //Q3: Write a Java program that takes a string and a number from the user,then prints the character in the given index.

        /*Scanner input = new Scanner(System.in);
        System.out.println("please enter a text");
        String text1 = input.nextLine();
        System.out.println("please enter a number");
        int index = input.nextInt();
        System.out.println("The character is " + text1.charAt(index));*/



        //Q4: Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement)

        /*Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int Number=input.nextInt();

        if(Number % 2 == 0){
        //the number is even
            System.out.println(1);
        }
        else{
         //the number is odd
            System.out.println(0);

        }*/

        //Q5: Write a program that checks the role of the user

        /*Scanner input = new Scanner(System.in);
        System.out.println("please enter your role");
        String role=input.nextLine();

        if(role.equals("admin"))
        {
            System.out.println("welcome admin");

        } else if (role.equals("superuser")) {
            System.out.println("welcome superuser");

        }else if (role.equals("user")) {
            System.out.println("welcome user");
        }
        else {
            System.out.println("invalid input");
        }*/

        //Q6: 6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
        /*Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int firstNumber=input.nextInt();
        input.nextLine();
        System.out.println("please enter the second number");
        int secondNumber=input.nextInt();
        input.nextLine();
        System.out.println("please enter the third number");
        int thirdNumber=input.nextInt();

        int sum = firstNumber + secondNumber;

        if(sum == thirdNumber){
        // the sum of the first and second Number is equal the third Number
            System.out.println("The result is " + true);
        }*/

        //Q7: 7.Take three numbers from the user and print the greatest number.
        /*Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int firstNumber=input.nextInt();
        input.nextLine();
        System.out.println("please enter the second number");
        int secondNumber=input.nextInt();
        input.nextLine();
        System.out.println("please enter the third number");
        int thirdNumber=input.nextInt();

        int greatest=0;
        if(firstNumber > secondNumber && firstNumber >thirdNumber){
            greatest=firstNumber;
        }else if(secondNumber > thirdNumber){
            greatest=secondNumber;
        }else {
            greatest= thirdNumber;
        }
        if(greatest!=0)
        System.out.println("The greatest is "+greatest);*/

        //Q8:8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

        /*Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int day=input.nextInt();
        switch (day){
            case 1:
                System.out.println("the day name is Sunday");
                break;
            case 2:
                System.out.println("the day name is Monday");
                break;
            case 3:
                System.out.println("the day name is Tuesday");
                break;
            case 4:
                System.out.println("the day name is Wednesday");
                break;
            case 5:
                System.out.println("the day name is Thursday");
                break;
            case 6:
                System.out.println("the day name is Friday");
                break;
            case 7:
                System.out.println("the day name is Saturday");
                break;
            default:
                System.out.println("invalid input");
        }*/
    }
}