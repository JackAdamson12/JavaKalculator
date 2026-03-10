package kalkulator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAddOne(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.add(1);
		// Assert
		assertEquals("0+1 = 1", 1, sut.getState());
	}

	@Test
	public void testMultOneByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		

		assertEquals("1*2 = 2", 2, sut.getState());
	}
	@Test
	public void testMultiplyByZero()
	{
		Calculator sut = new Calculator();
		sut.setState(10);

		sut.mult(0);

		assertEquals(0, sut.getState());
	}
	  @Test
    public void testDel()
	{
        Calculator sut = new Calculator();
        sut.setState(10);
        sut.dele(2);

        assertEquals(5, sut.getState());
    }
	@Test
	public void testDeleZero()
	{	
    	Calculator sut = new Calculator();
    	sut.setState(10);

    	sut.dele(0);

    	assertEquals(10, sut.getState());
	}
	@Test
	public void testAddMaxValue()
	{
		Calculator sut = new Calculator();
		sut.setState(Integer.MAX_VALUE);

		sut.add(1);

		assertEquals(0, sut.getState());
	}
	@Test
	public void testMinusMinValue()
	{
		Calculator sut = new Calculator();
		sut.setState(Integer.MIN_VALUE);

		sut.minus(1);

		assertEquals(0, sut.getState());
	}

	@Test
	public void testClear()
	{
 		Calculator sut = new Calculator();
    	sut.setState(10);

    	sut.clear();

    	assertEquals(0, sut.getState());
	}
	@Test
	public void testMemorySave()
	{
		Memory mem = new Memory();

		mem.setMemory(10);

		assertEquals(10, mem.getMemory());
	}
}
