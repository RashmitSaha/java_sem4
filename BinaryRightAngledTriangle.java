public class BinaryRightAngledTriangle
{
    static void pattern1(int n) 
    { 
      System.out.println("Pattern 1 with 0 as the initial element: ");
        int i,j;  
          
        for (i = 0; i < n; i++)  
        { 
            for (j = 0; j <= i; j++)  
            { 
                if (((i+j) % 2) == 0)  
                    System.out.print("0"); 
                else
                    System.out.print("1"); 
                      
                System.out.print(" "); 
            } 
              
            System.out.print("\n"); 
        }  
    } 
    
    static void pattern2(int n) 
    { 
    System.out.println("Pattern 2 with 1 as the initial element: ");
        // declare row and column 
        int row, col;  
          
        for (row = 0; row < n; row++)  
        { 
            for (col = 0; col <= row; col++)  
            { 
                if (((row + col) % 2) == 0)  
                    System.out.print("1"); 
                else
                    System.out.print("0"); 
                      
                System.out.print(" "); 
            } 
              
            System.out.print("\n"); 
        }  
    }
      
    // Driver code 
    public static void main (String[] args) 
    { 
        // no. of rows to be printed 
        int n = 5;
          
        pattern1(n); 
        pattern2(n);
    } 
} 
