public class Electronic extends Product{

    private int warrantyNoOfMonths;

    public Electronic (String name, double price, int warrantyNoOfMonths){

        super(name, price);
        this.warrantyNoOfMonths = warrantyNoOfMonths;

    }

    @Override
    public String toString(){

        return name+", "+warrantyNoOfMonths+" months of warranty"+": "+price+" euro";

    }


}