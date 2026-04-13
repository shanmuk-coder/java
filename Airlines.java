/*
Airlines

An airline operates X aircraft every day. Each aircraft can carry up to 100 passengers.

One day, N passengers would like to travel to the same destination.

What is the minimum number of new planes that the airline must buy to carry all N passengers?
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Airlines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int x=sc.nextInt();
		    int n=sc.nextInt();
		    int total_passengers_of_day=x*100;
		    int min_passengers=n - total_passengers_of_day;
		    int min_planes=(min_passengers + 99)/100;
		    if(min_planes>0)
		    {
		        System.out.println(min_planes);
		    }
		    else
		    {
		        System.out.println(0);
		    }
		}
	}
}
