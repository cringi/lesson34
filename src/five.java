/*
 * Lesson 34 Coding Activity 5
 *
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes an array of ints
 * and returns a sum of only the even values.
 *
 *     public static int sumEven(int [] a)
 *
 * For example, sumEven(a) would return 6 if a = {1, 2, 3, 4, 5}.
 */


import java.util.Scanner;

class five {
    public static int sumEven(int[] list) {
        int sum = 0;
        for(int value:list) {
            // I'm going off the assumption only even numbers are divisible by two
            if (value%2 == 0)
                sum += value;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an list of number, separate with a space: ");
        String data = input.nextLine();

        // Put what we currently have into an array
        String[] _list = data.split(" ");
        int[] list = new int[_list.length];

        // Convert this to an integer array
        for (int x = 0; x < list.length; x++) {
            list[x] = Integer.parseInt(_list[x]);
        }

        System.out.println("Sum of even numbers: " + sumEven(list));
    }
}