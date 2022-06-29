public class Car {
    // car class' ı altında fabrikalarımızı oluşturduk
    private String color; //color,model, engine,doors bunlar bizim oluşturduğumuz objeler.
    private String model;
    private Double engine;
    private int doors;
    // Biz fabrikalarımı private yaptığımız için main.java'dan erişemiyoruz dolaylı yoldan erişim kurmamız gerekli
    // Bu nedenle erişmek istediğim fabrikaya bir metod uygulayarak dolaylı erişim sağlıyor ki main.javadan erişip değer atayalım.

    public void setColor(String color){ // Biz burda public metodu yazdık bu sayede şuan bulunduğumuz sayfada ki color objemizi bu metoda göndericez.
        this.color = color; // bu şekilde bir syntax yazdığımız burada ki objemizin color özelliği Ne? diye bir anlam ortaya çıkarmış oluyoruz
    }// dolaylı yoldan color nesnesine bir değer atamış oluyoruz.

    public void setEngine(Double engine) {
        this.engine = engine;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setDoors(int doors) {
        if (doors == 2 || doors == 4 ) { // biz bu şekilde dolaylı yoldan çektiğimiz veriye şart koyduk ve bu şarta göre bir kullanım oluşturduk.
            this.doors = doors;
        }
        else {
            System.out.println("Kapı Sayısı sadece 2 veya 4 olabilir");
        }
    }


    public String getColor() { // Burdada dolaylı yoldan erişim sağlamış oluyoruz.

        return this.color;
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
}




