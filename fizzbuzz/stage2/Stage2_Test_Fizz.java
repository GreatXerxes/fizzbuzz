package fizzbuzz.stage2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stage2_Test_Fizz
{

	//Test to see if 'fizz' returns from input of 33
	@Test
	public void evaluatesExpression()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(33);
		assertEquals("fizz", result);
	}
}
