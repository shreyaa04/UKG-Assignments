package assignment1;

public class TimeTable {
	public static void main(String[] args) {
		int s =1,e=9;
		printTimeTable(s,e);
	}
	public static void printTimeTable(int s, int e)
	{
		for(int i =s;i<=e;i++)
		{
			for(int j =s;j<=e;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}

}
