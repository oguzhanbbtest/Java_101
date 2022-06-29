import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Olusturmak Istediginiz Ucgenin Basamagini Giriniz : ");
         int basamak= scan.nextInt();

         for (int x = basamak; x >= 1; x--) {
            for (int i = 0; i <= (basamak - x); i++) {
                    System.out.print(" ");
            }
            for (int k = 1; k <= 2 * x - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
         }

      }
}
