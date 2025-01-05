public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        Product f1 = new Food("Milk",1.75,"01 January 2025");
        Product c1 = new Clothes("T-Shirt", 49.85,10,"Black");
        Product c2 = new Clothes("Pants", 88.00,8,"Brown");
        Product e1 = new Electronic("Headset",100,6);
        Product e2 = new Electronic("Tablet", 255, 24);

        basket.addProduct(f1);
        basket.addProduct(c1);
        basket.addProduct(c2);
        basket.addProduct(e1);
        basket.addProduct(e2);

        basket.printAll();

    }

}
