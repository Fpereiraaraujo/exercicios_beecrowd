import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      
      double A = scanner.nextDouble();
      double B = scanner.nextDouble();

      double MEDIA = (A * 3.5 + B * 7.5) / (3.5 + 7.5);

      
      System.out.printf("MEDIA = %.5f\n", MEDIA);

      scanner.close();
    }
}
