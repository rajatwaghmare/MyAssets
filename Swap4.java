class Swap4
{
	public static void main(String[] args) 
	{
		int a=30;
		int b=40;
		System.out.println("Before Swap-> a:="+a+" b:="+b);		
		interchange(a,b);
	}
	static void interchange(int x,int y)
	{
		int c=0;
		c=x;
		x=y;
		y=c;
	    System.out.println("After Swap-> a:="+x+ " y:="+y);
	}
}
