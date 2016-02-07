/*
 * Lesson 34 Coding Activity 1
 *
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes an array of ints as a parameter and
 * returns the sum of integers in the array.
 *
 *     public static int sum(int [] a)
 *
 * For example, sum(a); would return 6 if a = {1, 2, 3} or 3 if a = {1, 1, 1}.
 */


import java.util.Scanner;

class one {
    public static int sum(int[] list) {
        int sum = 0;
        for (int value:list)
            sum += value;

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an list of integers. Separate with a space: ");
        String data = input.nextLine();

        // Put what we currently have into an array
        String[] _list = data.split(" ");
        int[] list = new int[_list.length];

        // Convert this to an integer array
        for (int x=0;x<list.length;x++) {
            list[x] = Integer.parseInt(_list[x]);
        }

        System.out.println(sum(list));
    }
}