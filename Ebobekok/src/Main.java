import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,y;
        int Ebob=0;
        int Ekok = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Sayi Giriniz..");
        x = input.nextInt();
        y = input.nextInt();

        for (int i=1; i<=x && i<=y; i++) {
            if(x%i == 0 && y%i == 0)
                Ebob = i;
            Ekok= (x*y)/(Ebob);

        }
        input.close();
        System.out.println("Ebob" +" " + Ebob+ " "+"ve Ekok" +" " +Ekok);
    }
}
