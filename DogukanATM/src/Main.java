import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName= "dgknkam" , password="yap123";

        int right = 3;
        int balance = 1500;
        String fakeuser;
        String fakepw;
        int secim;

        while (right>0){
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            fakeuser=input.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            fakepw=input.nextLine();
            if (userName.equals(fakeuser) && password.equals(fakepw)) {
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.println("Yatırmak İstediğiniz Miktarı Yazın ");
                            int miktar = input.nextInt();
                            balance += miktar;
                            break;
                        case 2:
                            System.out.println("Çekmek İstediğiniz Mikatrı Yazın ");
                            int cekilenmiktar = input.nextInt();
                            if (balance < cekilenmiktar) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= cekilenmiktar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar Görüşmek Üzere Hoşçakalın");
                            break;
                        default:
                            System.out.println("Hatalı Bir Giriş Yaptınız");
                    }
                }
                while(secim != 4);
                break;
            }else {
                right--;
                System.out.println("Hatalı Giriş Yaptınız lütfen Tekrar Deneyiniz ");

                if (right == 0) {
                    System.out.println("Hesabınız Bloke Oldu Lütfen Bankanızla İletişime Geçiniz");
                }
            }
        }
    }
}
