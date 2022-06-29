import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Üzerinden mi İşlem Yapıcaksınız?\n Yes(1)\n No(2) ");
        select = input.nextInt();

        if(select == 1) {

            System.out.println("İşlem Yapmak İstediğiniz Sayıyı Giriniz : ");
            n1 = input.nextInt();

            System.out.println("1-KareKök Al\n2-Kare Al\n3-Küp Al");
            System.out.println("Seçiminiz? : ");
            select = input.nextInt();

            if(select == 1){
                System.out.println("Sayınızın karekök değeri : " + Math.sqrt(n1));
            } else if(select == 2){
                System.out.println("Sayınızın karesi : " + Math.pow(n1,2));

            } else if(select == 3){
                System.out.println("Sayınızın karekök değeri : " + Math.pow(n1,3));
            }else{
                System.out.println(" Hatalı Seçim Yaptınız");

            }

        }
        else if(select == 2) {

            System.out.println("İlk Sayıyı Giriniz : ");
            n1 = input.nextInt();
            System.out.println("İkinci Sayıyı Giriniz : ");
            n2 = input.nextInt();

            System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-iki Sayinin Kalanını Bul");
            System.out.println("Seçiminiz? : ");
            select = input.nextInt();

            if (select == 1) {
                System.out.println("Sonuç : " + (n1 + n2));
            } else if (select == 2) {
                System.out.println("Sonuç : " + (n1 - n2));
            } else if (select == 3) {
                System.out.println("Sonuç : " + (n1 * n2));
            } else if (select == 4) {
                if (n2 != 0) {
                    System.out.println("Sonuç : " + (n1 / n2));
                }
                else {
                    System.out.println("Bir Sayı 0 a bölünemez");
                }
            } else if (select == 5) {
                System.out.println("Sonuç : " + (n1 % n2));
            } else {
                System.out.println("Hatalı Seçim Yaptınız. Tekrar Deneyiniz");
            }


        }
        else{
            System.out.println("Hatalı Seçim Yaptınız, lütfen Tekrar Deneyiniz.");

        }
    }
}
