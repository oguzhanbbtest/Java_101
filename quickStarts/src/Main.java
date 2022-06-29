import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
      /*  System.out.println("Giris Yapmak İcin Yasinizi Giriniz :");



        int yas = scanner.nextInt();

        if (yas < 18){
            System.out.println("Sadece 18 yaşından büyükler Giriş Yapabilir");
        }else{
            System.out.println("Sektöre Hos Geldiniz :))");
        } */
        System.out.println("Sizin ki Kac CM ?");
        int CM = scanner.nextInt();

        switch (CM){
            case 21:
                System.out.println("AFRİKAN STYLE");
                break;
            case 19:
                System.out.println("TÜRK PANZERİ GİBİ");
                break;
            case 17:
                System.out.println("KORELİLERİ TARUMAR EDER");
                break;
            case 15:
                System.out.println("ACITSADA ÖLDÜRMEZ");
                break;
            case 3:
                System.out.println("İŞ GÖRÜR DEVAMKKE");
                break;
        }



    }
}
