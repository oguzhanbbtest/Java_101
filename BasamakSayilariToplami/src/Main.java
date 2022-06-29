import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //  tek tek basamakları bul ve onları topla.
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int number = sc.nextInt();
        int tempNumber = number;
        int basamak, basamaktoplam = 0;

        while(tempNumber != 0){
            basamak = tempNumber %10;
            basamaktoplam += basamak;
            tempNumber /=10;
        }
        System.out.println(basamaktoplam);
    }
}
