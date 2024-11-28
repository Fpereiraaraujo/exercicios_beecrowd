// Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X.
//  Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.


import java.util.Scanner;

import java.io.IOException;
 
public class Ex1002 {
 
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

        double pi = 3.14159; 
        double r = scanner.nextDouble(); 

        double A = pi * (r * r); 

        
        System.out.printf("A=%.4f\n", A);

        scanner.close();
 
    }
 
}