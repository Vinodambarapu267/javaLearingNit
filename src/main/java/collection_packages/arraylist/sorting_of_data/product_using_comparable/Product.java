package collection_packages.arraylist.sorting_of_data.product_using_comparable;

public class Product implements Comparable<Product>
 {
    private  int productNumber;
    private String productName;
    private double price;

    public Product(int productNumber, String productName, double price) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public int compareTo(Product p1) {
        return this.productName.compareTo(p1.productName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
