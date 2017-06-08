package fizzbuzz.stage1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stage1_Test_FizzBuzz
{

	//Test to see if 'fizzbuzz' returns from input of 33
	@Test
	public void evaluatesExpression()
	{
		Stage1 stage = new Stage1();
		String result = stage.evaluate(90);
		assertEquals("fizzbuzz", result);
	}
}
