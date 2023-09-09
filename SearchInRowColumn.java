class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	   /*   code has O(n*m)  time complexity which is not optimal , where n=no. of rows  m=no. of col
	   
	    for(int i=0;i<matrix.length;i++)
	    {
	    for(int j=0;j<matrix[0].length;j++)
	    {
	       if(x==matrix[i][j])
	      {
	        return true;
	      }
	    
	     }
	    }
	    return false;
	    */
	    
	    
	    
	    // 2nd optimal solution with time complexity O(n+m)  , where n=no. of rows  m=no. of col
	    
	    
	     int target=x;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; // Handle empty matrix or null input
        }
        
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        
        // Start from the top-right corner of the matrix
        int row = 0;
        int col = numCols - 1;
        
        while (row < numRows && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Found the target element
            } else if (matrix[row][col] < target) {
                // Move down to the next row (elements in the current row are smaller)
                row++;
            } else {
                // Move left to the previous column (elements in the current column are larger)
                col--;
            }
        }
        
        return false;
	} 
} 
