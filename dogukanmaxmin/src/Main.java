import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        /* System.out.println("Kaç Adet Sayı Gireceksiniz : ");
        int n = inp.nextInt(); int max = 0,min = 0;

        for (int i =1; i <= n; n--) { // 1 2 3 .4. 5 // 5 4 3 2 1
           System.out.print("Sayiyi Girin : ");
           int sayi = inp.nextInt();

           if(i == 1){
               min = sayi;
           }
           if(sayi > max){
               max = sayi;
           }else {
               min = sayi;
           }
        }
        System.out.println("Max sayi : "+max);
        System.out.println("Max sayi : "+min); */


        while(true){
            int toplam = 0;
            System.out.println();
            System.out.print("Bir Sayi Giriniz : ");
            int number = inp.nextInt();


            for(int i = 1; i <= number; i++){
                if(number == i){
                    continue;
                }
                if(number%i == 0){
                    toplam += i;
                }
            }if(toplam == number){
                System.out.println(number+" Mükemmel bir sayidir.");
            }else {
                System.out.println(number+" Mükemmel bir sayi degildir.");
            }
        }
    }
}
