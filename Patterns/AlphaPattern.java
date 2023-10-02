package Patterns;
import java.util.Scanner;
public class AlphaPattern {
    public static void printPattern(int size){
        for (char i = 1; i<=size; i++){
            for(char j = 1; j<=i; j++){
                System.out.print((char) ('A'+ (i-1)));
            }
            System.out.println();
        }
    }
    public static void main (String []args) {
        System.out.print("Enter the Size of the Pattern:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        printPattern(size);
    }
}
