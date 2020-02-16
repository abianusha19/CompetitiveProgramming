import java.util.*;
import java.util.Collections;
public class zeroMatrix
{
    static void changeRowColn(int matrix[][],int x,int y,int m,int n)
    {
        for(int j=0;j<n;j++)
        {
            if(matrix[x][j]!=0)
              matrix[x][j]=-1;
        }
        for(int i=0;i<m;i++)
        {
            if(matrix[i][y]!=0)
              matrix[i][y]=-1;
        }
    }
   static void checkZeroMatrix(int matrix[][],int m,int n)
   {
       for(int x=0;x<m;x++)
       {
           for(int y=0;y<n;y++)
           {
               if(matrix[x][y]==0)
                 changeRowColn(matrix,x,y,m,n);
           }
       }
   }
   static void display(int matrix[][],int m,int n)
   {
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(matrix[i][j]==-1)
               {
                   matrix[i][j]=0;
               }
               System.out.print(matrix[i][j]+" ");
           }
           System.out.print("\n");
       }
   }
    	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int m=sc.nextInt();
	    int n=sc.nextInt();
	    int matrix[][]=new int[m][n];
	    for(int i=0;i<m;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	           matrix[i][j]=sc.nextInt();
	           
	        }
	    }
	    checkZeroMatrix(matrix,m,n);
	    display(matrix,m,n);
	   
}
}
