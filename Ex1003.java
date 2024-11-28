// Read two integer values, in this case, the variables A and B.
//  After this, calculate the sum between them and assign it to the variable SOMA.
//  Write the value of this variable.

import java.io.IOException;
import java.util.Scanner;

public class Ex1003 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int SOMA = A + B;

    System.out.println("SOMA = "+ SOMA);
    scanner.close();
 
    }

  }

