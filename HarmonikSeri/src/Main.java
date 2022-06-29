import java.util.Scanner;
public class Main {

    static double harmonik(){
        Scanner input = new Scanner(System.in);
        System.out.println("N değeri giriniz..");
        double n = input.nextInt();
        double sonuc = 0;
        for(double i=1; i <= n; i++){
            sonuc += (1/i);
        }System.out.println("Harmonik Değer : "+sonuc);
        return sonuc;
    }
    public static void main(String[] args) {
       // Java ile girilen sayının harmonik serisini bulan program yazacağız.
        harmonik();

    }
}
