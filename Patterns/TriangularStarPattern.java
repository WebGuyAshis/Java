package Patterns;
import java.util.Scanner;
public class TriangularStarPattern {

    public static void printPattern(int size){
        for(int i=1; i<=size; i++){
            for(int j=1; j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        printPattern(size);
    }
}
