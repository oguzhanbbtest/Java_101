import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int adet,i,MaxDeger = 0,MinDeger = 0;
        // N tane sayı girilecek bu N tane sayıdan max min değerler alınıcak
        Scanner input = new Scanner(System.in);
        System.out.println("Kac adet sayi giriceksiniz");
        adet = input.nextInt();

        for (i = 1; i <= adet; i++){
            System.out.println(i + ". Sayiyi Giriniz");
            int sayi = input.nextInt();
            if(i == 1){
                MaxDeger = sayi;
                MinDeger = sayi;
            } else if (sayi>MaxDeger) {
                MaxDeger = sayi;


            } else if (sayi<MinDeger) {
                MinDeger = sayi;
            }


        }System.out.println("Giriğiniz Sayıların En Büyüğü : " + MaxDeger);
        System.out.println("Giriğiniz Sayıların En Büyüğü : " + MinDeger);

    }
}
