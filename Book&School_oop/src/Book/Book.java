package Book;

public class Book {
    private String name;
    private int pageNumber;



    public Book(String name, int pageNumber){
        this.name = name;
        this.pageNumber = pageNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        this.name = name;
        System.out.println(name);
    }
    public void setPageNumber(int pageNumber){
        this.pageNumber = pageNumber;
    }public void getPageNumber() {
        if (pageNumber < 0) {
            pageNumber = 100;
        }
        this.pageNumber = pageNumber;
        System.out.println(pageNumber);
    }


}
