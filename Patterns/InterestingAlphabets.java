package Patterns;
import java.util.Scanner;
public class InterestingAlphabets {
    public static void printPattern(int size){
        for(int i=(size-1); i>=0; i--){
            for(int j=i; j<size; j++){
                System.out.print((char) ('A'+ j));
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        System.out.print("Enter the Size of the Pattern:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        printPattern(size);
    }
}
