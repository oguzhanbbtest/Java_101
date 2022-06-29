import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kontrol Etmek Istediğiniz Sayiyi Girin..");

        int number = inp.nextInt();
        int basDeger =0;
        int tempNumber = number;
        int counter = 0;
        int sonuc = 0;

        while (tempNumber != 0){
            tempNumber/= 10;
            counter++;

        }tempNumber = number;
        while (tempNumber !=0){
            basDeger = number % 10;
            int amstrong = 1;
            for(int i = 1; i<=counter; i++){
                 amstrong *= basDeger;

            }sonuc += amstrong;
            tempNumber /=10;
        }if (sonuc == number){
            System.out.println("Sayımız Amstrong Sayıdır");
        }else{
            System.out.println("Sayımız Amstrong Sayı Değildir");
        }
    }
}
