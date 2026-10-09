package javastandard.Chapter06;

class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }
    public Product() {}
}

public class ProductTest {
    public static void main(String args[]) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
    }
}
