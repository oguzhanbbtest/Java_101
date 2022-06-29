import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Meyveler ve KG Fiyatları
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

        Scanner input = new Scanner(System.in);
        double armut, elma,domates,muz,patlıcan,n;
        armut = 2.14; domates = 1.11;
        muz = 0.95; patlıcan = 5.00;
        elma = 3.67;

        System.out.println("Armut Kaç Kilo ?");
        n = input.nextDouble();
        double armutn = n*armut;

        System.out.println("Elma Kaç Kilo ?");
        n =input.nextDouble();
        double elman = n*elma;

        System.out.println("Domates Kaç Kilo ?");
        n =input.nextDouble();
        double domatesn = n*domates;

        System.out.println("Muz Kaç Kilo ?");
        n =input.nextDouble();
        double muzn = n*muz;

        System.out.println("Patlıcan Kaç Kilo ?");
        n =input.nextDouble();
        double patlıcann =n*patlıcan;

        double toplamtutar = patlıcann+muzn+domatesn+elman+armut;
        System.out.println("Toplam Tutar"+toplamtutar);

    }
}
