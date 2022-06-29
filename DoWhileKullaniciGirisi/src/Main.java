    import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int pass;
            boolean askPassword = true; // Bir boolean oluşturalım ve bir nesneye true verelim.

            int i=1, j=1;
            while(i<3)
            {
                do
                {
                    System.out.print(j + ",");
                    j++;
                }while(j<4);
                i++;
            }


            do{
                System.out.println("Sifre Giriniz...");
                pass = input.nextInt();
                if(pass == 123){
                    System.out.println("Giris Basarılı......");
                    askPassword = false; //eğer giriş başarılıysa nesnemiz fals alsın ki döngü bitsin.
                }else {
                    System.out.println("Giris Basarısız......");
                }
            }while (askPassword);// askPassword her seferinde true geldikçe while sürekli döngüyü Do ya gönderiyor.
            // Do kod bloğununda şifre if yapımızda ki şartla uyuşunca askPassword false oluyor ve while döngüsü Do ya yönelmeyi bırakıyor.




        }
    }
