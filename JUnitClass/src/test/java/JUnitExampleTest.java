import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class JUnitExampleTest {

    private JUnitExample jUnitExample;
    private static final Logger LOGGER = Logger.getLogger(JUnitExampleTest.class.getName());

    @BeforeEach
    void setUp() {
        jUnitExample = new JUnitExample();
        LOGGER.info("Inside @BeforeEach");
    }

    @Test
    @DisplayName("Should Divide Two Numbers")
    void shouldDivideTwoNumbers() {

        LOGGER.info("Inside ShouldDivideTwoNumbers");

        //Given
        //what are the inputs we need for this method
        final int num1 = 12;
        final int num2 = 4;

        //what is the  expected result
        int expectedResult = num1 / num2;

        //when

        int actualResult = jUnitExample.divideTwoNumbers(num1, num2);

        //Then

//        assertEquals(expectedResult, actualResult);

        assertEquals(3,jUnitExample.divideTwoNumbers(num1,num2) );



    }

    @Test
    void shouldThrowAnIllegalArgumentException(){



    }



    @Test
    @Disabled

    void convertAStringToUpperCase() {
    }

    @Test
    @Disabled

    void findANameInACollection() {
    }

    @Test
    @Disabled
    void printNames() {
    }
}