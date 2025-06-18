/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Show available enum options
        System.out.println("Available operations:");
        for (Operation op : Operation.values()) {
            System.out.println("- " + op);
        }

        System.out.print("Enter operation (e.g., PLUS, MINUS, TIMES, DIVIDE): ");
        String inputOp = sc.next().toUpperCase();

        try {
            Operation selectedOp = Operation.valueOf(inputOp);
            ArithmeticBase base = new ArithmeticBase();
            double result = base.calculate(a, b, selectedOp);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation. Please try again.");
        }
    
    }
}

