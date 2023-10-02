package Patterns;
import java.util.Scanner;
public class CharacterPattern {
    public static void printPattern(int size){
        for (int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char) (('A'+i) + j));
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        System.out.print("Enter Size of the Pattern:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        printPattern(size);
    }
}
