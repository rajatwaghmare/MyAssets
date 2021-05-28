/* Program to swap two numbers without using temp. variables and calling method*/

 class Swap3 {

	public static void main(String [] args) {

			int a=30;
			int b=40;
			
				System.out.println("Before swap a="+a+ " Before swap b="+b);		
			result(a,b);
			
		}
		
		public static void result(int a,int b)
		{	
			a=a+b;
			b=a-b;
			a=a-b;
						
			System.out.println("After swap a="+a+ " After swap b="+b);
				
		}
	  }


