class Ntable 
{
	public static void main(String[] args) 
	{
		int i,j,num;
		for(i=1;i<=20;i=i+1)
		{
			num=i;
			System.out.print("\t");
			for(j=1;j<=10;j=j+1)
			{
						System.out.println((num*j));
						System.out.println("\t\t\t\t\t\t");
			}
			System.out.println("\t");
		}
	}
}
