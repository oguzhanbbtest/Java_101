import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a2 + b2 = c2
        // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Scanner kenar = new Scanner(System.in);
        System.out.print("İlk Kenar");
        int a = kenar.nextInt();
        System.out.print("ikinci kenar");
        int b = kenar.nextInt();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenus  : "+ c);


    }
}
