import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;
    LemonMeringuePie lemonMeringuePie;

    @BeforeEach
    void setUp() {
        bakery = new Bakery();
    }

    @Test
    void countPiesInOven() {
        int result = bakery.countPiesInOven();
        assertThat(result).isEqualTo(0);
    }

    @Test
    void addPiesToOven() {
        ApplePie applePie = new ApplePie(20, 1, 2, 20);
        bakery.addPiesToOven(applePie);
        assertThat(bakery.countPiesInOven()).isEqualTo(1);
    }

    @Test
    void countPiesReheatable(){
        int result = bakery.countPiesInReheatable();
        assertThat(result).isEqualTo(0);
    }

    @Test
    void addPiesToReheatable(){
        bakery.addPiesToReheatable(lemonMeringuePie);
        assertThat(bakery.countPiesInReheatable()).isEqualTo(1);
    }
}