public class Main {
    public static void main(String[] args) {
        //6 --> 2,3
        //28 --> 1,2,4,7,14

        int number =30;
        int total = 0;

        for(int i = 1; i<number; i++){
            if(number % i == 0){
                total = total + i ;
            }

        }
        if(total == number){
            System.out.println("Mukkemmel Sayidir");
        }else{
            System.out.println("Mukkemmel Sayi Değildir");
        }
    }


}
