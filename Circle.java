import java.io.*;
import java.util.Scanner;
class Circle{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        float r = scanner.nextFloat();
        System.out.println("The area is "+r*r*3.14+" square unit and the perimeter is "+2*3.14*r+" unit of "+r+" unit radius circle");
        scanner.close();
    }
}