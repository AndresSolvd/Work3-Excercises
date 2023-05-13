import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {

    //1 Java program to check whether the given number is even or odd
    public static String checkEvenOrOdd(long number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //2 Java program to convert the temperature in Celsius to Fahrenheit
    public static double calculateFahrenheitFromCelsius(double celsius) {
        return celsius * 1.8 + 32;
    }

    //3 Java program to find the area of a triangle whose three sides are given
    public static double calculateAreaTriangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    //4 Java program to find out the average of a set of integers
    public static double average(int[] set) {
        int suma = 0;
        for (int integer : set) {
            suma = suma + integer;
        }
        return (double) suma / set.length;
    }

    //5 Java program to find the product of a set of real numbers
    public static double calculateRealNumberProduct(double[] realNumbers) {

        double total = 1;

        for (double number : realNumbers) {
            total = total * number;
        }
        return total;
    }

    //6 Java program to find the circumference and area of a circle with a given radius
    public static Map<String, Double> getCircumferenceArea(double radius) {
        double area = Math.pow(radius, 2) * Math.PI;
        double circumference = radius * 2 * Math.PI;
        Map<String, Double> result = new HashMap<>();
        result.put("Circumference", circumference);
        result.put("Area", area);
        return result;
    }

    //7 Java program to check whether the given integer is a multiple of 5
    public static String isMultipleOfFive(int number) {
        if (number % 5 == 0) {
            return "Yes it is multiple of 5";
        } else {
            return "No it is not a multiple of 5";
        }
    }

    //8 Java program to check whether the given integer is a multiple of both 5 and 7
    public static String isMultipleOfFiveAndSeven(int number) {
        if (number % 35 == 0) {
            return "Yes it is a multiple of 5 and 7";
        } else {
            return "No it is not a multiple of 5 and 7";
        }
    }

    //9 Java program to find the average of 5 numbers using a while loop
    public static double averageFiveNumbers(double[] numbers) {
        int i = 0;
        double sum = 0;
        while (i != numbers.length) {
            sum = sum + numbers[i];
            i++;
        }
        return sum / numbers.length;
    }

    //10 Java program to display the given integer in the reverse order
    public static int reverseInteger(int number) {
        /*for (int i = number.length() - 1; i >= 0; i--) {
            System.out.print(number.charAt(i));
        }*/
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return number;
    }

    //11 Java program to find the geometric mean of n numbers
    public static double getArithmeticMean(double[] numbers) {
        double product = 1;
        for (double number : numbers) {
            product = product * number;
        }
        return Math.pow(product, 1.0 / numbers.length);
    }

    //10 Java program to find the sum of the digits of an integer using a while loop
    public static int digitsSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    //11 Java program to display all the multiples of 3 within the range 10 to 50
    public static void printMultiplesOf3from10to50() {
        for (int i = 10; i < 51; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //12 Java program to display all integers within the range 100-150 whose sum of digits is an even number
    public static void printSumDigitIntegerEvenFrom100To500() {
        System.out.println();
        int sum;
        int j;
        for (int i = 100; i < 501; i++) {
            j = i;
            sum = 0;
            while (j > 0) {
                sum = sum + (j % 10);
                j = j / 10;
            }
            if (sum % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //13 Java program to check whether the given integer is a prime number or not
    public static void isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("\nthis number is NOT a prime number");
                return;
            }
        }
        System.out.println("\nthis is a prime number");
    }

    //14 Java program to generate the prime numbers from 1 to N
    public static List<Integer> getPrimesFrom1ToN(int n) {

        List<Integer> primes = new ArrayList<>();
        primes.add(2);

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j + 1 == i) {
                    primes.add(i);
                }
            }

        }
        return primes;
    }

    //15 Java program to find the roots of a quadratic equation
    public static double[] getRootsOfQuadraticEquation(double a, double b, double c) {

        double[] answer = new double[2];
        double calculate = 0;

        try {
            //x = (-b ± √(b^2 - 4ac)) / 2a

            calculate = (Math.pow(b, 2) - 4 * a * c) / (2 * a);

            if (calculate < 0) {
                throw new Exception();
            }


        } catch (Exception e) {
            System.out.println("The roots are imaginary numbers");
        }

        answer[0] = -b + sqrt(calculate);
        answer[1] = -b - sqrt(calculate);
        return answer;
    }

    //16 Java program to print the numbers from a given number n till 0 using recursion
    public static void getNumbersWithRecursion(int number) {
        if (number != 0) {
            System.out.print(number);
            number = number - 1;
            getNumbersWithRecursion(number);
        } else {
            System.out.println();
        }
    }

    //17 Java program to find the factorial of a number using recursion
    public static BigInteger getFactorial(long number, BigInteger counter) {
        if (number != 1) {
            counter = counter.multiply(BigInteger.valueOf(number));
            number = number - 1;
            return getFactorial(number, counter);
        }
        return counter;
    }


    public static void main(String[] args) throws Exception {

        System.out.println("The number is: " + checkEvenOrOdd(214748364899L));
        System.out.println(calculateFahrenheitFromCelsius(30) + " Fahrenheit");
        System.out.println("The area is: " + calculateAreaTriangle(4, 3, 4));
        System.out.println("The average is: " + average(new int[]{2, 3, 4, 5, 1, 3, 10}));
        System.out.println("The product of this set of Real Numbers is: " +
                calculateRealNumberProduct(new double[]{Math.PI, 23, 44, Math.E, 34.23}));
        Map<String, Double> results = getCircumferenceArea(5);
        System.out.println("The circumference is: " + results.get("Circumference")
                + ". The area is: " + results.get("Area"));
        System.out.println(isMultipleOfFive(1235));
        System.out.println(isMultipleOfFiveAndSeven(35));
        System.out.println(averageFiveNumbers(new double[]{1, 2, 3, 4, 5}));
        System.out.println("The reverse is: " + reverseInteger(987654321));
        System.out.println("The arithmetic mean is: " + getArithmeticMean(new double[]{2, 8}));
        System.out.println("The sum of the digits of the integer is: " + digitsSum(558));
        printMultiplesOf3from10to50();
        printSumDigitIntegerEvenFrom100To500();
        isPrime(101);
        System.out.println(getPrimesFrom1ToN(101).toString());
        System.out.println("the roots are: " + Arrays.toString(getRootsOfQuadraticEquation(10, 20, 15)));
        getNumbersWithRecursion(10);
        System.out.println(getFactorial(140, BigInteger.valueOf(1)));
    }
}


/*•

•
•
•
•
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
