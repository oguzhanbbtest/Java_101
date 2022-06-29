import java.util.Scanner;

public class Main {
    static int üsAlma(){

        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.println("taban sayısını giriniz");
            int taban = inp.nextInt();
            System.out.println("Üssü Giriniz");
            int üs = inp.nextInt();
            int toplam = 1;
            for (int x = 1; x <= üs; x++) {
                toplam *= taban;

            }
            System.out.println("Sonuc : " +toplam);

        }
    }
    public static void main(String[] args) {
        üsAlma();

    }
}
