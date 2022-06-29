import java.util.Scanner;
// Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
public class Main {


    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Türkce Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        if ((0<=mat&&mat<=100)&&(0<=fizik&&fizik<=100)&&(0<=turkce&&turkce<=100)&&(0<=kimya&&kimya<=100)&&(0<=muzik&&muzik<=100)){

            double avarage = (mat + fizik + turkce + kimya + muzik) / 5;

            if (avarage >= 55) {
                System.out.println("Tebrikler Sınıfı Geçtiniz......");
                System.out.println("Ortalamanız : " + avarage);
            } else {
                System.out.println(" Malesef Sınıfı Geçemediniz.......");
                System.out.println("Ortalamanız : " + avarage);
            }
        }else {

            System.out.println("Notunuz 0'dan Kucuk ve 100den buyuk olamaz...");
        }
    }
}
