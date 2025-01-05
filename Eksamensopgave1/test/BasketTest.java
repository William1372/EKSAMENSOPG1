import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketTest {

    @Test
    void productTotalShouldEqualFifty(){

        Basket basket = new Basket();
        Product f1 = new Food("Mælk",12,"2025-01-12");
        Product f2 = new Food("Æg",28,"2025-01-23");
        Product f3 = new Food("Ritter Sport",10,"2026-09-29");

        basket.addProduct(f1);
        basket.addProduct(f2);
        basket.addProduct(f3);

        assertEquals(50,basket.getTotalPrice());

    }

}