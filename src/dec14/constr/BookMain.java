package dec14.constr;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book(); // creating object...
        book.displayDetails("Rich dad poor dad","Robert", 200, "SKU123");


        //book.displayDetails1("ABC Book","Robert", 200, "SKU123");
        book.displayDetails1(); // calling this method.

    }
}
