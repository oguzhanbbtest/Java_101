public class Main {
    public static void main(String[] args) {
       Car audi = new Car("Audi",120,"Blue");
       audi.printInfo();
       audi.printSpeed();
       audi.increaseSpeed(50);
       audi.printSpeed();

       Car mercedes = new Car("Mercedes",100,"Red");
       mercedes.printInfo();
       mercedes.printSpeed();
       mercedes.increaseSpeed(30);
       mercedes.printSpeed();

       Car bmw = new Car("BMW",160,"Yellow");
       bmw.printInfo();
       bmw.printSpeed();
       bmw.increaseSpeed(10);
       bmw.printSpeed();



    }
}
