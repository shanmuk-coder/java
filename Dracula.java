/*

Dracula Eats
Eat, drink, and be scary

There are N spooky days left until Halloween. Dracula dines at a mysterious restaurant that changes its spooky menu daily.
  
He particularly enjoys what they serve on Tuesday. Today is Monday, so he wishes to calculate how many times he can indulge in his favourite menu in the next N days (including today) before Halloween.

Note that Dracula follows the standard 7‑day calendar, with Tuesday immediately following Monday.

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Dracula
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n=sc.nextInt();
		    int fullweeks=n/7;
		    int totalTuesdays;
		    int remainingDays=n%7;
		    if(remainingDays>=2)
		    {
		         totalTuesdays=fullweeks+1;
		    }
		    else
		    {
		        totalTuesdays=fullweeks;
		    }
		    System.out.println(totalTuesdays);
		}

	}
}
