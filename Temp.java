import java.io.*;
import java.util.Scanner;
class Temp{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in celsius: ");
        float n1 = scanner.nextInt();
        System.out.println("The temperature in fahrenheit is = "+(9 * n1 + 32));
    }
}