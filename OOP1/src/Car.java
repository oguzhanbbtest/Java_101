public class Car {
    //Nitelikler..
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model,int speed,String color){
     //Kurucu metod ve sınıftaki niteliklere ulaşması için kullanılan this.
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;

    }
    void increaseSpeed(int increment){
     // Davranışlar
        if((this.speed + increment) < 180){
            this.speed += increment;
            System.out.println("Hiziniz Arttirildi..");
        }

    }
    void decreaseSpeed(int decrease){
        if(this.speed > 0){
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(this.type+" "+this.model + " hiziniz : " +this.speed);
    }
    void printInfo(){
        System.out.println("Model \t :" + this.model);
        System.out.println("Color \t :" + this.color);
        System.out.println("Type \t :" + this.type);
        System.out.println("Speed \t :" + this.speed);
    }











}
