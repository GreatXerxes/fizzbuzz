package fizzbuzz.stage1;

public class Stage1
{
	//Commented out the main method as i thought it would be easier to test
	/*public static void main(String[] args)
	{
		String hi = evaluate(Integer.valueOf(args[0]));
		String s = "";
		
		for(int i  = 1; i < 101; ++i)
		{
			boolean fizz = (i % 3) == 0;
			boolean buzz = (i % 5) == 0;
			
			if(fizz && !buzz)
			{
				s = s + "fizz\n"; 
			}
			else if(!fizz && buzz)
			{
				s = s + "buzz\n";				
			}
			else if(fizz && buzz)
			{
				s = s + "fizzbuzz\n";
			}
			else
			{
				s = s + i + "\n"; 
			}
		}
		
		System.out.println(s);
	}*/
	
	// new method takes in a number and outputs a string (fizz, buzz, fizzbuzz or the number itself)
	public static String evaluate(int num)
	{
		String s = "";
		boolean fizz = (num % 3) == 0;
		boolean buzz = (num % 5) == 0;
			
		if(fizz && !buzz)
		{
			s = s + "fizz"; 
		}
		else if(!fizz && buzz)
		{
			s = s + "buzz";				
		}
		else if(fizz && buzz)
		{
			s = s + "fizzbuzz";
		}
		else
		{
			s = s + num; 
		}
		return s;
	}
}
