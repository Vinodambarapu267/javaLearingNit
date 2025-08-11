package test1.book;

public class Book {
    private String name;
    private String author;
    private  double price;

    public Book(String name, String author, double price) {
        if (price<0){
            System.err.println("please enter positive");
        }
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;

        this.price=0.0;
    }

    public Book() {
        this.name="unknown";
        this.author="unknown";
        this.price=0.0;
    }
    public  void displayBookDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("author: "+this.author);
        System.out.println("price: "+this.price);
    }
}
