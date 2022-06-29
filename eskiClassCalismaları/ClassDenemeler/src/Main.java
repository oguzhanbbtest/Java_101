public class Main {
    public Main() {
    }

    public static void main(String[] args){
        // java da obje oluşturmak için new metodunu kullanıyoruz.
        Car car1 = new Car();

        car1.setColor("Gümüş"); //Car.java da oluşturduğumuz dolaylı color metoduna bu şekilde string değer atadık
        car1.setDoors(4);
        car1.setEngine(1.6);
        car1.setModel("Renault Megane");

        // set o değeri verdiğimiz get o değeri aldığımız metodumuz oluyor.

        System.out.println("Arabanın Rengi :" + car1.getColor()); // car1.getColor() ile de dolaylı olarak çağırdık
        System.out.println("Arabanın Modeli :" + car1.getModel());
        System.out.println("Arabanın Motoru :" + car1.getEngine());
        System.out.println("Arabanın Kapıları:" + car1.getDoors());
        car1.start();
        car1.stop();




    }
}
