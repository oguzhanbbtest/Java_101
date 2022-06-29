import java.util.Scanner;
public class Main {
    //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    //𝜋 sayısını = 3.14 alınız. // alan π * r * r; // Çevre Formülü : 2 * π * r;
    //Formül : (𝜋 * (r*r) * 𝛼) / 360
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Yarı Çap'ı Giriniz");
        double r = inp.nextInt();
        System.out.println("Alanını Bulmak İstedigin Dilimin Acisini Giriniz");
        double aci = inp.nextInt();
        double pi = 3.14;

        double cevre = 2 * pi * r;
        double alan = pi * r * r;
        double dilimalan = (pi * (r*r) * aci) / 360;

        System.out.println("Dairein Çevresi : "+cevre);
        System.out.println("Dairein Alani : "+alan);
        System.out.println("Verilen Açıya Göre Daire Diliminin Alani : "+dilimalan);



    }
}
