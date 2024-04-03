import com.edataconsulting.edatalabs.Item;

import java.util.ArrayList;
import java.util.List;

import static com.edataconsulting.edatalabs.PriceCalculator.calculatePrice;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PriceCalculatorTest {

    @org.junit.jupiter.api.Test
    void calculatePriceShouldReturnTheRightValue() {
        List<Item> items = new ArrayList<>(
            List.of(
                new Item(30D, 6D, 10D),
                new Item(50D, 0D, 25D)
            )
        );

        assertEquals(89.5, calculatePrice(items));
    }

    @org.junit.jupiter.api.Test
    void thePriceShouldBeZeroIfTheItemsAreEmpty() {
        List<Item> items = new ArrayList<>(List.of());

        assertEquals(0, calculatePrice(items));
    }

}
