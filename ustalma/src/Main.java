import java.util.Scanner;

public class Main {
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen İşlem İçin Sayi Giriniz");
        int sayi = input.nextInt();

        for (int i = 1; i<= sayi; i *= 4){
            System.out.println("4'ün Kuvvetleri : "+i);


        }
        for (int i = 1; i<= sayi; i *= 5){
            System.out.println("5'in Kuvvetleri : "+i);

        }

    }
}
