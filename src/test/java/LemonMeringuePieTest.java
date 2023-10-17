import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LemonMeringuePieTest {

    LemonMeringuePie lemonMeringuePie;

    @BeforeEach
    void setUp(){
        lemonMeringuePie = new LemonMeringuePie(20, 6, 10, 20);
    }

    @Test
    void isItProfitable(){
        assertThat(lemonMeringuePie.isItProfitable()).isEqualTo(true);
    }

    @Test
    void doCustomersLikeIt(){
        assertThat(lemonMeringuePie.doCustomersLikeIt()).isEqualTo(true);
    }

    @Test
    void nowCutIntoSlices(){
        assertThat(lemonMeringuePie.cutIntoSlices()).isEqualTo("Cut into slices now!");
    }

    @Test
    void givenMessageForCustomer(){
        assertThat(lemonMeringuePie.messageForCustomer()).isEqualTo("Here is your Joe's Lemon Meringue Pie.");
    }

    @Test
    void hasBeenReheated(){
        String result = lemonMeringuePie.reheat("50C");
        assertThat(result).isEqualTo("This Joe's Lemon Meringue Pie has been reheated to 50C.");
    }




}
