import java.io.*;
import java.util.Scanner;
class Hello{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello and welcome "+name+" in JAVA");
    }
}