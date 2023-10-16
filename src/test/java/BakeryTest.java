import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;

    @BeforeEach
    void setUp() {
        bakery = new Bakery();
    }

    @Test
    void countPiesInOven() {
        assertThat(bakery.countPiesInOven()).isEqualTo(0);
    }

    @Test
    void addPiesToOven() {
        ApplePie applePie = new ApplePie("New AP", "soft", "apple", 20, 1, 2, 20);
        bakery.addPiesToOven(applePie);
        assertThat(bakery.countPiesInOven()).isEqualTo(1);


    }
}