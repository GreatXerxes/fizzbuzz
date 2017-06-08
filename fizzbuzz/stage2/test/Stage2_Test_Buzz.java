package fizzbuzz.stage2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzbuzz.stage2.Stage2;

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
