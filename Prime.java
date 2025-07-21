import java.io.*;
import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float n = scanner.nextInt();
        int j=0;
        for(int i=2;i<=n/2;i++){
            if(n/i == 0){
                j=0;
                System.out.println("The number is not prime");
                break;
            }
            else
                j=1;
        }
        if(j==1)
            System.out.println("The number is not prime");
    }
}