import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
   // toplamı kendisine eşit olan sayıya mükemmel sayı denir.
    Scanner girdi = new Scanner(System.in);
        int i,isMukemmel = 0;

        while (true){
            System.out.println("====================");
            System.out.println("  Bir Sayı Giriniz");
            System.out.println("====================");
            int sayi = girdi.nextInt();

            for( i = sayi; sayi >= 1 ; sayi--){
                if(0 < i || sayi%i==0 || i != sayi) {
                    isMukemmel += i;
                    if(isMukemmel == sayi){
                        System.out.println(sayi+" Mükemmel Bir Sayidir ");
                    }
                }else {
                    System.out.println("Mükemmel Sayi Değildir");
                }
            }
        }
    }
}
