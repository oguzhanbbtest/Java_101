import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //รรง๐๐๐๐๐ รง๐๐ฃ๐๐๐ ๐ = 2๐ข
        //๐ข = (a+b+c) / 2
        //Alan * Alan = ๐ข * (๐ข โ ๐)* (๐ข โ ๐) * (๐ข โ ๐)
        double a,b,c,u;
        Scanner girdi = new Scanner(System.in);
        System.out.println("ฤฐlk Kenar");
        a = girdi.nextInt();
        System.out.println("ikinci Kenar");
        b = girdi.nextInt();
        System.out.println("Ucuncu Kenar");
        c = girdi.nextInt();
        u = (a+b+c)/2;
        System.out.println("Ucgenin Cevresi"+2*u);

        double ucgeninAlanฤฑn = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin Alanฤฑ :"+ucgeninAlanฤฑn);



    }
}
