// Java code to demonstrate star pattern
public class PyramidPattern
{
	// Function to demonstrate printing pattern
	public static void printTriangle(int n)
	{
		// outer loop to handle number of rows
		// n in this case
		for (int i=0; i<n; i++)
		{

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j=n-i; j>1; j--)
			{
				// printing spaces
				System.out.print(" ");
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j=1; j<=i+1; j++ )
			{
				// printing stars
				System.out.print(j+ " ");
			}

			// ending line after each row
			System.out.println();
		}
	}
	
	// Driver Function
	public static void main(String args[])
	{
		int n = 5;
		printTriangle(n);
	}
}

