package practice3;
import java.util.Scanner;

public class SumValueArray {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = scan.nextInt();

        int[]array = new int[n];
        //loading
        for(int i= 0; i<n ; i++){
            System.out.println("Enter value for the element on "+i+". position");
            int value= scan.nextInt();
            array[i]=value;
        }
        //sum
        int sum=0;
        for(int i=0; i<array.length;i++){
            sum += array[i];

        }
        System.out.println(sum);
    }
}
