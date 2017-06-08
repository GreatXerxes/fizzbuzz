package fizzbuzz.stage2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzbuzz.stage2.Stage2;

public class Stage2_Test_Incorrect 
{

	//Test to see if the test fails from a known output of 'fizzbuzz'
	@Test
	public void evaluatesExpression()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(180);
		assertEquals("180", result);
	}

}
