package Patterns;
import java.util.*;
public class MirrorImageNumberPattern {
    public static void printPattern(int size){
        for(int i=1; i<=size;i++){
            for(int j=i; j<size; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static  void main (String []args){
        System.out.print("Enter the Size of The Pattern:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        printPattern(size);

    }
}
