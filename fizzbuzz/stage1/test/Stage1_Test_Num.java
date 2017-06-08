package fizzbuzz.stage1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzbuzz.stage1.Stage1;

public class Stage1_Test_Num
{
	//Test to see if a number returns from input of 11
	@Test
	public void evaluatesExpression()
	{
		Stage1 stage = new Stage1();
		String result = stage.evaluate(11);
		assertEquals("11", result);
	}
}
