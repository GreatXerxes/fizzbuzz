class Stage1
{
	public static void main(String[] args)
	{
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
	}
}