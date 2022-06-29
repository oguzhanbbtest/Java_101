import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r;
        System.out.println("n icin faktöriyel girin: ");
        n= input.nextInt();
        System.out.println("r için faktöriyel girin: ");
        r= input.nextInt();
        int k = n-r;
        int i = 1,x = 1,y=1;
        int ntotal =1;
        while(i<=n){
            ntotal*=i;
            i++;
        }
        System.out.println(ntotal);
        int rtotal =1;
        while(x<=r) {
            rtotal*=x;
            x++;
        }
        System.out.println(rtotal);
        //C(n,r) = n! / (r! (n-r)!)
        int ktotal =1;
        while(y<=k) {
            ktotal *=y;
            y++;
        }
        System.out.println(ktotal);

        System.out.println("Sonuç : "+ntotal/(rtotal * ktotal));
    }
}
