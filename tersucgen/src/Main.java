import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        for(int i = 0; i <= n ; i++){
            for(int k =1; k <=i+1; k++ ){
                System.out.print(" ");
                for(int j=0; j <(n-i); j++){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }


    }
}