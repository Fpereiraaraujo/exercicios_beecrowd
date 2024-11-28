// Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X.
//  Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.


import java.util.Scanner;

import java.io.IOException;
 
public class Ex1001 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int X = A + B;
        
          System.out.println("X = " + X);
        
        scanner.close();
        
    }
 
}