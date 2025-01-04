public class Electronic extends Product{

    private int warrantyNoOfMonths;

    public Electronic (String name, double price, int warrantyNoOfMonths){

        super(name, price);
        this.warrantyNoOfMonths = warrantyNoOfMonths;

    }

    @Override
    public String toString(){
        //TODO Ret så outputtet stemmer overens
        return name+", "+warrantyNoOfMonths+" months of warranty"+": "+price+" euro";

    }


}
