import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double n1,n2;

        int select;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Üzerinden mi İşlem Yapıcaksınız?\n Yes(1)\n No(2) ");
        select = input.nextInt();

        switch (select){

            case 1:
                System.out.println("İşlem Yapmak İstediğiniz Sayıyı Giriniz : ");
                n1 = input.nextInt();

                System.out.println("1-KareKök Al\n2-Kare Al\n3-Küp Al");
                System.out.println("Seçiminiz? : ");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.println("Sayınızın karekök değeri : " + Math.sqrt(n1));
                        break;
                    case 2:
                        System.out.println("Sayınızın karesi : " + Math.pow(n1, 2));
                        break;
                    case 3:
                        System.out.println("Sayınızın karekök değeri : " + Math.pow(n1, 3));
                        break;
                    default:
                        System.out.println(" Hatalı Seçim Yaptınız");
                        break;
                }
                break;


            case 2:

                System.out.println("İlk Sayıyı Giriniz : ");
                n1 = input.nextInt();
                System.out.println("İkinci Sayıyı Giriniz : ");
                n2 = input.nextInt();



                System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Kalan");
                System.out.println("Seçiminiz? : ");
                select = input.nextInt();

                switch (select) {
                    case 1://toplama
                        System.out.println("Sonuç : " + (n1 + n2));
                        break;
                    case 2: //çıkarma
                        System.out.println("Sonuç : " + (n1 - n2));
                        break;
                    case 3: //çarpma
                        System.out.println("Sonuç : " + (n1 * n2));
                        break;
                    case 4: //bölme işlemi

                        int karar = (n2 == 0)? 1 : 2;
                        switch (karar) {
                            case 1:
                                System.out.println("Bir Sayı 0 a bölünemez");
                                break;

                            case 2:
                                System.out.println("Sonuç : " + (n1 / n2));
                                break;
                        }
                        break;
                    case 5: // kalan
                        System.out.println("Sonuç : " + (n1 % n2));
                            break;


                    default:
                        System.out.println("Hatalı Seçim Yaptınız. Tekrar Deneyiniz");
                        break;
                }
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız, lütfen Tekrar Deneyiniz.");

        }
    }

}
