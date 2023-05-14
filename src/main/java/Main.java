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

    //18 Java program to display the sum of n numbers using an array
    public static void arraySum(float[] numbers) {
        float sum = 0;

        for (float number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

    //19 Java program to implement linear search
    public static String linearSearch(String search, String[] things) {
        for (String item : things) {
            if (search.equals(item)) {
                return "Found ";
            }
        }
        return "Not found";
    }


    //20 Java program to find the number of odd numbers in an array
    public static int countOddsInArray(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    //21 Java program to find the largest number in an array without using built-in functions
    public static float largestNumberInArray(int[] numbers) {
        int current = 0;
        for (int number : numbers) {
            if (number > current) {
                current = number;
            }
        }
        return current;
    }

    //22 Java program to insert a number to any position in an array
    public static int[] insertNumberInArrayPosition(int number, int position, int[] arraylist) {
        for (int i = 0; i < arraylist.length; i++) {
            if (i == position) {
                arraylist[i] = number;
                break;
            }
        }
        return arraylist;
    }

    public static void insertNumberInArrayListPosition(int number, int position, ArrayList<Integer> arraylist) {
        arraylist.add(position, number);
        System.out.println(number + " Was added in the index " + arraylist.indexOf(number));
    }

    //23 Java program to delete an element from an array by index
    public static int[] deleteElementInArrayByIndex(int index, int[] array) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    //24 Java program to check whether a string is a palindrome or not
    public static Boolean checkPalindrome(String input) {
        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    //25 Java program to implement matrix addition
    public static int[] getMatrixAddition(int[] a, int[] b) {

        if (a.length != b.length) {
            System.out.println("matrix has not the same length");
            return null;
        }
        int[] additionMatrix = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            additionMatrix[i] = a[i] + b[i];
        }
        return additionMatrix;
    }

    //26 Java program to implement matrix multiplication
    public static int[] getMatrixMultiplication(int[] a, int[] b) {

        if (a.length != b.length) {
            System.out.println("matrix has not the same length");
            return null;
        }
        int[] productMatrix = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            productMatrix[i] = a[i] * b[i];
        }
        return productMatrix;
    }

    //27 Java program to check leap year
    public static boolean checkLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 | year % 400 == 0;
    }

    //28 Java program to find the Nth term in a Fibonacci series using recursion
    public static int getNthTermOnFibonacci(int nth, int current, int previous) {
        //F(n) = F(n-1) + F(n-2)
        nth = nth - 1;
        if (nth == 0) {
            return current;
        }

        int newest = current + previous;
        previous = current;
        current = newest;
        return getNthTermOnFibonacci(nth, current, previous);
    }

    public static int getNthTermOnFibonacci(int nth) {
        return getNthTermOnFibonacci(nth, 1, 0);
    }

    //29 Java program to print Fibonacci series using iteration
    public static int getFibonacciByIteration(int index) {
        //F(n) = F(n-1) + F(n-2)
        int current = 0;
        int previous = 1;
        int newest = 0;

        for (int i = index; i > 0; i--) {
            newest = current + previous;
            previous = current;
            current = newest;
        }
        return newest;
    }

    //30 Java program to implement a calculator to do basic operations
    public static double calculator(double a, char operation, double b) {

        double result = 0;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("invalid operation accepted values are: + - * /");
        }
        return result;
    }

    //31 Java Program to Find Your Weight on Mars
    public static double weightMars(double weight) {
        return weight * 3.71 / 9.81;
    }

    //32 Java Program to Check Whether the Generated Random Number Is Even or Odd
    public static String checkOddOrEven(int randomNumber) {
        if (randomNumber % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //33 Java Program to Find the Number of Containers You Need


    //34 Java Program to Calculate Taxes
    public static double checkTaxesToPay(double amount) {
        return amount * 0.12;
    }

    //35 Calculate BMI Using Java
    public static double getBMI(double height, double weight) {
        return weight / Math.pow(height, 2);
    }

    //36 Java Program to Find the Sum of Even Numbers in a range
    public static int sumOnlyEvens(int[] numbers) {

        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum = sum + number;
            }
        }
        return sum;
    }

    //37 Java Program to Find the Largest and Smallest Numbers From Random Numbers
    public static int[] findLargestAndSmallestOfACreatedListOfRandomNumbers(int listLength) {

        int[] list = new int[listLength];
        int[] result = new int[2];
        int smallest;
        int largest;

        for (int i = 0; i < listLength; i++) {
            list[i] = (int) (Math.random() * 10);
            if (i != 0 && list[i] < list[i - 1]) {
                result[0] = list[i]; //smallest
            } else {
                result[1] = list[i]; //largest
            }
        }
        System.out.println("Smallest Number is: " + result[0] + " | Largest Number is: " + result[1]);
        return result;
    }

    //38 Java Program to Calculate the Area of a Rectangle
    public static double areaRectangle(double a, double b) {
        return a * b;
    }

    // 39 Filling an Array Using For Loops in Java (enter type (1 dimension array or 2D array) and size from the keyboard too)
    public static void createAndFillArrays() {

        int xSize;
        int ySize;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimension (1 or 2)");
        int dimension = scanner.nextInt();


        switch (dimension) {
            case 1:
                System.out.println("Enter Length");
                xSize = scanner.nextInt();
                System.out.println(Arrays.toString(createAndFillArrays(xSize)));
                break;

            case 2:
                System.out.println("Enter Length(x)");
                xSize = scanner.nextInt();
                System.out.println("Enter Height(y)");
                ySize = scanner.nextInt();
                System.out.println(Arrays.deepToString(createAndFillArrays(xSize, ySize)));
                break;

            default:
                System.out.println("Input 1 for 1D or 2 for 2D");
        }
    }
    //1D Array
    public static int[] createAndFillArrays(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }
    //2D Array
    public static int[][] createAndFillArrays(int xSize, int ySize) {
        int[][] arr = new int[xSize][ySize];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }

    //40 Java Program to Find the Largest and Smallest Numbers From an Array of Random Numbers
    public static int[] findLargestAndSmallestFromArray(int length){
       return findLargestAndSmallestOfACreatedListOfRandomNumbers(length);
    }

    public static void main(String[] args) {

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
        System.out.println(getPrimesFrom1ToN(101));
        System.out.println("the roots are: " + Arrays.toString(getRootsOfQuadraticEquation(10, 20, 15)));
        getNumbersWithRecursion(10);
        System.out.println(getFactorial(140, BigInteger.valueOf(1)));
        arraySum(new float[]{1, 2, 3, 4, 5, 6});
        System.out.println(linearSearch("cuatro", new String[]{"uno", "dos", "tres", "cuatro", "cinco"}));
        System.out.println("There are " + countOddsInArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}) + " odd number(s) in the array");
        System.out.println("The largest number in the array is: " + largestNumberInArray(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(Arrays.toString(insertNumberInArrayPosition(2, 0, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        insertNumberInArrayListPosition(2, 0, new ArrayList<>());
        System.out.println(Arrays.toString(deleteElementInArrayByIndex(2, new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println("It is " + checkPalindrome("racecar") + " that is a palindrome");
        System.out.println("Addition matrix result: " + Arrays.toString(getMatrixAddition(new int[]{1, 2, 3, 4, 5}, new int[]{9, 8, 7, 6, 5})));
        System.out.println("Addition matrix result: " + Arrays.toString(getMatrixMultiplication(new int[]{1, 2, 3, 4, 5}, new int[]{9, 8, 7, 6, 5})));
        System.out.println("It is " + checkLeapYear(1900) + " that is a leap year");
        System.out.println("The fibonacci by recursive method is: " + getNthTermOnFibonacci(20));
        System.out.println("The fibonacci by iteration method is: " + getFibonacciByIteration(20));
        System.out.println("Calculator answer: " + calculator(1, '/', 2));
        System.out.println("My weight in mars is: " + weightMars(190));
        System.out.println("Random number is: " + checkOddOrEven((int) (Math.random() * 10)));
        System.out.println("You need to pay " + checkTaxesToPay(100) + " in taxes");
        System.out.println("BMI is: " + getBMI(1.87, 86));
        System.out.println("The sum of only the even numbers in the range is: " + sumOnlyEvens(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        findLargestAndSmallestOfACreatedListOfRandomNumbers(6);
        System.out.println("Rectangle area: " + areaRectangle(5, 10));
        createAndFillArrays();
        System.out.println("The answer is: " + Arrays.toString(findLargestAndSmallestFromArray(7)));


    }
}


/*•

•
•
•
• https://code-exercises.com/programming/medium/
*/
