import java.util.Scanner;
public class Main {
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
// 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
    public static void main(String[] args){
        int a; int b = 0; int c = 0; // değişkenlerimizi tanımlıyoruz ve bazılarına başlangıç değeri veriyoruz.
        System.out.println("********************** 3 ve 4 Bolunen Sayilarin Ortalamasi Programi **********************");

        Scanner inp = new Scanner(System.in);
        System.out.println("0'dan kaca kadar olan sayilara baksin ?");
        a = inp.nextInt();

        for(int i=0; i<=a; i++){

            if (i%3==0&&i%4==0){
                b += i; // 3'e ve 4'e bölünen i sayılarını b'de topluyor.
                c++; // her döngü adımında c'ye 1 ekliyor bu şekilde saymış oluyor :)

            }
        }
        System.out.println("3'e ve 4'e Bölünen Sayıların Ortalamasi = " + (b/c));





    }
}
