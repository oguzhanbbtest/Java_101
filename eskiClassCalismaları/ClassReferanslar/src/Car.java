public class Car {
    private String color; //color,model, engine,doors bunlar bizim oluşturduğumuz objeler.
    private String model;
    private Double engine;
    private int doors;

    public Car(String color, String model){
        this(color,model,0.0,0);
    }
    public Car() { // bu şekilde aracın default bilgilerini daha kısa bir metod ile çağırmış olduk.
        this("Bilgi Yok", "Bilgi Yok",0.0,0);
    }

    public Car(String color, String model, Double engine, int doors) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

    public void setColor(String color){
        this.color = color;
    }


    public void setModel(String model) {

        this.model = model;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    public void setDoors(int doors) {
        if (doors == 2 || doors == 4 ) {
            this.doors = doors;
        }
        else {
            System.out.println("Kapı Sayısı sadece 2 veya 4 olabilir");
        }
    }


    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Double getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }
    public void start() {
        System.out.println("Araba Çalıştı...");
    }
    public void stop() {
        System.out.println("Araba Durdu...");
    }
    public void showInfos(){
        System.out.println("Arabanın Rengi :" + this.color);
        System.out.println("Arabanın Modeli :" + this.model);
        System.out.println("Arabanın Motor Hacmi :" + this.engine);
        System.out.println("Arabanın Kapıları:" + this.doors);

    }






}




