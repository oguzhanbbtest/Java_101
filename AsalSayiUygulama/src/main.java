public class main {
    public static void main(String[] args) {
        int number = 25;
        int reminde = number % 2;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayı Asal Sayıdır");
        } else {
            System.out.println("Sayı Asal Sayı değildir");

        }

    }
}