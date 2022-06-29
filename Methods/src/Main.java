public class Main {

    static void print(){
        System.out.println("Parametresiz Metod");
    }
    static void print(int a){ // görüldüğü gibi print metodunu overloading ile tekrar yazabildim
        System.out.println("Parametreler : " + a);
    }
    static int print(int a,int b){
        return a + b ;
    }
    static int print(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        print();
        print(21); // print() metodunun içine int veri  tipinde bir değer yazdığımda
        // overloading ile  print(int a) metodu devreye giricek :))
        System.out.println(print(31,31));
        System.out.println(print(31,31,31));

        // BU ŞEKİLDE AYNI METODU 4 FARKLI ŞEKİLDE KULLANMIŞ OLDU BU İŞLEME
        // OVERLOADİNG DENİYOR VE SIKÇA KULLANILIYOR....
    }
}
