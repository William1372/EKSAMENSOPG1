import java.util.ArrayList;

public class Basket {

    ArrayList<Product> products = new ArrayList<>();

public void addProduct(Product product){

    products.add(product);

}

public void printAll(){

    System.out.println("\nClothes");
    for(Product product : products){
if(product != null) {
    if (product instanceof Clothes) {

        System.out.println(product);

        }
       }else {

        System.out.println("There are no clothes in the basket...");


     }
    }

    System.out.println("\nElectronics");
    for(Product product : products){
        if(product != null) {
            if (product instanceof Electronic) {

                System.out.println(product);

            }
        }else{

            System.out.println("There are no electronics in the basket...");

        }
    }

    System.out.println("\nFood");
    for(Product product : products){
        if(product != null) {
            if (product instanceof Food) {

                System.out.println(product);

            }
        }else{

            System.out.println("No foods are in the basket...");

        }
    }

}

public double getTotalPrice(){

    double total = 0;

    for(Product product : products){

        total += product.getPrice();

    }
    return total;
}

}
