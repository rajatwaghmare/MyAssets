/* Grade system by calling method  */ 

class Grade{

	public static void main(String []args)
	{
		int j=35;
		int k=90;
		int l=55;
		int m=74;

		result(j);
		result(k);
		result(l);
		result(m);
	}
	
	private static void result(int x)
	{
		if(x>75)
			{
				System.out.println("Distinction:"+x);
			}

		else if(x>60)
		                {
				System.out.println("First class:"+x);
			}
	
		else if(x>50)
			{
				System.out.println("Second class:"+x);
			}
	
		else if(x>=35)
			{
				System.out.println("Pass class:"+x);
			}
		else
			{
				System.out.println("Failed:"+x);
			}
	}
}
