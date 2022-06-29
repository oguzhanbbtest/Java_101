public class Main {
    static boolean isPalindrom(int number){ // Bir metot oluşturduk metodun içine gelicek ifadeye veri tipi atadık
        int temp = number,reverseNumber = 0, lastNumber;

        while(temp != 0){ // döngünün içi true geldikçe döngü devam edicek,
            lastNumber = temp % 10; // verilen sayının 10'a bölümünden kalan o sayının son sayısıdır.
            // kritik nokta: işte algoritmanın iskeleti budur; ilk değer 0 la başlıyor 0'ı 10 ile çarpıp
            // temp'in 10 a bölümünden kalan sayı ile topluyor bu şekilde her seferinde sondan başa doğru
            // sayımızı yazmış oluyor.
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp/= 10;
        }
        if(number == reverseNumber){
            return true;
        }else{
            return false;
        }


    }//Sayılar ==>> 1, 4, 8, 99, 101, 363, 4004, 9889.
    public static void main(String[] args){

        System.out.println(isPalindrom(4004));
    }
}
