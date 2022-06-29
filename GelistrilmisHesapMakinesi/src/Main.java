import java.util.Scanner;

public class Main {
    static int toplama(int a, int b){ //
        int result = a + b;
        System.out.println("Sonucunuz : " +result);
        return result;
    }
    static int cikartma(int a, int b){ //
        int result = a-b;
        System.out.println("Sonucunuz : " +result);
        return result;
    }
    static int carpma(int a, int b){ //
        int result = a*b;
        System.out.println("Sonucunuz.." +result);
        return result;
    }
    static int bölme(int a, int b){ //
        if (b==0){
            System.out.println("Lütfen 0'dan farklı bir sayı giriniz...");
            return 0;
        }
        int result = a/b;
        System.out.println("Sonucunuz.." +result);
        return result;
    }
    static  int ustAlma(int a,int b){
        int result = 1;
        for(int i = 1; i <= a; i++ ){
            result *= a;

        }return result;
    }
    static int modAlma(int a , int b){
        return a % b;
    }
    static void DikdortgenAlan(int a, int b){
        System.out.println("Dikdörtgenin Çevresi" + (2*(a+b)));
        System.out.println("Dikdörgenin Alanı" + (a*b));
    }
    static void faktoriyel(int a){
        int sonuc = 0,ilkdeger = a;
        sonuc = a;
        for(int i = 0;i <= a ; i++){
            if(a != 0){
                a--;
                sonuc *= a;
            }else {
                sonuc = 1;
            }
        }System.out.println("   "+ilkdeger+"! = "+sonuc);

    }

    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int select;

        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkartma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üst alma İşlemi\n"
                + "6 - Mod alma İşlemi \n"
                + "7 - Dikdörgen İşlemleri\n"
                + "8 - Faktoriyel Alma İşlemleri\n";
        while (true){

            System.out.println("******Yapmak İstediğiniz İşlemi Seçiniz******");
            System.out.println(menu);
            select = scan.nextInt();

            if (select == 0 ){
                break;
            }
            switch (select){
                case 1:
                    System.out.println("Toplama İşlemi Seçtiniz ...");
                    break;
                case 2:
                    System.out.println("Çıkartma İşlemi Seçtiniz ...");
                    break;
                case 3:
                    System.out.println("Çarpma İşlemi Seçtiniz ...");
                    break;
                case 4:
                    System.out.println("Bölme İşlemi Seçtiniz ...");
                    break;
                case 5:
                    System.out.println("Üst alma İşlemi Seçtiniz ...");
                    break;
                case 6:
                    System.out.println("Mod alma İşlemi Seçtiniz ...");
                    break;
                case 7:
                    System.out.println("Diktörgen İşlemi Seçtiniz ...");
                    break;
                case 8:
                    System.out.println("Faktoriyel İşlemi Seçtiniz ...");
                    break;
                default:
                    System.out.println("Seçiminiz Opsiyonlarımız Arasında Yoktur...");
            }
            System.out.println("lütfen ilk Sayıyı Giriniz");
            int a = scan.nextInt();
            System.out.println("lütfen ikinci Sayıyı Giriniz");
            int b = scan.nextInt();

            switch (select){
                case 1:
                    toplama(a,b);
                    break;
                case 2:
                    cikartma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bölme(a,b);
                    break;
                case 5:
                    System.out.println("Sonucunuz : " +ustAlma(a,b));
                    break;
                case 6:
                    System.out.println("Sonucunuz : "+modAlma(a,b));
                case 7:
                    DikdortgenAlan(a,b);
                    break;
                case 8:
                    faktoriyel(a);
                    break;
                default:
                    System.out.println("Doğru Olmayan Bir İşlem Yaptınız !!!");
            }
        }
    }
}
