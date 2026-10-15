import java.util.Scanner;

public class Hello {
   public static void main(String[] args) {
       // output
       System.out.println("Hello World");
       System.out.println("Welcome to COP2800!");

       // input
       Scanner scnr  = new Scanner(System.in);
       System.out.print("Input the current temperature: "); // prompt
       int temperature = scnr.nextInt();
       System.out.println("Current temp is " + temperature);
   }
}
