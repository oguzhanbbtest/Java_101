import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.
        Scanner inp = new Scanner(System.in);
        System.out.println("Lutfen Kilometre Giriniz");
        double km = inp.nextInt();
        double acilis = 10;
        double kmUcret = 2.2;
        double minTutar = 20;
        double total = acilis + (km*kmUcret);
        total = (total > 20)? total : minTutar;
        System.out.println("Ödenecek Tutar : "+total);

    }
}
