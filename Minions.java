/* 
Mutated Minions

Gru has not been in the limelight for a long time and is, therefore, planning something particularly nefarious. Frustrated by his minions' incapability, which has kept him away from the limelight, he has built a transmogrifier — a machine that mutates minions.

Each minion has an intrinsic characteristic value (similar to DNA), which is an integer. The transmogrifier adds an integer K to each of the minions' characteristic values.

Gru knows that if the new characteristic value of a minion is divisible by 7, then it will have Wolverine-like mutations.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Minions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int count=0;
		    for(int j=0;j<n-1;j++)
		    {
		        int element=sc.nextInt();
		        element+=k;
		        if(element%7==0)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
