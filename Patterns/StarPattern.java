package Patterns;
import java.util.Scanner;
public class StarPattern {
    public static void printPattern(int size){
        for(int i=0; i<size; i++){
//            For Empty Spaces
            for(int j=i; j<(size-1);j++){
                System.out.print(" ");
            }
//            For Left Side Stars
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
//            For Right Side Stars
            for(int l=0;l<i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of the Pattern:");
        int size = sc.nextInt();

        printPattern(size);
    }
}
