import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayiyi giriniz");
        int a = input.nextInt();
        System.out.println("ikinci Sayiyi giriniz");
        int b = input.nextInt();
        System.out.println("Ucuncu Sayiyi giriniz");
        int c = input.nextInt();

        if (a < c) {
            if(a < b)
                if(c<b){
                    System.out.println(a+""+c+" "+ b);
                }
        }
        if(a < b){
            if (c < a){
                System.out.println(c+" "+a+" "+b);
            }
            else{
                System.out.println(a+" "+ b +" "+c);
            }
        }else if(b < a){
            if(a < c) {
                System.out.println(b+" "+a+" "+c);
            }
            if (c < b) {
                System.out.println(c + " " + b + " " + a);
            }else{
                System.out.println(b + " "+ c +" "+ a );
            }
        }
    }
}