import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç Basamakli Bir Desen İstersiniz ");
        int basamak = inp.nextInt(); int tempj = 0;

        for(int i=1;i<=basamak;i++) {
            for (int k = 1; k <= basamak-i; k++) {
                System.out.print(" ");
            }
            for (int j=1; j <= 2*i-1; j++){
                System.out.print("*");

            }
            System.out.println(" ");

        }// Püf nokta elmasın orta noktasını, döngüde oluşturduğumuz ücgenin tabanın oluşturması
        // Bu yüzden basamak sayımızın 1 eksiği ile işlem yapıyoruz
        // İlk döngüdeki işlemi simetrik olarak yapıcağımız için tam ters'i döngüyü yazmamız gerekir.
        for (int l= basamak-1; 1 <= l ; l--){ // 1 .... 5 // 5 4 3 2 1 ..

            for (int m = basamak - l; 1 <= m; m--){  // f(5) = f(4) + 2 ...
                System.out.print(" ");
            }
            for (int n=(2*l)-1; 1 <= n; n--){ // l = 2n -1 1 <l n--
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
