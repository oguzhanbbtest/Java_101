public class Daire {
    public int r;
    public final double PI_SAYISI = 3.14; // programda bir sabit tanımlanıyorsa bu tip bir jargon kullanılır
    // sabit değişken büyük harflerle yazılır.
    public Daire(int r){
        this.r = r;
    }

    public void calcArea(){
        double area = PI_SAYISI*Math.sqrt(r);
        System.out.println("Alan : " + area);
    }
}
