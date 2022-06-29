import java.util.Scanner;
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0; int k=1;

        while(true){
            do {
                System.out.println("Sayi Giriniz");
                sayi = input.nextInt();
                if (sayi%2 == 1){
                    System.out.println("Tek Sayi Girdiğiniz İçin Toplama İşlemi Durdu...");
                    break;
                }
                if(sayi % 4 == 0 ){
                    toplam += sayi;
                    System.out.println("toplanıyor..."+toplam);
                }

            }while (sayi>0);

            System.out.println("çift ve 4'ün katları olan sayıları toplamı" + toplam);
        }
    }
}
