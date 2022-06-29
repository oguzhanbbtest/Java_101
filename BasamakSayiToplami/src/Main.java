import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.println("Basamaklarini Toplamak İstediğiniz Sayiyi Giriniz");
        int number = girdi.nextInt();
        int tempNumber = number*10;
        int basamakToplamı = 0;

        while (tempNumber != 0){
            tempNumber /= 10;
            int basDeger = tempNumber % 10;
            basamakToplamı += basDeger;

        }
        System.out.println(basamakToplamı);
    }
}
