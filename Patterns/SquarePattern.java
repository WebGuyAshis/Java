package Patterns;
//import java.util.*;
import java.util.Scanner;

public class SquarePattern {

    public static void printSqPattern(int size){
        for(int i=1;i<=size;i++){
            for(int j = 1; j<=size; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of The Pattern:");
        int size = sc.nextInt();
        printSqPattern(size);
    }
}
