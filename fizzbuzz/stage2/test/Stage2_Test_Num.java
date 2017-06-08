package fizzbuzz.stage2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzbuzz.stage2.Stage2;

public class Stage2_Test_Num
{
	//Test to see if a number returns from input of 11
	@Test
	public void evaluatesExpression()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(11);
		assertEquals("11", result);
	}
}
