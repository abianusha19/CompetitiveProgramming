import java.util.*;
import java.util.Collections;
public class rotateMatrix90
{
   static void rotateMatrix(int matrix[][],int n)
   {
       for(int x=0;x<n/2;x++)
       {
           for(int y=x;y<n-1-x;y++)
           {
               int temp=matrix[x][y];
               matrix[x][y]=matrix[y][n-1-x];
               matrix[y][n-1-x]=matrix[n-1-x][n-1-y];
               matrix[n-1-x][n-1-y]=matrix[n-1-y][x];
               matrix[n-1-y][x]=temp;
           }
       }
   }
   static void display(int matrix[][],int n)
   {
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               System.out.print(matrix[i][j]+" ");
           }
           System.out.print("\n");
       }
   }
    

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int matrix[][]=new int[n][n];
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	           matrix[i][j]=sc.nextInt();
	           
	        }
	    }
	    rotateMatrix(matrix,n);
	    display(matrix,n);
	   }
}
