package fizzbuzz.stage1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzbuzz.stage1.Stage1;


public class Stage1AllTest
{
	//Test to see if a number returns from input of 11
	@Test
	public void numberTest()
	{
		Stage1 stage = new Stage1();
		String result = stage.evaluate(11);
		assertEquals("11", result);
	}
	
	//Test to see if 'fizz' returns from input of 33
	@Test
	public void fizzTest()
	{
		Stage1 stage = new Stage1();
		String result = stage.evaluate(33);
		assertEquals("fizz", result);
	}

	//Test to see if 'buzz' returns from input of 55
	@Test
	public void buzzTest()
	{
		Stage1 stage = new Stage1();
		String result = stage.evaluate(55);
		assertEquals("buzz", result);
	}
	
	//Test to see if 'fizzbuzz' returns from input of 33
	@Test
	public void fizzbuzzTest()
	{
		Stage1 stage = new Stage1();
		String result = stage.evaluate(90);
		assertEquals("fizzbuzz", result);
	}
	
	//Test to see if the test fails from a known output of 'fizzbuzz'
	@Test
	public void failureTest()
	{
		Stage1 stage = new Stage1();
		String result = stage.evaluate(180);
		assertEquals("180", result);
	}
}
