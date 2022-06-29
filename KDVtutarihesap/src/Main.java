import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ürünün satış fiyatı = ürünün fiyatı + ürün(18/100)kdv
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        Scanner input = new Scanner(System.in);

        double kdv; double ürününfiyatı = 0;

        System.out.println("Ürünün Fiyatını Girin");
        ürününfiyatı = input.nextDouble();

        System.out.println("ürünün fiyatı : " + ürününfiyatı);
        kdv = (0<ürününfiyatı) && (ürününfiyatı < 1000) ? 0.18 : 0.08;

        double ürününkdvlifiyatı = (ürününfiyatı*kdv) + ürününfiyatı;
        System.out.println("ürünün kdvli fiyatı" + ürününkdvlifiyatı);

        double ürününkdvtutarı = ürününkdvlifiyatı-ürününfiyatı;
        System.out.println("ürünün kdv tutarı" + ürününkdvtutarı);

        // variable = (condition) ? expressionTrue :  expressionFalse


    }



}
