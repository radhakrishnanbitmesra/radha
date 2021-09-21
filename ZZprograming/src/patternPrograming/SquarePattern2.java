package patternPrograming;

public class SquarePattern2 {
	public static void main(String[] args) 
	{
		//outer for loop decides no of rows
		for (int rows=1;rows<=15 ;rows++ )
		{	
			//inner for loop will decide no of cols
			for (int col=1;col<=15 ;col++ )
			{
				if(rows==1  ||  rows==15  ||col==1 ||col==15)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}// end of inner for loop
			System.out.println();
		}
	}
}
