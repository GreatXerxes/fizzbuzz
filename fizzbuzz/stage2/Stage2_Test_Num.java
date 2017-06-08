package fizzbuzz.stage2;

import static org.junit.Assert.*;

import org.junit.Test;

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
