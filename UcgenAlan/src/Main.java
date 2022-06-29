import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        double a,b,c,u;
        Scanner girdi = new Scanner(System.in);
        System.out.println("İlk Kenar");
        a = girdi.nextInt();
        System.out.println("ikinci Kenar");
        b = girdi.nextInt();
        System.out.println("Ucuncu Kenar");
        c = girdi.nextInt();
        u = (a+b+c)/2;
        System.out.println("Ucgenin Cevresi"+2*u);

        double ucgeninAlanın = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin Alanı :"+ucgeninAlanın);



    }
}
