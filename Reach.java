/* Reach fast
Chef is standing at coordinate A while Chefina is standing at coordinate B.In one step, Chef can increase or decrease his coordinate by at most K.
Determine the minimum number of steps required by Chef to reach Chefina. */
import java.util.*;
import java.lang.*;
import java.io.*;

class Reach
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int k=sc.nextInt();
		    int diff=Math.abs(a-b);
		   int min=(int)Math.ceil((double)diff/k);
		    System.out.println(min);
		    
		}
	}
}
