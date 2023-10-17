import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BlueberryPieTest {

    BlueberryPie blueberryPie;

    @BeforeEach
    void setUp(){
        blueberryPie = new BlueberryPie( 50, 12.50, 20, 25, "Fresh");
    }

    @Test
    void isItProfitable(){
        assertThat(blueberryPie.isItProfitable()).isEqualTo(true);
    }

    @Test
    void doCustomersLikeIt(){
        assertThat(blueberryPie.doCustomersLikeIt()).isEqualTo(false);
    }

    @Test
    void addedBlackberries(){
        blueberryPie.addBlackberries();
        assertThat(blueberryPie.addBlackberries()).isEqualTo("Blueberry and Blackberry");
    }

    @Test
    void givenMessageForCustomer(){
        assertThat(blueberryPie.messageForCustomer()).isEqualTo("Here is your Joe's Blueberry Pie.");
    }

}
