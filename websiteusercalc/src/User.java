public class User {
    public String name;
    public static int counter = 0;

    static
    {
        System.out.println("Ben bir static kod bloguyum");

        counter = (int)(Math.random()*100);
        System.out.println("Random Sayi : "+ counter);
    }

    public User(String name){

        this.name = name;
        counter++;

    }
}
