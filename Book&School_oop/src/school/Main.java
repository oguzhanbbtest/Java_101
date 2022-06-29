package school;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Oguzhan Bahadir","Bayram",666,"APZR",99);
        Student s2 = new Student("Abarai","Kenj",444,"JPN",88);
        Student s3 = new Student("Tyler","Durden",111,"NWYRK",69);
        // System.out.println(s1.getName()+" "+ s1.getSurname());
        // System.out.println(s1.getIdNo()+"/ Note : "+s1.getNote());
        // System.out.println(s1.getAdress());

        Instructor teacher = new Instructor("Mahmut","Tuncer","Karma Dans Sanatı");
        //Course has a Instructor ( Sınıf bir öğretmeni vardır.)
        Course math = new Course("MAT101","MAT101", teacher);
        System.out.println(math.getInstructor().getName()); // görüldüğü gibi math sınıfının içerisinden başka bir sınıfa ait bir metot çağırdık
        // buna "has a" Composition ilişkisi denir.

        // Student[] stu =  {s1,s2,s3};
        // System.out.println("Ortalamanız : "+ math.calAvarage(stu)); // "uses a" bağımlılık






    }
}
