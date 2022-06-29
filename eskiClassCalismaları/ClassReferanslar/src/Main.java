public class Main {
    public Main() {
    }


    public static void main(String[] args){
        /* Car car1 = new Car("Gümüş","Renault Megane",1.6, 4);
        Car car2 = car1; // bu şekilde oluşturduğumuz nesnemize referan mevcut nesneyi gösterirsek çıktı alırız.
        car2.showInfos(); */
        String s1 = new String("Mustafa");
        String s2 = new String("Mustafa");

        /* if(s1 == s2){
            System.out.println("Eşittir");
        }
        else{
            System.out.println("Eşit Değildir");
        }// eşit değildir sonucu alıcaz çünkü referans değerlerinin eşitliğini sorguluyor.
        // Bu durumda şunu yapmamız gerekli; */

            if(s1.equals(s2)){
                System.out.println("Eşittir");
            }
            else{
                System.out.println("Eşit Değildir");
            } // bu string ifadelerin birbirine eşitliği onaylanmış oluyor.

    }



}

