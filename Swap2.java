/* Program to swap two numbers by using temp. variables and calling method*/
import java.util.*;
public class Swap2 {


	public static void main(String [] args) {

			int a=30;
			int b=40;
				System.out.println("Before swap a="+a+ " Before swap b="+b);		
			result(a,b);
			
		}
		
		public static void result(int a,int b)
		{	
			int c=a;
			a=b;
			b=c;
				System.out.println("After swap a="+a+ " After swap b="+b);
				
		}
	  }


