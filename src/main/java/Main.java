import static java.lang.Math.sqrt;

public class Main {

    // Java program to check whether the given number is even or odd
    public static String checkEvenOrOdd(long number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //Java program to convert the temperature in Celsius to Fahrenheit
    public static double calculateFahrenheitFromCelsius(double celsius) {
        return celsius * 1.8 + 32;
    }

    //Java program to find the area of a triangle whose three sides are given
    public static double calculateAreaTriangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    //Java program to find out the average of a set of integers
    public static double average(int[] set) {
        int suma = 0;
        for (int integer : set) {
            suma = suma + integer;
        }
        return (double) suma / set.length;
    }

    //Java program to find the product of a set of real numbers
    public static double calculateRealNumberProduct(double[] realNumbers) {

        double total = 1;

        for (double number : realNumbers) {
            total = total * number;
        }
        return total;
    }


    public static void main(String[] args) {

        System.out.println("The number is: " + checkEvenOrOdd(214748364899L));
        System.out.println(calculateFahrenheitFromCelsius(30) + " Fahrenheit");
        System.out.println("The area is: " + calculateAreaTriangle(4, 3, 4));
        System.out.println("The average is: " + average(new int[]{2, 3, 4, 5, 1, 3, 10}));
        System.out.println("the product of this set of Real Numbers is: " + calculateRealNumberProduct(new double[]{Math.PI, 23, 44, Math.E, 34.23}));

    }
}


/*•
•
•
•
•
• Java program to find the circumference and area of a circle with a given radius
• Java program to check whether the given integer is a multiple of 5
• Java program to check whether the given integer is a multiple of both 5 and 7
• Java program to find the average of 5 numbers using a while loop
• Java program to display the given integer in the reverse order
• Java program to find the geometric mean of n numbers
• Java program to find the sum of the digits of an integer using a while loop
• Java program to display all the multiples of 3 within the range 10 to 50
• Java program to display all integers within the range 100-150 whose sum of digits is an even number
• Java program to check whether the given integer is a prime number or not
• Java program to generate the prime numbers from 1 to N
• Java program to find the roots of a quadratic equation
• Java program to print the numbers from a given number n till 0 using recursion
• Java program to find the factorial of a number using recursion
• Java program to display the sum of n numbers using an array
• Java program to implement linear search
• Java program to implement binary search
• Java program to find the number of odd numbers in an array
• Java program to find the largest number in an array without using built-in functions
• Java program to insert a number to any position in an array
• Java program to delete an element from an array by index
• Java program to check whether a string is a palindrome or not
• Java program to implement matrix addition
• Java program to implement matrix multiplication
• Java program to check leap year
• Java program to find the Nth term in a Fibonacci series using recursion
• Java program to print Fibonacci series using iteration
• Java program to implement a calculator to do basic operations
• Java Program to Find Your Weight on Mars
• Java Program to Check Whether the Generated Random Number Is Even or Odd
• Java Program to Find the Number of Containers You Need
• Java Program to Calculate Taxes
• Calculate BMI Using Java
• Java Program to Find the Sum of Even Numbers in a range
• Java Program to Find the Largest and Smallest Numbers From Random Numbers
• Java Program to Calculate the Area of a Rectangle
• Filling an Array Using For Loops in Java (enter type (1 dimension array or 2D array) and size from the keyboard too)
• Java Program to Find the Largest and Smallest Numbers From an Array of Random Numbers
• https://code-exercises.com/programming/medium/
*/
