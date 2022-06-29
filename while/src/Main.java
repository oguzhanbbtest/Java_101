public class Main {
    public static void main(String[] args){
        int i = 1;
        int k;
        System.out.println("Program basladı");
    //parantez içinde ki koşul true geldiği taktirde while kod bloğunun içini çalıştırır.
        while (i <= 5){
            System.out.println(i);
            k = 1;
            while (k <= 10){
                System.out.println(k + ",");
                k++;

            }
            System.out.println();

            i++;
        }
        System.out.println("Program bitti");

    }
}