package fizzbuzz.stage2;

import static org.junit.Assert.*;

import org.junit.Test;


public class Stage2Test
{
	@Test
	public void evaluatesExpression()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(23);
		assertEquals("23", result);
	}
}
