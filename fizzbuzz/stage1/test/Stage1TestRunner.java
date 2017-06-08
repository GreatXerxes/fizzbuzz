package fizzbuzz.stage1.test;


import java.util.ArrayList;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Stage1TestRunner 
{
	public static void main(String[] args)
	{
		/*Result result = JUnitCore.runClasses(Stage1_Test_Num.class);
		
		for (Failure failure : result.getFailures())
		{
	         System.out.println(failure.toString());
	    }
			
		System.out.println(result.wasSuccessful());*/
		
		List<ResultTest> resultList = new ArrayList<ResultTest>();
		
		ResultTest testNum = new ResultTest(JUnitCore.runClasses(Stage1_Test_Num.class), "Stage1 num Test");
		resultList.add(testNum);
		ResultTest testFizz = new ResultTest(JUnitCore.runClasses(Stage1_Test_Fizz.class), "Stage1 Fizz Test");
		resultList.add(testFizz);
		ResultTest testBuzz = new ResultTest(JUnitCore.runClasses(Stage1_Test_Buzz.class), "Stage1 Buzz Test");
		resultList.add(testBuzz);
		ResultTest testFizzBuzz = new ResultTest(JUnitCore.runClasses(Stage1_Test_FizzBuzz.class), "Stage1 FizzBuzz Test");
		resultList.add(testFizzBuzz);
		ResultTest testFail = new ResultTest(JUnitCore.runClasses(Stage1_Test_Incorrect.class), "Stage1 Incorrect Test");
		resultList.add(testFail);
		
		for(int i = 0; i < resultList.size(); ++i)
		{
			for(Failure failure : resultList.get(i).getResult().getFailures())
			{
				System.out.println(resultList.get(i).getName() + " : " + failure.toString());
			}
			System.out.println(resultList.get(i).getName() + " : " + resultList.get(i).getResult().wasSuccessful());
		}
		
	}
}

class ResultTest
{
	private Result result;
	private String name;
	public ResultTest(Result result, String name)
	{
		this.result = result;
		this.name = name;
	}
	
	public Result getResult()
	{
		return result;
	}
	
	public String getName()
	{
		return name;
	}
}
