package assignment1;

public class Pattern {
public static void main(String[] args) {
	int r =8;
	pattern(r);
}
public static void pattern(int r)
{
	for(int i =1;i<=r;i++)
	{for(int j =1;j<=i;j++)
	{System.out.print(j+" ");}
	System.out.println();
	}
		
}
}
