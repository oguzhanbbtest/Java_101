import java.util.Scanner;

public class Kayit {
    String id;
    String pw;

    Kayit(String id,String pw){
        this.id = id;
        this.pw = pw;
        kayitislemi(id,pw);
    }

    void kayitislemi(String id, String pw){

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici Adi Giriniz");
        this.id = input.nextLine();
        System.out.println("Sifre Giriniz");
        this.pw = input.nextLine();
        System.out.println("Kayit İslemi Basariyla Tamamlandi");


    }
}
