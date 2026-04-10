 /*  
Chessboard Distance
The Chessboard Distance for any two points ((X_1, Y_1)) and ((X_2, Y_2)) on a Cartesian plane is defined as [(max(|X_1 - X_2|,; |Y_1 - Y_2|)] You are given two points ((X_1, Y_1)) and ((X_2, Y_2)). Output their Chessboard Distance.
Note that (|P|) denotes the absolute value of integer (P). For example, (|-4| = 4) and (|7| = 7).
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Chessboard_Distance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int x1=sc.nextInt();
		    int y1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y2=sc.nextInt();
		    int dx=Math.abs(y2-y1);
		    int dy=Math.abs(x2-x1);
		    System.out.println(Math.max(dx,dy));
		}

	}
}

