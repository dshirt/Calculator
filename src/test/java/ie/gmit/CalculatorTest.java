package ie.gmit;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @AfterEach
    void printOut(){
        calculator.toString();
    }

    @DisplayName("***********Testing addition of two numbers ***********")
    @Test
    void testAdd() {
        assertEquals(15, calculator.addNumbers(10, 5));
    }

    @DisplayName("***********Testing subtraction of two numbers ***********")
    @Test
    void testSub(){
        assertEquals(5, calculator.subtractNumbers(10, 5));

    }

    @DisplayName("***********Testing multiplication of two numbers ***********")
    @Test
    void testMulti(){
        assertEquals(50, calculator.multiplyNumbers(10, 5));
    }

    @DisplayName("***********Testing division of two numbers ***********")
    @Test
    void testDiv(){
        assertEquals(2, calculator.divideNumbers(10, 5));
    }

    @DisplayName("***********Testing division by zero throws exception ***********")
    @Test
    void testDivnum20(){
        assertThrows(IllegalArgumentException.class, ()->{calculator.divideNumbers(10,0);});
    }

    @DisplayName("***********Testing division by zero throws exception ***********")
    @Test
    void testDivnum10(){
        assertThrows(IllegalArgumentException.class, ()->{calculator.divideNumbers(0,10);});
    }

    @DisplayName("***********Testing division by zero throws exception ***********")
    @Test
    void testTwoArgConstructor(){
        calculator = new Calculator(10,5);
    }

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        testReporter.publishEntry("Testing"+ " "+ testInfo.getDisplayName());
        calculator = new Calculator();
        System.out.println();
    }

    @BeforeAll
    static void testStart(){
        System.out.println("********* Starting Test ***********");
        System.out.println();
    }

    @AfterAll
    static void testEnd(){
        System.out.println("********* Ending Test ***********");
        System.out.println();
    }


}
