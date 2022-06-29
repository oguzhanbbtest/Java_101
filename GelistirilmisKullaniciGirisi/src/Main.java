import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String ıd, pw;
        Scanner input = new Scanner(System.in);

        System.out.print("Id Giriniz : ");
        ıd = input.nextLine();
        System.out.print("Pw Giriniz : ");
        pw = input.nextLine();

        if (ıd.equals("dgknkam") && (pw.equals("elektrik"))) {
            System.out.print("Hoşgeldiniz");
        } else {
            System.out.println("Bilgilerinizi Kontrol Ediniz");

            System.out.print("Şifrenizi Değiştirmek İstermisiniz? Evet mi hayır mı? ");
            String karar = input.nextLine();
            if (karar.equals("evet")) {
                System.out.println("Yeni Şifrenizi Yazınız :");
                pw = input.nextLine();
                System.out.println("Yeni Şifre Başarıyla Oluşturuldu");

                while (true) {
                    System.out.print("Id Giriniz : ");
                    ıd = input.nextLine();
                    System.out.print("Pw Giriniz : ");
                    pw = input.nextLine();

                    if (ıd.equals("dgknkam") && pw.equals("test")) {
                        System.out.println("Basariyla Giris yapnizi");
                    }else {
                        System.out.println("Kullanici Adiniz ve Sifreniz Hatali");
                    }
                }
            } else {
                System.out.println("Tabii Efendim ");
            }


        }
    }
}