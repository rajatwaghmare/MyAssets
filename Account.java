class Account 
{
	public int acno=4050;
	public int balance=25000;
	public String name="Rajat";

	public void show()
	{
		System.out.println(acno);
		System.out.println(balance);
		System.out.println(name);
	}
	public void credit(int x)
	{
		balance=balance+x;
		System.out.println("Credited");
	}

	public void debit(int x)
	{
		if(balance-x>500)
		{
			balance=balance-x;
			System.out.println("Debited");
		}
		else
		{	
			System.out.println("Insufficient balance!!");
		}
	}
}
