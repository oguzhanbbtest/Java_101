import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double Matematik,Turkce,Fizik,kimya,Tarih,Müzik; double ortalama;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz");
        Matematik = inp.nextInt();
        while (!((0 <= Matematik) && (Matematik <=100))){
            System.out.println("0-100 arasında bir rakam giriniz");
            Matematik = inp.nextInt();
        }
        System.out.println("turkce Notunuzu Giriniz");
        Turkce = inp.nextInt();
        while (!((0 <= Turkce) && (Turkce <=100))){
            System.out.println("0-100 arasında bir rakam giriniz");
            Turkce = inp.nextInt();
        }
        System.out.println("fizik Notunuzu Giriniz");
        Fizik = inp.nextInt();
        while (!((0 <= Fizik) && (Fizik <=100))){
            System.out.println("0-100 arasında bir rakam giriniz");
            Fizik = inp.nextInt();
        }
        System.out.println("kimya Notunuzu Giriniz");
        kimya = inp.nextInt();
        while (!((0 <= kimya) && (kimya <=100))){
            System.out.println("0-100 arasında bir rakam giriniz");
            kimya = inp.nextInt();
        }
        System.out.println("Tarih Notunuzu Giriniz");
        Tarih = inp.nextInt();
        while (!((0 <= Tarih) && (Tarih <=100))){
            System.out.println("0-100 arasında bir rakam giriniz");
            Tarih = inp.nextInt();
        }
        System.out.println("Müzik Notunuzu Giriniz");
        Müzik = inp.nextInt();
        while (!((0 <= Müzik) && (Müzik <=100))){
            System.out.println("0-100 arasında bir rakam giriniz");
            Müzik = inp.nextInt();
        }

        ortalama = (Matematik+Turkce+Fizik+kimya+Tarih+Müzik) / 6.0;
        System.out.println("Ortalamaniz"+ ortalama);

        //60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        System.out.println((ortalama >= 60)?"Sınıfı Geçtiniz":"Sınıfta kaldınız Bidaha Deneyin");

    }
}
