package fizzbuzz.stage2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzbuzz.stage2.Stage2;



public class Stage2AllTest
{
	//Test to see if a number returns from input of 11
	@Test
	public void numberTest()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(11);
		assertEquals("11", result);
	}
	
	//Test to see if 'fizz' returns from input of 33
	@Test
	public void fizzTest()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(33);
		assertEquals("fizz", result);
	}

	//Test to see if 'buzz' returns from input of 55
	@Test
	public void buzzTest()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(55);
		assertEquals("buzz", result);
	}
	
	//Test to see if 'fizzbuzz' returns from input of 33
	@Test
	public void fizzbuzzTest()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(90);
		assertEquals("fizzbuzz", result);
	}
	
	//Test to see if the test fails from a known output of 'fizzbuzz'
	@Test
	public void failureTest()
	{
		Stage2 stage = new Stage2();
		String result = stage.evaluate(180);
		assertEquals("180", result);
	}
}
