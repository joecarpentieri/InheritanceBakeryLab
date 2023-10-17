import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApplePieTest {

    ApplePie applePie;

    @BeforeEach
    void setUp(){
        applePie = new ApplePie(  10, 2.50, 5, 8);
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

//    This is where I tested the method overload
    @Test
    void addedGenericBirthdayMessage__withName(){
        assertThat(applePie.addGenericBirthdayMessage("Joe")).isEqualTo("Happy birthday to you Joe!");
    }

//    My second method overload of the same method
    @Test
    void addedGenericBirthdayMessage__withAge(){
        assertThat(applePie.addGenericBirthdayMessage(27)).isEqualTo("Happy birthday, you're 27.");
    }

    @Test
    void givenMessageForCustomer(){
        assertThat(applePie.messageForCustomer()).isEqualTo("Here is your Joe's Apple Pie.");
    }

}
