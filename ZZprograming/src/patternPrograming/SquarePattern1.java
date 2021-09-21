package patternPrograming;

public class SquarePattern1 {
	public static void main(String[] args) 
	{
		//outer for loop decides no of rows
		for (int rows=1;rows<=3 ;rows++ )
		{	
			//inner for loop will decide no of cols
			for (int col=1;col<=4 ;col++ )
			{
					System.out.print("* ");
			}// end of inner for loop
			System.out.println();
		}
	}
}
