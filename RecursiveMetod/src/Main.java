public class Main {

    static int f(int n){
        System.out.println("n =>" + n);

        if(n==1){
            return 1;

        }
        int result = f(n-1) + n;
        System.out.println("result =>>" + result);
        return result;
    }

    public static void main(String[] args){
        System.out.println(f(3)); // bu şekilde metot kendi içinde yinelenerek f(3) = 6 yı bulur ve yazdırır.

        //f(3) = f(2) + 3 ==> 6
        //f(2) = f(1) + 2
        //f(1) = 1

    }
}
