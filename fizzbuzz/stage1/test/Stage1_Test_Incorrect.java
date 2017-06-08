package fizzbuzz.stage1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzbuzz.stage1.Stage1;

public class Stage1_Test_Incorrect 
{

	//Test to see if the test fails from a known output of 'fizzbuzz'
	@Test
	public void evaluatesExpression()
	{
		Stage1 stage = new Stage1();
		String result = stage.evaluate(180);
		assertEquals("180", result);
	}

}
