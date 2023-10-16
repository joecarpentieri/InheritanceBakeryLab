import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApplePieTest {

    ApplePie applePie;

    @BeforeEach
    void setUp(){
        applePie = new ApplePie("Joe's Apple Pie", "Puff Pastry", "Apple", 10, 2.50, 5, 8);
    }

    @Test
    void isItProfitable__true(){
        assertThat(applePie.isItProfitable()).isEqualTo(true);
    }

//    @Test
//    void isItProfitable__false(){
//        assertThat(applePie.isItProfitable()).isEqualTo(false);
//    }

//    @Test
//    void doCustomersLikeIt__true(){
//        assertThat(applePie.doCustomersLikeIt()).isEqualTo(true);
//    }

    @Test
    void doCustomersLikeIt__false(){
        assertThat(applePie.doCustomersLikeIt()).isEqualTo(false);
    }

    @Test
    void addedGenericBirthdayMessage(){
        assertThat(applePie.addGenericBirthdayMessage()).isEqualTo("Happy birthday to you!");
    }

}
