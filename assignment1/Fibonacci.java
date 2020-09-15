package assignment1;

public class Fibonacci {
	public static void main(String[] args) {
		fib();
		
		
	}
	public static void fib()
	{
		int f = 1, s = 1,c;
		float avg = 2f;
		System.out.println("The first 20 Fibonacci numbers are:");
		System.out.print(f+" "+s+" ");
		for(int i =3;i<=20;i++)
		{
			c = f+s;
			avg+=c;
			System.out.print(c+" ");
			f=s;
			s=c;
		}
		System.out.println();
		avg= avg/20;
		System.out.println("The average is "+avg);
		
	}

}
