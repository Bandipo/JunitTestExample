import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JUnitExampleTest {

    private JUnitTestable jUnitExample;
    private static final Logger LOGGER = Logger.getLogger(JUnitExampleTest.class.getName());

    @BeforeEach
    void setUp() {
        jUnitExample = new JUnitExample();
        LOGGER.info("We are in setUP @Before each");


    }

    @Test
    @DisplayName(" Should Divide TwoNumbers")
    @Order(1)
    void shouldDivideTwoNumbers() {
        LOGGER.info("We are in divideTwoNumbers");

        //Given
        final int num1 = 8;
        final int num2 = 2;


        final int expectedResult = num1/num2;

        //when
        int actualResult = jUnitExample.divideTwoNumbers(num1, num2);

       //then
//        assertEquals(expectedResult, actualResult);

        assertEquals(4, jUnitExample.divideTwoNumbers(num1,num2));


    }

    @Order(2)
    @Test
    void shouldThrowIllegalStateException(){

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                jUnitExample.divideTwoNumbers(4,0);
//
//            }
//        };

        assertThrows(IllegalArgumentException.class,
                ()->{
                    jUnitExample.divideTwoNumbers(4,0);

                });

    }

    @Test
    void convertAStringToUpperCase() {
        //Given
        final String input = "paul";

        final String expectedResult = input.toUpperCase();

        //when

        String actualResult = jUnitExample.convertAStringToUpperCase(input);

        //then

        assertEquals(expectedResult, actualResult);

    }
    @Test
    void shouldThrowIllegalStateException1(){

//

        assertThrows(IllegalArgumentException.class,
                ()->{
                    jUnitExample.convertAStringToUpperCase(null);
                    jUnitExample.convertAStringToUpperCase("");

                });

    }

    @Test

    void addNamesToACollection() {

        //Given
        final String input = "Timothy";

        //when
        jUnitExample.addNamesToACollection(input);

        //then

        assertEquals(1 , jUnitExample.getNames().size());

        assertTrue(jUnitExample.getNames().contains(input));











    }

    @Test
    @Disabled
    void findANameInACollection() {
    }
}