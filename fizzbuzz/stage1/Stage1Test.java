package fizzbuzz.stage1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stage1Test
{
	@Test
	public void evaluatesExpression()
	{
		Stage1 stage = new Stage1();
		String result = stage.evaluate(11);
		assertEquals("11", result);
	}
}
