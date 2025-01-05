public class Clothes extends Product {

    private int size;
    private String color;

    public Clothes(String name, double price, int size, String color){

        super(name, price);
        this.size = size;
        this.color = color;

    }

    @Override
    public String toString(){

        return name+", "+color+", size "+size+": "+price+" euro";

    }

}