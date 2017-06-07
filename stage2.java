class Stage2
{
	public static void main(String[] args)
	{
		String s = "";
		
		for(int i  = 1; i < 101; ++i)
		{
			boolean fizz = (i % 3) == 0;
			boolean buzz = (i % 5) == 0;
			
			boolean contain3 = String.valueOf(i).contains("3");
			boolean contain5 = String.valueOf(i).contains("5");
			
			if(fizz && !buzz || contain3 && !contain5)
			{
				s = s + "fizz\n"; 
			}
			else if(!fizz && buzz || !contain3 && contain5)
			{
				s = s + "buzz\n";				
			}
			else if(fizz && buzz)// || contain3 && contain5)//Does not specifiy what to do if both 3 & 5 were contained
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