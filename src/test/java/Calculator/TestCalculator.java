package Calculator;

import junit.framework.TestCase;


public class TestCalculator extends TestCase{

    public Calculator calculadora= new Calculator();

    public void test_Suma(){
        assertEquals(2.0, Calculator.add(1,1));
        assertEquals(2.0, Calculator.add(3,-1));

    }

    public void test_Divide(){

        assertEquals(2.0, Calculator.divide(2,1));
        assertEquals(1.0, Calculator.divide(5,5));
    }

    public void test_Pwr(){
        assertEquals(2.0, Calculator.pwr(2,1));
        assertEquals(8.0, Calculator.pwr(2,3));
    }

    public void test_Multiply(){
        assertEquals(2.0, Calculator.multiply(2,1));
        assertEquals(100.0, Calculator.multiply(50,2));
    }
}
