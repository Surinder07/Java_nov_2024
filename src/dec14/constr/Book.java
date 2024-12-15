package dec14.constr;

public class Book {
    String title;
    String author;
    double price;
    String barcode;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    private Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, double price, String barcode) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.barcode = barcode;
    }

    // create constructor ,
    // 1 parameter, 2 ,3 4, default constructor
    // complete this method displayDetails - add parameters
    // and with the help of object Book class, call all the method.


    public void displayDetails(String title, String author, double price, String barcode){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println(barcode);

    }

    // method signature,   defining the method
    public void displayDetails1(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println(barcode);

    }



}
