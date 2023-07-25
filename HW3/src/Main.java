import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner data = new Scanner(System.in);


//        1.Write a program that prints the numbers from 1 to 100 such that:


        System.out.println("\n\n Q1 output: ");


        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            System.out.println(i);
        }








//      2.Write a Java program to reverse a string.


        System.out.println("\n\n Q2 output: ");


        System.out.println("please enter a string to reverse: ");
        String string = data.nextLine();
        String reverse_string = "";

        for (int i = 0; i < string.length(); i++) {
            reverse_string = string.charAt(i) + reverse_string;
        }

        System.out.println("the reversed string is:  " + reverse_string);








//        3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.


        System.out.println("\n\n Q3 output: ");


        System.out.println("Please enter a positive integers to print multiplication table: ");
        int positive_number = data.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            if (positive_number > 0) {
                System.out.println(positive_number + " X " + i + " = " + (positive_number * i));
            }else {
                System.out.println("oops it is negative integer...");
                break;
            }
        }








//        4.Write a program to find the factorial value of any number entered through the keyboard.


        System.out.println("\n\n Q4 output: ");


        System.out.println("Enter a number to calculate the factorial: ");
        int entered_number = data.nextInt();
        int factorial = 1;

        for (int i = 1; i <= entered_number; i++) {
            factorial *= i;
        }

        System.out.println("the factorial of " + entered_number + "!  = " + factorial);





//        5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)


        System.out.println("\n\n Q5 output: ");


        System.out.println("Please enter two numbers to calculate the power: ");

        int num1 = data.nextInt();
        int num2 = data.nextInt();
        int power_result = 1;

        for (int i = 1; i <= num2 ; i++) {
            power_result *= num1;
        }

        System.out.println("the result of " + num1 + "^" + num2 + " = " + power_result);






//        6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        System.out.println("\n\n Q6 output: ");


        System.out.println("how many number you want to enter to do the sum: ");
        int count = data.nextInt();

        System.out.println("Please enter " + count + " numbers to get the sum of even numbers and odd numbers separately: ");

        int number1;
        int even_sum = 0;
        int odd_sum = 0;

        for (int i = 1; i <= count ; i++) {
            number1 = data.nextInt();
            if (number1 % 2 == 0) {
                even_sum += number1;
            }else odd_sum += number1;
        }
        System.out.println("the sum of even numbers = " + even_sum + "\nthe sum of odd numbers = " + odd_sum);






//        7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.


        System.out.println("\n\n Q7 output: ");


        System.out.println("Enter a positive integer to determine whether a prime number: ");

        int positiveInteger = data.nextInt();
        data.nextLine();

        boolean isPrime = true;

        if (positiveInteger <= 1) {
            System.out.println(positiveInteger + " is not prime number!");
        }else {
            for (int i = 2 ; i <= positiveInteger / 2 ; i++) {
                if ( positiveInteger % i  == 0) {
                    System.out.println(positiveInteger + " is not prime number");
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(positiveInteger + " is prime number :)");
            }

        }






//        8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.


        System.out.println("\n\n Q8 output: ");


        System.out.println("Please enter numbers to count positive, negative, and zeros \nenter X to stop: ");

        int positive_counter = 0;
        int negative_counter = 0;
        int zeros_counter = 0;
        String num;


        do {
            num = data.nextLine();

            if (num.equalsIgnoreCase("x")) {
                break;
            }else if (Integer.parseInt(num) > 0) {
                positive_counter++;
            } else if (Integer.parseInt(num) < 0) {
                negative_counter++;
            }else {
                zeros_counter++;
            }

        } while (true);

        System.out.println("positive count: " + positive_counter + "\nnegative count: " + negative_counter + "\nzeros count: " + zeros_counter);





//        9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.

        System.out.println("\n\n Q9 output: ");


        for (int i = 1; i <= 4; i++) {
            System.out.println("\nWeek " + i);
            for (int j = 1; j <= 7 ; j++) {
                System.out.println("Day " + j);
            }
        }


        
        
//        10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.

        System.out.println("\n\n Q10 output: ");


        System.out.println("Please enter a string to check whether a palindrome: ");
        String user_string = data.nextLine().trim();
        String reversed_string = "";

        for (int i = 0; i < user_string.length() ; i++) {
            reversed_string = user_string.charAt(i) + reversed_string;
        }

        if (reversed_string.equalsIgnoreCase(user_string)) {
            System.out.println(user_string + " & " + reversed_string + " ,, it is a palindrome...");
        }else System.out.println(user_string + " & " + reversed_string + " ,, it is not a palindrome!");

    }
}