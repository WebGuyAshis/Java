package Patterns;
import java.util.Scanner;
public class ReverseNumberPattern {
    public static void printPattern(int size){
        for(int i=1; i<=size; i++){
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        System.out.print("Enter Size of Pattern:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        printPattern(size);
    }
}
