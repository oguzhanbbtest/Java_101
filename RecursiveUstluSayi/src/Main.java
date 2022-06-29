import java.util.Scanner;

public class Main {
    //Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
    // "Recursive" metot kullanarak yapan programı yazınız.
    static int islem(int taban,int üs){ /// 5^3 = 5*5*5;
        int a = 1;
        while(a < üs) {
            return taban * islem(taban, üs - 1); // islem(5,3) =>> 5*islem(5,2) ==> 5*5*islem(5,1) ==> 5*5*5 = 5^3
        }return taban;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ust Alma Islemine Hos Geldiniz..");

        while (true){
            System.out.println("Taban Degerini Giriniz");
            int taban = input.nextInt();
            System.out.println("Üs Degerini Giriniz"); // 5^0 = 1
            int üs = input.nextInt();

            if(üs != 0){
                int sonuc = islem(taban,üs);
                System.out.println("Cevap : "+sonuc);
            }else {
                int sonuc = 1;
                System.out.println("Bir Sayinin 0. Ussu Her Zaman 1'dir..");
                System.out.println("Cevap : "+sonuc);
            }

        }
    }
}
