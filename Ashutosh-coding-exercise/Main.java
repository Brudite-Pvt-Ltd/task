/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
     static void spiralMatrix(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;
 
 
        while (k < m && l < n) {
        
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
 
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
 
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
 
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
	public static void main(String[] args) {
	int r=3;
	int c=3;
	int a[][]={{5,10,9},{2,6,7},{12,13,14}};
	spiralMatrix(r,c,a);
	}
}