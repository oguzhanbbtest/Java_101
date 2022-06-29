import java.util.Scanner;
public class Main {
    static double kitlendex(){


        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu Metre Cinsinden Giriniz");
        double boy = inp.nextDouble();
        System.out.println("Kilo Girin");
        double kilo = inp.nextDouble();
        double index = kilo / (boy*boy);
        System.out.println("Kitle Endeksiniz : "+index);
        return index;

    }
    public static void main(String[] args) {
       while (true){
           kitlendex();
       }

    }
}
