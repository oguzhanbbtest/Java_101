import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gormek istediginiz Seri, Kac Elemanli Olsun : ");
        int fib = input.nextInt(); int a=0,b=1,c=1;
        // 0 + 1 = 1 / a + b = c / a=0, b = 1, c = 1 , d = 2 , e = 3  f = 3 + 2 = 5 ...
        // 1 + 1 = 2  / b + c = d
        // 1 + 2 = 3    c + d = e
        // 2 + 3 = 5    ..
        // 3 + 5 = 8       .
        // 5 + 8 = 13
        // 13 + 8 = 21
        // 21 + 8 = 34

        for(int i=0;i<fib;i++){
            if(i==0){
                a=0;
                b=1;
                c=a+b;
                System.out.print(a+" + "+b+" = "+c+" | ");
            }
            else{
                System.out.print(a+" + "+b+" = "+c+" | ");
                a=b;
                b=c;
                c=a+b;
            }

        }

    }
}
