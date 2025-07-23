import java.io.*;
import java.util.Scanner;
class Add{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = scanner.nextInt();
        System.out.println("The sum is "+(n1+n2));
        scanner.close();
    }
}