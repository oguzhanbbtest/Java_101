package school;

public class Student {
    private String name;
    private String surname;
    private int idno;
    private String adress;
    private int note;

    public Student(String name, String surname, int idno, String adress, int note){
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.adress = adress;
        this.note = note;

    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }public int getIdNo(){
        return this.idno;
    }
    public String getAdress(){
        return this.adress;
    }

    public void setName(String name) {
        this.name = name;
    }public void setSurname(String surname){
        this.surname = surname;
    }public void setIdno(int idno){
        this.idno = idno;
    }public void setAdress(String adress){
        this.adress = adress;
    }

    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }
}
