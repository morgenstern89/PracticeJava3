package practice3;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = scan.nextInt();

        int[] array = new int[n];
        //loading
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for the element on " + i + ". position");
            int value = scan.nextInt();
            array[i] = value;
        }

        //min
        //int min = array[0]; is easier way than using Integer.MAX_Value;
        int min = Integer.MAX_VALUE;//finding minimum, using maximum value
        //skip the first 0 and start from 1 and check the rest
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min " +min);
    }
        /*
        //max
        int max = array[0];
        //skip the first 0 and start from 1 and check the rest
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max " +max);
        }
         */
    }

