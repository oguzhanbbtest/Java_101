public class Main {
    public Main() {
    }


    public static void main(String[] args){
        // java da obje oluşturmak için new metodunu kullanıyoruz.
        Car car1 = new Car("Gümüş","Renault Megane",1.6,4);
        Car car2 = new Car(); // default bilgiler.
        Car car3 = new Car("Siyah","Mercedes");

        car1.showInfos();
        car2.showInfos();
        car3.showInfos();

    }


}

