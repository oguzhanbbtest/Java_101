import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int k;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        k = inp.nextInt();

        for(int i=0; i<=k ;i++ ){
            if(i%2 == 1){
                System.out.println(i);
            }else {
                System.out.println(i + "  Cift Sayi");

            }
        }


    }
}
