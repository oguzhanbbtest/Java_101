import java.util.Scanner;

public class Main {

    public static void mean(int[] arr) {
        int total = 0 ;

        for(int i = 0 ; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Ortalama:" + (double)total / arr.length);

    }
    public static void main(String[] args){
       /* int[] arr2 = new int[5]; // bu şekilde 5 adet yere sahip yeni bir array oluşturdum.

        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        System.out.println("Array 2'nin 1. elemanı : " + arr2[0]); // bu şekilde değer verdiğimiz arr2 dizisinden elemanı yazdırabiliyoruz.
        System.out.println("Array 1'nin 1. elemanı : " + arr1[0]); */

        Scanner scanner = new Scanner(System.in);

        /* int[] arr1 = {10,20,30,40,50}; */
        int[] arr2 = new int[5];
      /*  for (int i = 0 ; i < arr1.length ; i++){  // daha sağlıklı bir yöntem ile döngü yarattık
            System.out.println("Eleman : " + arr1[i]);
        } */
        System.out.println(" Sayı Giriniz :))");
        for (int i = 0; i < arr2.length ; i++){
            arr2[i] = scanner.nextInt();
        }
        mean(arr2);
    }
}
