package Patterns;
import java.util.Scanner;
public class TriangleOfNumbers {

    public static void printPatterns(int size){
        for(int i =1; i<=size; i++){
//            For Empty Spaces
            for(int j=(size-i); j>0; j--){
                System.out.print(" ");
            }
//            For Left Side
//            int p=0;
            for(int k=0; k<i; k++){
                System.out.print(i+k);
//                p=k-1;
            }
//            For Right Side
            for(int l=1,p=(2*i-2);l<i;l++,p--){
                System.out.print(p);
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Pattern:");
        int size = sc.nextInt();

        printPatterns(size);
    }
}
