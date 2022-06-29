import java.util.Scanner;
// Kullanıcı Girişi Örnek Çalışmasıdır..
// Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
// eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
// ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
// "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
// yazan programı yazınız.
public class Main {
    public static void main(String[] args){
        String userName,password,sıfırlama,yeniSifre;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        userName = inp.nextLine();

        System.out.print("Sifreniz : ");
        password = inp.nextLine();

        if(userName.equals("anatolianwolf")&& password.equals("wolf123")){
            System.out.println("Giriş Yaptınız");

        }else {
            System.out.println("Bilgileriniz Hatalı");
            System.out.println("Şifrenizi Sıfırlamak ve Yeni Şifre Oluşturmak İstermisiniz?\nyes?\nno?");
            sıfırlama = inp.nextLine();

            if(sıfırlama.equals("yes")){
                System.out.print("Kullanici Adiniz : ");
                userName = inp.nextLine();

                System.out.print("Yeni Sifre Giriniz : ");
                yeniSifre = inp.nextLine();
                    if(userName.equals("anatolianwolf")&& yeniSifre.equals("wolf123")){
                        System.out.print("Eski Şifrenizi Tekrar Kullanamazsınız!!!");
                        System.out.print("Lütfen Yeni Bir Şifre Oluşturun...");
                    }else if (userName.equals("anatolianwolf") &&  yeniSifre.equals("wolf5454"));
                        System.out.println("Yeni Şifrenizi Başarıyla Oluşturdunuz...");

                }
            else {
                System.out.println("Giriş Sayfasına Yönlendiriliyorsunuz...");
            }
        }



    }
}
