package fizzbuzz.stage2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stage2_Test_Buzz
{

	//Test to see if 'buzz' returns from input of 55
	@Test
	public void evaluatesExpression()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(55);
		assertEquals("buzz", result);
	}

}
