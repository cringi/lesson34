/*
 * Lesson 34 Coding Activity 6
 *
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes an array of ints and returns true if all
 * of the values in the array are positive. If the array contains any
 * negative integers, it should return false.
 *
 *     public static boolean allPositive(int [] a)
 *
 */


import java.util.Scanner;

class six {
    public static boolean allPositive(int[] list) {
        for (int value:list) {
            if(value < 0) {
                return false;
            }
        }
        return true;
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

        System.out.println("All numbers are positive: " + allPositive(list));
    }
}