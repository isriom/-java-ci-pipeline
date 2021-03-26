package Calculator;

import Calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator{

    public Calculator calculadora= new Calculator();

    @Test
    void test_Suma(){
        assertEquals(2, Calculator.add(1,1));
        assertEquals(2, Calculator.add(3,-1));
    }
    @Test
    void test_Divide(){

        assertEquals(2, Calculator.divide(2,1));
        assertEquals(1, Calculator.divide(5,5));
    }
    @Test
    void test_Pwr(){
        assertEquals(2, Calculator.pwr(2,1));
        assertEquals(8, Calculator.pwr(2,3));
    }
    @Test
    void test_Multiply(){
        assertEquals(2, Calculator.multiply(2,1));
        assertEquals(100, Calculator.multiply(50,2));
    }
}
