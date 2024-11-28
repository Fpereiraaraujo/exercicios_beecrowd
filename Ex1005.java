// Read two integer values. After this, calculate the product between them and store the result in a variable named PROD. 
// Print the result like the example below.
//  Do not forget to print the end of line after the result, otherwise you will receive “Presentation Error”.

import java.io.IOException;
import java.util.Scanner;

public class Ex1005 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int PROD = A * B;

    System.out.println("PROD = " + PROD);

    scanner.close();

  }

}
