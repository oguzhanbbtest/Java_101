import java.util.Scanner;

public class Main {
    static int nrfak(int n,int r){
        int nrfak =1;
        for(int y = 1; y <= (n-r);y++){
            nrfak = nrfak * y; //nrfak = (n-r)!
        }int c = nrfak;
        return c;
    }
    static int nfak(int n){
        int nfak =1;
        for(int i = 1 ; i<= n ; i++){
            nfak = nfak*i; //n!

        }int b = nfak;
        return b;
    }

    static int rfak(int r){
        int rfak=1;
        for(int x = 1; x <= r ; x++){
            rfak = rfak*x; //r!
        }
        int a = rfak;
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r;

        while (true){
            System.out.println(" ");
            System.out.println("                ********************** Kombinasyon Hesabi **********************");
            System.out.println(" ");
            System.out.print("n Sayısını Giriniz : ");
            n = input.nextInt();
            System.out.print("r Sayısını Giriniz : ");
            r = input.nextInt();

            int fakfak = rfak(r) * nrfak(n,r);
            int kombinasyon = nfak(n) / fakfak;
            System.out.println("C("+n+","+r+") kombinasyonu : "+kombinasyon);

        }

    }
}

