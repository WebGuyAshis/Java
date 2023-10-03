package Patterns;
import java.util.Scanner;
public class InvertedNumberPattern {

    public static void printPattern(int size){
        for(int i = size; i>0;i--){
            for(int j=1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        System.out.print("Enter size of the Pattern:");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        printPattern(size);
    }
}
