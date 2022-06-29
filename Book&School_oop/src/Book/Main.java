package Book;

import Book.Book;

public class Main {
    // OOP 4 temel ilkesi;
    // Encapsulation
    // Inheritance
    // Polimorpish
    // Abstraction
    public static void main(String[] args) {

        Book b1 = new Book("Lord of The Rings", 1000);
        Book b2 = new Book("Kavgam", 700);
        b1.getName();
        b1.getPageNumber();
        b2.getName();
        b2.getPageNumber();

        b1.setName("Machine Gun Ozzie");
        b1.getName();
    }
}
