import java.util.Scanner;

public class Main {
//Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
 // "Asal" sayı olup olmadığını bulan programı yazın.
    // asal sayı = kendisine ve 1 e bölünen sayılardır.
    static int asalKontrol(int x, int y ){
        if(y == 1){
            return 1;
        } else if (x % y == 0) {
            return 2;
        }else {
            return asalKontrol(x,y-1); // f(x) = 2x +1 / f(5) = f(4) + 2, f(4) = f(3) +2, f(3) = 7 // f(2) =5
        }                                                 // f(5) = 2 + 2 + 2 + f(2)
    }
    public static void main(String[] args) {

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Sayi Giriniz");
            int sayi = input.nextInt();

            int asalKontrol = asalKontrol(sayi,sayi-1);
            if (asalKontrol == 1){
                System.out.println(sayi+" Sayisi Asaldır");
            }else {
                System.out.println(sayi+" Sayisi Asal Değildir");
            }
        }
    }
}
